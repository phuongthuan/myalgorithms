package npt.algorithms.recursion;


public class Reverse {

    /**
     * Reverse array using recursion.
     */
    public void reverseArray(int arr[], int start, int end) {
        if (start >= end) return; // base condition.

        int temp = arr[start];
        arr[start] = arr[end]; //swap
        arr[end] = temp; //swap

        reverseArray(arr, start + 1, end - 1);
    }

    /**
     * Show all element in array.
     */
    public void printArray(int arr[]) {
        System.out.println("Reverse list: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
