package loops;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int r = 0; r < 2 * n; r++) {
            int cols = r > n ? 2 * n - r : r;
            for (int c = 0; c < cols; c++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
