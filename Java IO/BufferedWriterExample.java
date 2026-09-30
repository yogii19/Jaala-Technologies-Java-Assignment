import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class BufferedWriterExample {

    public static void main(String[] args) throws IOException {

        BufferedWriter writer =
                new BufferedWriter(new FileWriter("output.txt"));

        writer.write("Hello from BufferedWriter.");
        writer.newLine();
        writer.write("Java IO is easy to understand.");

        writer.close();

        System.out.println("Data written successfully");
    }
}