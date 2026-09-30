class OverloadingThree {

    void display(int number) {
        System.out.println("First method");
    }

    // This gives a compilation error
    // void display(int number) {
    //     System.out.println("Second method");
    // }

    public static void main(String[] args) {

        OverloadingThree obj = new OverloadingThree();

        obj.display(10);
    }
}