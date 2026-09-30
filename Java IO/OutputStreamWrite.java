import java.io.FileOutputStream;
import java.io.IOException;

class OutputStreamWrite {

    public static void main(String[] args) throws IOException {

        FileOutputStream output =
                new FileOutputStream("output.txt");

        String text = "Hello, this is Java IO.";

        output.write(text.getBytes());

        output.close();

        System.out.println("Data written successfully");
    }
}