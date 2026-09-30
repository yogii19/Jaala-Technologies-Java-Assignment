class ProtectedAccess {

    protected int number = 100;
    protected String name = "Yogesh";

    protected void display() {
        System.out.println("This is a protected method");
    }

    public static void main(String[] args) {

        ProtectedAccess obj = new ProtectedAccess();

        System.out.println("Number: " + obj.number);
        System.out.println("Name: " + obj.name);

        obj.display();

        ProtectedChild child = new ProtectedChild();
        child.show();
    }
}

class ProtectedChild extends ProtectedAccess {

    void show() {

        System.out.println("Accessing protected members in child class:");
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);

        display();
    }
}