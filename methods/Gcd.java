package methods;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = great(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
    }

    static int great(int a, int b) {
        if (b == 0) {
            return a;
        }
        return great(b, a % b);
    }
}
