class PrintVariables {

    static int staticNumber1 = 10;
    static int staticNumber2 = 20;

    int instanceNumber1 = 30;
    int instanceNumber2 = 40;

    public static void main(String[] args) {

        PrintVariables obj = new PrintVariables();

        System.out.println("Static variable 1: " + staticNumber1);
        System.out.println("Static variable 2: " + staticNumber2);

        System.out.println("Instance variable 1: " + obj.instanceNumber1);
        System.out.println("Instance variable 2: " + obj.instanceNumber2);
    }
}