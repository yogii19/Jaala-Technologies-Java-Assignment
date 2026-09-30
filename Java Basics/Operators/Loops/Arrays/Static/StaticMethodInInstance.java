class StaticMethodInInstance {

    static void method1() {
        System.out.println("Static Method 1");
    }

    static void method2() {
        System.out.println("Static Method 2");
    }

    void display() {

        method1();
        method2();
    }

    public static void main(String[] args) {

        StaticMethodInInstance obj = new StaticMethodInInstance();

        obj.display();
    }
}