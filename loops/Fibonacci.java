package loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + ",");
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + ",");
        }
    }
}
