class MissingNum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};

        int n = 10;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        System.out.println("Missing number: " + (expectedSum - actualSum));
    }
}