package array;

public class ArrayRotation {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5, 9, 78, 15 };
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }
        A[A.length - 1] = temp;
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }
}
