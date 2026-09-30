class Findindex {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int value = 30;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Index: " + i);
                break;
            }
        }
    }
}