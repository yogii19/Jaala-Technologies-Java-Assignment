import java.util.Arrays;

class RemoveEl {

    static int[] remove(int[] arr, int value) {

        int[] result = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                result[j] = arr[i];
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        System.out.println(Arrays.toString(remove(arr, 30)));
    }
}