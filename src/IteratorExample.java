import java.util.Iterator;
import java.util.Vector;

public class IteratorExample  {
    public static void main(String[] args)   {
        Vector <String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.add("Orange");

        Iterator <String> i = v.iterator();
        while(i.hasNext())  {
            System.out.println(i.next());
        }
    }
}