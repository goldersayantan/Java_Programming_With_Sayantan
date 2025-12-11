import java.util.Stack;

public class StackExample {
    public static void main(String[] args)  {
        Stack <String> st = new Stack <>();
        st.push("Apple");
        st.push("Banana");
        System.out.println(st);

        st.pop();
        System.out.println(st);
    }
}