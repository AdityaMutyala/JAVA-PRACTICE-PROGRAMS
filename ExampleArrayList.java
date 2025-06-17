
import java.util.*;

public class ExampleArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.remove("Banana");
        for (String s : list) System.out.println(s);
    }
}
