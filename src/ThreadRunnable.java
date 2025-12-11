class MyRunnable implements Runnable {
    public void run()  {
        for(int i = 0; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class ThreadRunnable {
    public static void main(String[] args)  {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        for(int i = 0; i <= 5; i++) {
            System.out.println("Main: " + i);
        }
    }
}