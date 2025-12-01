parser grammar PythonParser;

options { tokenVocab = PythonLexer; }

root
    : (single_input | file_input | eval_input)? EOF
    ;

single_input
    : NEWLINE
    | simple_stmt
    | compound_stmt NEWLINE
    ;

file_input
    : (NEWLINE | stmt)+
    ;

eval_input
    : testlist NEWLINE*
    ;

stmt
    : simple_stmt
    | compound_stmt
    ;

compound_stmt
    : IF cond = test COLON suite elif_clause* else_clause?                           # if_stmt
    | WHILE test COLON suite else_clause?                                            # while_stmt
    | ASYNC? FOR exprlist IN testlist COLON suite else_clause?                       # for_stmt
    | TRY COLON suite (except_clause+ else_clause? finally_clause? | finally_clause) # try_stmt
    | ASYNC? WITH with_item (COMMA with_item)* COLON suite                           # with_stmt
    | decorator* (classdef | funcdef)                                                # class_or_func_def_stmt
    ;

suite
    : simple_stmt
    | NEWLINE INDENT stmt+ DEDENT
    ;

decorator
    : AT dotted_name (LPAREN arglist? RPAREN)? NEWLINE
    ;

elif_clause
    : ELIF test COLON suite
    ;

else_clause
    : ELSE COLON suite
    ;

finally_clause
    : FINALLY COLON suite
    ;

with_item
    : test (AS expr)?
    ;

// except, class, func, parameters, statements, expressions...
except_clause
    : EXCEPT (
        test (
            {this.CheckVersion(2)}? COMMA name {this.SetVersion(2);}
            | {this.CheckVersion(3)}? AS name {this.SetVersion(3);}
        )?
    )? COLON suite
    ;

classdef
    : CLASS name (LBRACK arglist? RBRACK)? COLON suite
    ;

funcdef
    : ASYNC? DEF name LBRACE typedargslist? RBRACE (ARROW test)? COLON suite
    ;

// function parameters (simplified)
typedargslist
    : (def_parameters COMMA)? (args (COMMA def_parameters)? (COMMA kwargs)? | kwargs) COMMA?
    | def_parameters COMMA?
    ;

// --- missing helper rules (added) ---
exprlist
    : expr (COMMA expr)* COMMA?
    ;

def_parameters
    : def_parameter (COMMA def_parameter)*
    ;

def_parameter
    : name (EQ test)?   // note: EQ is '=' token in lexer
    ;

args
    : STAR name
    ;

kwargs
    : POWER name
    ;

// dotted_as_names / import_as_names (for import statements)
dotted_as_names
    : dotted_as_name (COMMA dotted_as_name)*
    ;

dotted_as_name
    : dotted_name (AS name)?
    ;

import_as_names
    : import_as_name (COMMA import_as_name)* COMMA?
    ;

import_as_name
    : name (AS name)?
    ;

// --- end added helper rules ---

// many productions follow: args, kwargs, simple_stmt, small_stmt, test, expr, atom, trailer, etc.
// below are key rules pasted/adapted and completed

simple_stmt
    : small_stmt (SEMI small_stmt)* SEMI? (NEWLINE | EOF)
    ;

small_stmt
    : testlist_star_expr assign_part? # expr_stmt
    | {this.CheckVersion(2)}? PRINT ( (test (COMMA test)* COMMA?) | RIGHT_SHIFT test ((COMMA test)+ COMMA?) ) {this.SetVersion(2);}                                  # print_stmt
    | DEL exprlist                                           # del_stmt
    | PASS                                                   # pass_stmt
    | BREAK                                                  # break_stmt
    | CONTINUE                                               # continue_stmt
    | RETURN testlist?                                       # return_stmt
    | RAISE (test (COMMA test (COMMA test)?)?)? (FROM test)? # raise_stmt
    | yield_expr                                             # yield_stmt
    | IMPORT dotted_as_names                                 # import_stmt
    | FROM ((DOT | ELLIPSIS)* dotted_name | (DOT | ELLIPSIS)+) IMPORT ( STAR | LPAREN import_as_names RPAREN | import_as_names )                                                                                  # from_stmt
    | GLOBAL name (COMMA name)*                                                        # global_stmt
    | {this.CheckVersion(2)}? EXEC expr (IN test (COMMA test)?)? {this.SetVersion(2);} # exec_stmt
    | ASSERT test (COMMA test)?                                                        # assert_stmt
    | {this.CheckVersion(3)}? NONLOCAL name (COMMA name)* {this.SetVersion(3);}        # nonlocal_stmt
    ;

testlist_star_expr
    : ((test | star_expr) COMMA)+ (test | star_expr)?
    | testlist
    ;

star_expr: STAR expr;

assign_part
    : EQ (testlist_star_expr (EQ testlist_star_expr)* (EQ yield_expr)? | yield_expr)
    | {this.CheckVersion(3)}? COLON test (EQ testlist)? {this.SetVersion(3);} // annassign Python3 rule
    | op = ( ADD_ASSIGN | SUB_ASSIGN | MULT_ASSIGN | AT_ASSIGN | SLASH | MOD_ASSIGN | AND_ASSIGN | OR_ASSIGN | XOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | POWER_ASSIGN | IDIV_ASSIGN ) (yield_expr | testlist)
    ;

// expr/test/atom productions — include the relevant ones from your original grammar
test
    : logical_test (IF logical_test ELSE test)?
    | LAMBDA varargslist? COLON test
    ;

varargslist
    : (vardef_parameters COMMA)? (varargs (COMMA vardef_parameters)? (COMMA varkwargs)? | varkwargs) COMMA?
    | vardef_parameters COMMA?
    ;

vardef_parameters
    : vardef_parameter (COMMA vardef_parameter)*
    ;

vardef_parameter
    : name (EQ test)?
    | STAR
    ;

varargs: STAR name;
varkwargs: POWER name;

logical_test
    : comparison
    | NOT logical_test
    | logical_test op = AND logical_test
    | logical_test op = OR logical_test
    ;

comparison
    : expr ( (LT | GT | EQUALS | GT_EQ | LT_EQ | NOT_EQ_1 | NOT_EQ_2 | (NOT? IN) | (IS (NOT)?) ) expr )*
    ;

// note: used token names from lexer: PLUS, MINUS, NOT_OP, STAR, DIV, MOD, IDIV, AT, LEFT_SHIFT, RIGHT_SHIFT, AND_OP, XOR, OR_OP, POWER
expr
    : AWAIT? atom trailer*
    | <assoc = right> expr op = POWER expr
    | op = (PLUS | MINUS | NOT_OP) expr
    | expr op = (STAR | SLASH | MOD | IDIV | AT) expr
    | expr op = (PLUS | MINUS) expr
    | expr op = (LEFT_SHIFT | RIGHT_SHIFT) expr
    | expr op = AND_OP expr
    | expr op = XOR expr
    | expr op = OR expr
    ;

atom
    : LPAREN (yield_expr | testlist_comp)? RPAREN
    | LBRACK testlist_comp? RBRACK
    | LBRACK dictorsetmaker? RBRACK
    | REVERSE_QUOTE testlist COMMA? REVERSE_QUOTE
    | ELLIPSIS
    | name
    | PRINT
    | EXEC
    | MINUS? number
    | NONE
    | STRING+
    ;

dictorsetmaker
    : (test COLON test | POWER expr) (COMMA (test COLON test | POWER expr))* COMMA?
    | test COLON test comp_for
    | testlist_comp
    ;

testlist_comp
    : (test | star_expr) (comp_for | (COMMA (test | star_expr))* COMMA?)
    ;

testlist
    : test (COMMA test)* COMMA?
    ;

dotted_name
    : dotted_name DOT name
    | name
    ;

name
    : NAME
    | TRUE
    | FALSE
    ;

number
    : integer
    | IMAG_NUMBER
    | FLOAT_NUMBER
    ;

integer
    : DECIMAL_INTEGER
    | OCT_INTEGER
    | HEX_INTEGER
    | BIN_INTEGER
    ;

yield_expr
    : YIELD yield_arg?
    ;

yield_arg
    : FROM test
    | testlist
    ;

// trailer/arguments/arglist/argument etc.
trailer
    : DOT name arguments?
    | arguments
    ;

arguments
    : RPAREN arglist? LPAREN
    | LBRACK subscriptlist RBRACK
    ;

arglist
    : argument (COMMA argument)* COMMA?
    ;

argument
    : test (comp_for | EQ test)?
    | (POWER | STAR) test
    ;

// comprehensions helpers
comp_for
    : FOR exprlist IN testlist (comp_for | comp_if)?
    ;

comp_if
    : IF test (comp_for | comp_if)?
    ;

// subscripts
subscriptlist
    : subscript (COMMA subscript)* COMMA?
    ;

subscript
    : test
    | test? COLON test? (COLON test?)?
    ;

// remaining productions (slices, comprehensions, imports, etc.) can be added as needed.
