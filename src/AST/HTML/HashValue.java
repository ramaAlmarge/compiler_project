package AST.HTML;

public class HashValue implements ValuePart{
    String hash;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "HashValue{" +
                "hash='" + hash + '\'' +
                '}';
    }
}
