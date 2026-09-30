class PublicAccess {

    public int number = 100;
    public String name = "Yogesh";

    public void display() {
        System.out.println("This is a public method");
    }

    public static void main(String[] args) {

        PublicAccess obj = new PublicAccess();

        System.out.println("Number: " + obj.number);
        System.out.println("Name: " + obj.name);

        obj.display();

        PublicChild child = new PublicChild();
        child.show();
    }
}

class PublicChild extends PublicAccess {

    void show() {

        System.out.println("Accessing public members from child class:");
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);

        display();
    }
}