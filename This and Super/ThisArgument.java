class ThisArgument {

    ThisArgument() {

        this(100);

        System.out.println("Default constructor");
    }

    ThisArgument(int number) {

        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {

        ThisArgument obj = new ThisArgument();
    }
}