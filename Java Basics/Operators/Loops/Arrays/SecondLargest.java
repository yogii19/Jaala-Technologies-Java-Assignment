class SecondLargest {

    static int findSecondLargest(int[] arr) {

        int largest = arr[0];
        int second = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 40, 20};

        System.out.println("Second largest: " + findSecondLargest(arr));
    }
}