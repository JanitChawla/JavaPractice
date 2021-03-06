package loops;

import java.util.Scanner;

public class NumbertoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();
        int r;
        String str = "";
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            str = str + r;
        }
        System.out.println(str);
        char c;
        for (int i = str.length() - 1; i >= 0; i--) {
            c = str.charAt(i);
            switch (c) {
                case '0':
                    System.out.println("Zero");
                    break;
                case '1':
                    System.out.println("One");
                    break;
                case '2':
                    System.out.println("Two");
                    break;

                default:
                    System.out.println("Executing");
                    break;
            }
        }
        sc.close();
    }
}
