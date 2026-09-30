import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class BufferedInput {

    public static void main(String[] args) throws IOException {

        FileInputStream file =
                new FileInputStream("input.txt");

        BufferedInputStream input =
                new BufferedInputStream(file);

        int data;

        while ((data = input.read()) != -1) {
            System.out.print((char) data);
        }

        input.close();
    }
}