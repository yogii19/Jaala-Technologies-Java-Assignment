class ConstructorExample {

    ConstructorExample() {
        System.out.println("Default constructor");
    }

    ConstructorExample(int number) {
        System.out.println("One argument constructor: " + number);
    }

    ConstructorExample(int number, String name) {
        System.out.println("Two argument constructor: " + number + " " + name);
    }
}

public class Main {

    public static void main(String[] args) {

        ConstructorExample obj1 = new ConstructorExample();
        ConstructorExample obj2 = new ConstructorExample(100);
        ConstructorExample obj3 = new ConstructorExample(200, "Yogesh");
    }
}