import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args)  {
        HashMap <String, Integer> hm = new HashMap<>();
        hm.put("Alex", 18);
        hm.put("Adam", 19);
        hm.put("Bob", 18);
        System.out.println(hm);
    }
}