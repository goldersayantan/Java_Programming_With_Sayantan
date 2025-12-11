class Demo {
    public void finalize()  {
        System.out.println("object is being garbage collected.");
    }
}

public class GarbageCollection {
    public static void main(String[] args)  {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1 = null;
        d2 = null;

        System.gc();

    }
}