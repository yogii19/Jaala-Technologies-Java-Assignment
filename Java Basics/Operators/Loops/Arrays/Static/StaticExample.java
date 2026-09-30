class StaticExample {

    static int staticNumber1 = 10;
    static int staticNumber2 = 20;

    int instanceNumber1 = 30;
    int instanceNumber2 = 40;

    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {

        StaticExample obj = new StaticExample();

        staticMethod1();
        staticMethod2();

        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}