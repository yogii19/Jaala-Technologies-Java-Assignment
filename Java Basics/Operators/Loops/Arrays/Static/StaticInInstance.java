class StaticInInstance {

    static int number1 = 10;
    static int number2 = 20;

    void display() {

        System.out.println(number1);
        System.out.println(number2);
    }

    public static void main(String[] args) {

        StaticInInstance obj = new StaticInInstance();

        obj.display();
    }
}