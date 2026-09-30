abstract class AbstractExample {

    abstract void show();

    void display() {
        System.out.println("This is a non-abstract method");
    }

    public static void main(String[] args) {
        System.out.println("Abstract class created successfully");
    }
}