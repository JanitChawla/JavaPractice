package searchingsorting;

public class BubbleSort {

    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }

    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = arr[j];
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 5, 15, 1, 19 };

        bubble(arr);
        printArr(arr);
    }
}
