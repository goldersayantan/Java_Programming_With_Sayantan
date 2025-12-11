import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args)  {
        try {
            FileInputStream in = new FileInputStream ("D:/Java Study Materials/Java Code Practice/src/bmw.jpg");
            FileOutputStream out = new FileOutputStream("output.jpg");

            int data;
            while((data = in.read()) != -1) {
                out.write(data);
            }
        }catch (Exception e)    {
            System.out.println(e);
        }
    }
}