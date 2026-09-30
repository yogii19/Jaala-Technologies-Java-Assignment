class InstanceMethodInStatic {

    void method1() {
        System.out.println("Instance Method 1");
    }

    void method2() {
        System.out.println("Instance Method 2");
    }

    static void display() {

        InstanceMethodInStatic obj = new InstanceMethodInStatic();

        obj.method1();
        obj.method2();
    }

    public static void main(String[] args) {
        display();
    }
}