import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedOutput {

    public static void main(String[] args) throws IOException {

        FileOutputStream file =
                new FileOutputStream("output.txt");

        BufferedOutputStream output =
                new BufferedOutputStream(file);

        String text = "Hello from BufferedOutputStream.";

        output.write(text.getBytes());

        output.close();

        System.out.println("Data written successfully");
    }
}