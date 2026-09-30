interface Test {

    int a = 10;
    int b = 20;
    int c = 30;
}

class InterfaceFields implements Test {

    public static void main(String[] args) {

        System.out.println("A: " + Test.a);
        System.out.println("B: " + Test.b);
        System.out.println("C: " + Test.c);
    }
}