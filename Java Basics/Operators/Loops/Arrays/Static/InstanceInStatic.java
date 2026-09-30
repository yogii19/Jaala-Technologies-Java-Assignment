class InstanceInStatic {

    int number1 = 10;
    int number2 = 20;

    static void display() {

        InstanceInStatic obj = new InstanceInStatic();

        System.out.println(obj.number1);
        System.out.println(obj.number2);
    }

    public static void main(String[] args) {
        display();
    }
}