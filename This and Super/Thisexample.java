class Thisexample {

    int number = 100;
    String name = "Yogesh";

    void display() {

        System.out.println("Using this:");
        System.out.println(this.number);
        System.out.println(this.name);

        System.out.println("Without this:");
        System.out.println(number);
        System.out.println(name);
    }

    public static void main(String[] args) {

        Thisexample obj = new Thisexample();

        obj.display();
    }
}