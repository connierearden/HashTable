import java.util.Arrays;

public class HandMadeHashTable {
    int capacity = 16;
    Pair [] array = new Pair[capacity];
    int memberCount;

    public int getIndex (String k) {
        return Math.abs(new Pair(k).hashCode() % capacity);
    }

    public void put (String k, Integer v) {
        array[getIndex(k)] = new Pair(k,v);
        memberCount++;
    }

    public Pair get(String k) {
        return array[getIndex(k)].getKey().equals(k) ? array[getIndex(k)] : null;
    }

    public void remove (String k) {
        array[getIndex(k)]=null;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
