package searchingsorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 1, 4 };
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int index = arr[i] - 1;
            if (arr[i] != arr[index]) {
                swap(arr, i, index);
            } else
                i++;
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
