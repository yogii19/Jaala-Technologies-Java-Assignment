interface Parent {

    void display();
}

interface Child extends Parent {

    void show();
}

class TestClass implements Child {

    public void display() {
        System.out.println("Display method from Parent");
    }

    public void show() {
        System.out.println("Show method from Child");
    }

    public static void main(String[] args) {

        TestClass obj = new TestClass();

        obj.display();
        obj.show();
    }
}