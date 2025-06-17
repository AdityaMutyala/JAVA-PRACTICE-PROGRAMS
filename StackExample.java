import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(100);
        st.push(200);
        st.push(300);
        System.out.println("Popped: " + st.pop());
        for (int i : st) System.out.println(i);
    }
}
