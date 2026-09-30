import java.io.FileWriter;
import java.io.IOException;

class FileWriterExample {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("output.txt");

        writer.write("Hello, this text is written using FileWriter.");

        writer.close();

        System.out.println("Data written successfully");
    }
}