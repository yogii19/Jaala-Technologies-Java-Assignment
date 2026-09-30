class Parent {

    Parent() {
        System.out.println("Parent default constructor");
    }

    Parent(int number) {
        System.out.println("Parent argument constructor: " + number);
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("Child constructor");
    }

    Child(int number) {
        super(number);
        System.out.println("Child argument constructor");
    }

    public static void main(String[] args) {

        Child obj1 = new Child();

        System.out.println();

        Child obj2 = new Child(100);
    }
}