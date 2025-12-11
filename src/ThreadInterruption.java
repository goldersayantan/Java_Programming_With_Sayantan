class MyThread1 extends Thread {
    public void run()   {
        try {
            for(int i = 0; i <= 5; i++) {
                System.out.println("Thread: " + i);
                Thread.sleep(2000);
            }
        }catch(Exception e) {
            System.out.println("Thread was interrupted.");
        }
    }
}

public class ThreadInterruption {
    public static void main(String[] args)  {
        MyThread1 t1 = new MyThread1();
        t1.start();

        try {
            Thread.sleep(1000);
        }catch(Exception e) {

        }
        t1.interrupt();
    }
}