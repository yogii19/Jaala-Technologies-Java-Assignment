import java.util.Arrays;

class InsertElement {

    static int[] insert(int[] arr, int value, int position) {

        int[] result = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            result[i] = arr[i];
        }

        result[position] = value;

        for (int i = position; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 40, 50};

        System.out.println(Arrays.toString(insert(arr, 30, 2)));
    }
}