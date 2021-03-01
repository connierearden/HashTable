import java.util.Arrays;

public class HandMadeHashTable {
    int capacity = 16;
    Node [] array = new Node[capacity];
    int memberCount;

    public int getIndexOfKey (String k) {
        return Math.abs(new Pair(k).hashCode() % capacity);
    }

    public void put (String k, Integer v) {
       int i =  getIndexOfKey(k);
       Pair pair = new Pair(k,v);
       Node node = this.array[i];
       node.add(pair);
    }

/*    public Pair get(String k) {
        return array[getIndex(k)].getKey().equals(k) ? array[getIndex(k)] : null;
    }*/

/*    public void remove (String k) {
        array[getIndex(k)]=null;
    }*/

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
