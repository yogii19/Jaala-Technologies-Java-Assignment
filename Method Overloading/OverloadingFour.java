class OverloadingFour {

    void display(int number) {
        System.out.println("Integer: " + number);
    }

    void display(String name) {
        System.out.println("String: " + name);
    }

    public static void main(String[] args) {

        OverloadingFour obj = new OverloadingFour();

        obj.display(10);
        obj.display("Yogesh");
    }
}