import java.util.Objects;

public class Pair {
    private String key;
    private Integer value;

    public Pair (String key) {
        this.key = key;
    }
    public Pair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;

        Pair pair = (Pair) o;

        return Objects.equals(key, pair.key);
    }

    @Override
    public int hashCode() {
        return 37* key.hashCode();
    }

    @Override
    public String toString() {
        return "{"+ key + " , " +value+"}";
    }
}
