abstract class Parent {

    abstract void show();

    void display() {
        System.out.println("Non-abstract method from Parent");
    }
}

class AbstractChild extends Parent {

    public static void main(String[] args) {

        Parent obj = new AbstractChild();

        obj.display();
    }

    @Override
    void show() {
        System.out.println("Abstract method implemented");
    }
}