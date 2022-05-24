package searchingsorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertion(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 100, -90, 9, 89 };

        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
