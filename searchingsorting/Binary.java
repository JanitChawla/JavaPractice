package searchingsorting;

public class Binary {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 7, 8, 10, 20, 35, 40 };

        int start = 0;
        int end = arr.length - 1;
        int n = 7;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < n) {
                start = mid + 1;
            } else if (arr[mid] > n) {
                end = mid - 1;
            } else if (arr[mid] == n) {
                System.out.println(mid);
                break;
            } else
                System.out.println("Not found");
        }
    }
}
