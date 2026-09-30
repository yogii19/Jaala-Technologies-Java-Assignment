class PrivateExample {

    private int number = 100;
    private String name = "Yogesh";

    private void display() {
        System.out.println("Private method");
    }

    public static void main(String[] args) {

        PrivateExample obj = new PrivateExample();

        System.out.println("Number: " + obj.number);
        System.out.println("Name: " + obj.name);

        obj.display();
    }
}
class PrivateExample1 {

    private int number = 100;

    private void display() {
        System.out.println("Private method");
    }
}

class Child extends PrivateExample1 {

    void show() {

        // System.out.println(number);  // Error
        // display();                   // Error

        System.out.println("Private members cannot be accessed directly in child class.");
    }
}