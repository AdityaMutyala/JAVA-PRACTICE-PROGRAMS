import java.util.*;

public class ExampleLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(10);
        li.addFirst(5);
        li.addLast(20);
        li.removeFirst();
        for (int i : li) System.out.println(i);
    }
}
