package AST.Python;

import java.lang.reflect.Field;
import java.util.List;

public abstract class Root {

    protected String indent(int level) {
        return "  ".repeat(level);
    }

    public abstract String toString(int level);

    @Override
    public String toString() {
        return toString(0);
    }

    // مساعدة للطباعة الشجرية العامة
    protected String toTreeString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(this.getClass().getSimpleName()).append(" {\n");

        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(this);
                sb.append(indent(level + 1)).append(field.getName()).append(": ");

                if (value == null) {
                    sb.append("null\n");
                } else if (value instanceof Root) {
                    sb.append("\n").append(((Root) value).toTreeString(level + 2));
                } else if (value instanceof List<?>) {
                    sb.append("[\n");
                    for (Object item : (List<?>) value) {
                        if (item instanceof Root) {
                            sb.append(((Root) item).toTreeString(level + 2)).append("\n");
                        } else {
                            sb.append(indent(level + 2)).append(item).append("\n");
                        }
                    }
                    sb.append(indent(level + 1)).append("]\n");
                } else {
                    sb.append(value).append("\n");
                }

            } catch (IllegalAccessException e) {
                sb.append(indent(level + 1)).append("ACCESS ERROR\n");
            }
        }

        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}
