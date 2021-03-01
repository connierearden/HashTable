import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HandMadeHashTable table = new HandMadeHashTable();
        table.put("asdfas", 6);
        table.put("liasdf", 7);
        table.put("oasdf", 4);
        table.put("iwuenfq", 2);
        System.out.println(table);
/*        System.out.println(table.get("liasdf"));
        table.remove("asdfas");
        System.out.println(table);*/

/*        ArrayList<Pair> list = new ArrayList<>();
        System.out.println(Arrays.toString(list.toArray()));

        list.add(new Pair("sadf",5));
        System.out.println(Arrays.toString(list.toArray()));*/

    }
}
