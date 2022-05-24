package searchingsorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 4, 0, 2, 6 };
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (temp > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = arr[i];
                }
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }
}