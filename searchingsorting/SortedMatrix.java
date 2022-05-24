// package searchingsorting;

// public class SortedMatrix {
// public static void main(String[] args) {

// }

// static int[] binarySearch(int[][] matrix, int row, int colS, int colE, int
// target) {
// while (colS <= colE) {
// int mid = (colS + colE) / 2;
// if (matrix[row][mid] == target) {
// return new int[] { row, mid };
// }
// if (matrix[row][mid] < target) {
// colS = mid + 1;
// } else {
// colE = mid - 1;
// }
// }
// return new int[] { -1, -1 };
// }

// static int[] search(int[][] matrix, int target) {
// int rows = matrix.length;
// int cols = matrix[0].length;

// if (rows == 1) {
// binarySearch(matrix, 0, 0, cols - 1, target);
// }
// int rowS = 0;
// int rowE = rows - 1;
// int midC = cols / 2;

// while (rowS < (rowE - 1)) {

// }
// }
// }
