package searchingsorting;

public class Cieling {

    static int CielingArr(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int n = 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (n < arr[mid]) {
                end = mid - 1;
            }
            if (n > arr[mid]) {
                start = mid + 1;
            } else if (arr[mid] == n) {
                return mid;
            }
        }
            return arr[start];
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };

        int res = CielingArr(arr);
        System.out.println(res);
    }
}
