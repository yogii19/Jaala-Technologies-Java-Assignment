import java.util.Arrays;

class ReverseArray {

    static int[] reverse(int[] arr) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        System.out.println(Arrays.toString(reverse(arr)));
    }
}