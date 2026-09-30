class Parent {

    int number = 100;
    String name = "Parent";
}

class Child extends Parent {

    int number = 200;
    String name = "Child";

    void display() {

        System.out.println("Child number: " + number);
        System.out.println("Parent number: " + super.number);

        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }

    public static void main(String[] args) {

        Child obj = new Child();

        obj.display();
    }
}