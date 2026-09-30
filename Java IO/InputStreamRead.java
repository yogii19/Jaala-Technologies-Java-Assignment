import java.io.FileInputStream;
import java.io.IOException;

class InputStreamRead {

    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream("input.txt");

        int data;

        while ((data = input.read()) != -1) {
            System.out.print((char) data);
        }

        input.close();
    }
}