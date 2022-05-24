package array;

public class UniqueArr {
    public static int unique(int arr[]) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        flag = false;
                        break;
                    } else
                        flag = true;
                }

            }
            if (flag) {
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 6, 8, 5, 2, 2, 8 };
        int res;
        res = unique(arr);
        System.out.println(res);

    }
}
