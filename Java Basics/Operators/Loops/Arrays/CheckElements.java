class CheckElements {

    public static void main(String[] args) {

        int[] arr = {10, 12, 20, 23, 30};

        boolean found12 = false;
        boolean found23 = false;

        for (int value : arr) {

            if (value == 12) {
                found12 = true;
            }

            if (value == 23) {
                found23 = true;
            }
        }

        if (found12 && found23) {
            System.out.println("Array contains both 12 and 23");
        } else {
            System.out.println("Array does not contain both elements");
        }
    }
}