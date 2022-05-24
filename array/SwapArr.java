package array;

import java.util.Scanner;

public class SwapArr {
    public static void swapArr(int[] arr, int num) {
        for (int i = 0; i < num - 1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        swapArr(arr, n);
    }
}
