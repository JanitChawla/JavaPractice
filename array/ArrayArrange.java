package array;

import java.util.Scanner;

public class ArrayArrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int val = 1;
        int j = n - 1;
        for (int i = 0; i <= n / 2; i++, j--) {
            if (arr[i] == 0) {
                arr[i] = val;
                val = val + 1;
                if (i == n / 2)
                    break;
                arr[j] = val;
                val++;
            }

        }

        System.out.println("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
