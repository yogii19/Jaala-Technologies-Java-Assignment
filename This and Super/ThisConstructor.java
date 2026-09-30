class ThisConstructor {

    ThisConstructor() {

        System.out.println("Default constructor called");
    }

    ThisConstructor(int number) {

        this();

        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {

        ThisConstructor obj = new ThisConstructor(100);
    }
}