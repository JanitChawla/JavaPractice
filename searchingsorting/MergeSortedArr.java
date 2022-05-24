package searchingsorting;

import java.util.Arrays;

public class MergeSortedArr {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 10, 12 };
        int arr2[] = { 2, 6, 15, 20, 100 };
        int arr3[] = new int[arr.length + arr2.length];
        int i = 0;
        int k = 0;
        int n = arr.length;
        int m = arr2.length;
        int j = 0;
        while (j < m && i < n) {

            if (arr[i] <= arr2[j]) {
                arr3[k] = arr[i];
                i++;
                k++;
            } else if (arr2[j] < arr[i]) {
                arr3[k] = arr2[j];
                j++;
                k++;
            }

        }

        while (i < n) {
            arr3[k] = arr[i];
            i++;
            k++;
        }

        while (j < m) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(arr3));
    }
}
