abstract class ParentDemo {

    abstract void show();

    void display() {
        System.out.println("This is a non-abstract method");
    }
}

class ChildDemo extends ParentDemo {

    public static void main(String[] args) {

        ChildDemo obj = new ChildDemo();

        obj.display();
    }

    @Override
    void show() {
        System.out.println("Abstract method implemented");
    }
}