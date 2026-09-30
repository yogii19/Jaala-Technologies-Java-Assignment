import java.util.Arrays;

class RemoveDuplicates {

    static int[] removeDuplicates(int[] arr) {

        int[] temp = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (temp[j] == arr[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[count] = arr[i];
                count++;
            }
        }

        return Arrays.copyOf(temp, count);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40};

        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}