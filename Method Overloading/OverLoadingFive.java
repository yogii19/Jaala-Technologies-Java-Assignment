class OverLoadingFive {

    int display(int number) {
        return number;
    }

    // This is NOT allowed
    /*
    String display(int number) {
        return "Number: " + number;
    }
    */

    public static void main(String[] args) {

        OverLoadingFive obj = new OverLoadingFive();

        System.out.println(obj.display(10));
    }
}