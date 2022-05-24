package array;

import java.util.Scanner;

public class ArrayChallenge1 {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5, 9, 78, 15 };
        int sum = 0;
        int find;
        int flag = 0;
        int temp1, temp2;
        temp1 = temp2 = A[0];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find: ");
        find = in.nextInt();
        for (int x : A) {
            sum += x;
            if (x == find) {
                flag = 1;
            }
            if (x > temp1) {
                temp2 = temp1;
                temp1 = x;
            } else if (x > temp2) {
                temp2 = x;
            }
        }
        if (flag == 1) {
            System.out.println("The number is found");
        } else {
            System.out.println("The number is not found");
        }
        System.out.println("Greatest number is" + temp1);
        System.out.println("2nd Greatest number is" + temp2);
        System.out.println(sum);
    }
}
