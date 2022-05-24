package array;

public class DuplicateArr {

    public static int duplicate(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 4 };

        int res = duplicate(arr);
        System.out.print(res);
    }
}
