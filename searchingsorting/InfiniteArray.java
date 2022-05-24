package searchingsorting;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 12, 23, 34, 41, 90 };
        int target = 12;
        System.out.println(findAns(arr, target));
    }

    static int findAns(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
