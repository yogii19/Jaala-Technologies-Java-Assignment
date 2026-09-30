class PrivateAccess {

    private int number = 100;
    private String name = "Yogesh";

    private void display() {
        System.out.println("This is a private method");
    }

    public static void main(String[] args) {

        PrivateAccess obj = new PrivateAccess();

        System.out.println("Number: " + obj.number);
        System.out.println("Name: " + obj.name);

        obj.display();
    }
}

class PrivateChild extends PrivateAccess {

    void show() {
        System.out.println("Private members cannot be accessed directly in child class.");
    }
}