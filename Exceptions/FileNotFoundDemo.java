import java.io.FileInputStream;
import java.io.FileNotFoundException;

class FileNotFoundDemo {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream file =
                new FileInputStream("abc.txt");

        System.out.println("File opened");
    }
}