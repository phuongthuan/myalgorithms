package npt.algorithms.recursion;

public class Main {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        int arr[] = {1, 2, 3, 4, 5, 7, 8};
        r.printArray(arr);
        int n = arr.length;
        r.reverseArray(arr, 0, n - 1);
        r.printArray(arr);
    }
}
