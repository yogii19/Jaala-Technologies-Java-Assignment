import java.util.Arrays;

class CopyArray {

    static int[] copyArray(int[] arr) {

        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        return newArray;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int[] result = copyArray(arr);

        System.out.println(Arrays.toString(result));
    }
}