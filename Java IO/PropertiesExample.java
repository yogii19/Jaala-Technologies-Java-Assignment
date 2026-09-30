import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class PropertiesExample {

    public static void main(String[] args) throws IOException {

        FileInputStream input =
                new FileInputStream("config.properties");

        Properties properties = new Properties();

        properties.load(input);

        System.out.println("Name: " + properties.getProperty("name"));
        System.out.println("Course: " + properties.getProperty("course"));
        System.out.println("Company: " + properties.getProperty("company"));

        input.close();
    }
}