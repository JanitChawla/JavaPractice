package searching;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 11, 2, 45, 67, 89, 90, 100 };
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
