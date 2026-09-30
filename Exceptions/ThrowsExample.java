class ThrowsExample {

    static void divide() throws ArithmeticException {

        int a = 10;
        int b = 0;

        System.out.println(a / b);
    }

    public static void main(String[] args) throws ArithmeticException {

        divide();
    }
}