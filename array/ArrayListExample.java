package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < 5; i++) {
            A.add(in.nextInt());
        }
        System.out.println(A);
        // for (int i = 0; i < 5; i++) {
        // System.out.println(A.get(i));
        // }
        A.add(2, 50);
        int val = A.get(3);

        System.out.println(val);

        A.set(4, 234);
    }
}
