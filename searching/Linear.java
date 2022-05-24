package searching;

public class Linear {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int find = 99;

        int ans = linearSearch(A, find);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int x) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

}
