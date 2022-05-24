package loops;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int m = n;
        int r;
        // int count = 0;
        int sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
            // count++;
            // System.out.println(sum);
            // System.out.println(r);
        }
        System.out.println(sum);
        if (sum == m) {
            System.out.println("Armstrong");

        } else {
            System.out.println("Not Armstrong");
        }
        // System.out.println(count);
        sc.close();
    }
}
