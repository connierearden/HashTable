import java.util.ArrayList;
import java.util.Objects;

public class Node {
    ArrayList<Pair> node;

    public Node() {}

    public Node(ArrayList<Pair> node) {
        this.node = node;
    }

    public ArrayList<Pair> getNode() {
        return node;
    }

    public void setNode(ArrayList<Pair> node) {
        this.node = node;
    }

    public Pair findPairByKey (String key) {
        return node.stream().filter(p -> p.getKey().equals(key)).findFirst().orElse(null);
    }

    public void add (Pair p) {
        node.add(p);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node1 = (Node) o;

        return Objects.equals(node, node1.node);
    }

    @Override
    public int hashCode() {
        return node.size()>0 ? node.get(0).hashCode(): 0;
    }
}
