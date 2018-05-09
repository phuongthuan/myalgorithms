package npt.algorithms.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 8, 5, 9, 7};

        selectionSort(arr, 7);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


    /**
     * Selection Sort. Lowest Sort. It take O(n^2) time complexity.
     */
    static void selectionSort(int arr[], int length) {
        for (int i = 0; i < length-1; i++) {
            int iMin = i;
            for (int j = i+1; j < length; j++) {
                if (arr[j] < arr[iMin]) {
                    iMin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[iMin];
            arr[iMin] = temp;
        }
    }

}
