class MethodCall {

    static void staticMethod() {
        System.out.println("This is a static method");
    }

    void instanceMethod() {
        System.out.println("This is an instance method");
    }

    public static void main(String[] args) {

        MethodCall obj = new MethodCall();

        staticMethod();
        obj.instanceMethod();
    }
}