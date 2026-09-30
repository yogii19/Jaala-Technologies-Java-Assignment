abstract class ParentClass {

    abstract void show();

    void display() {
        System.out.println("Non-abstract method");
    }
}

class ChildClass extends ParentClass {

    public static void main(String[] args) {

        ChildClass obj = new ChildClass();

        obj.show();
    }

    @Override
    void show() {
        System.out.println("Abstract method implemented in child class");
    }
}