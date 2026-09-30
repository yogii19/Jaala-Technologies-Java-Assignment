class OverloadingTwo {

    void display(int number) {
        System.out.println("Integer: " + number);
    }

    void display(int number, String name) {
        System.out.println("Integer: " + number);
        System.out.println("String: " + name);
    }

    public static void main(String[] args) {

        OverloadingTwo obj = new OverloadingTwo();

        obj.display(10);
        obj.display(20, "Yogesh");
    }
}