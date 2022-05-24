package array;

import java.util.Scanner;

public class Arrayfun {

    public static void Print(int[] arr) {

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = Input();
        Print(arr);

    }
}
