import java.io.IOException;

class ThrowsException {
    static void show() throws IOException {
        throw new IOException("Input issue found.");
    }

    public static void main(String[] args) {
        try {
            show();
        }catch(IOException e)   {
            System.out.println(e);
        }
    }
}