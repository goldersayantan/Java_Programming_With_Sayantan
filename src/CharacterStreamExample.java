import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args)  {
        try {
            FileReader in = new FileReader("D:\\Java Study Materials\\Java Code Practice\\src\\input.txt");
            FileWriter out = new FileWriter("Output.txt");
            int data;
            while((data = in.read()) != -1) {
                out.write(data);
            }
            System.out.println("File written successfully");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
