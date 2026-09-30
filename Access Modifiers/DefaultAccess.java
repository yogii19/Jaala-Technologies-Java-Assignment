class DefaultAccess {

    int number = 100;
    String name = "Yogesh";

    void display() {
        System.out.println("This is a default method");
    }

    public static void main(String[] args) {

        DefaultAccess obj = new DefaultAccess();

        System.out.println("Number: " + obj.number);
        System.out.println("Name: " + obj.name);

        obj.display();

        SamePackage obj2 = new SamePackage();
        obj2.show();
    }
}

class SamePackage {

    void show() {

        DefaultAccess obj = new DefaultAccess();

        System.out.println("Accessing default members from another class:");
        System.out.println("Number: " + obj.number);
        System.out.println("Name: " + obj.name);

        obj.display();
    }
}