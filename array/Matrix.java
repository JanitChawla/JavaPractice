package array;

public class Matrix {
    public static void main(String[] args) {
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int C[][] = new int[3][3];
        int D[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Multiplication of 2d array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                D[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    D[i][j] = D[i][j] + C[i][k] * B[k][j];
                }
            }
        }

    }
}
