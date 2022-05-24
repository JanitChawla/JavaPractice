package array;

public class TwoDimenArray {
    public static void main(String[] args) {
        int A[][] = new int[3][5];
        int B[][] = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 }, { 11, 12, 13, 14 } };
        int C[][];
        C = new int[5][5];

        int[][] D = new int[3][3];

        int[] E[] = new int[3][3];
        int[] F, G[];
        F = new int[3];
        G = new int[3][3];

        // JAgged Array
        int JaggedArray[][];
        JaggedArray = new int[3][];
        JaggedArray[0] = new int[3];
        JaggedArray[1] = new int[4];
        JaggedArray[2] = new int[5];

        for (int i = 0; i < JaggedArray.length; i++) {
            for (int j = 0; j < JaggedArray[i].length; j++) {
                System.out.print(JaggedArray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
