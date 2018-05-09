package npt.algorithms.binarysearch;

public class Main {

    public static void main(String[] args) {

        //Giving an array.
        int A[] = {2, 4, 5, 6, 7, 9, 11, 16};

        int index = BinarySearch(A, 0, 8, 7);

        if (index != -1) {
            System.out.println("Number 7 at index: " + index);
        }
    }

    /**
     * Find index of the number by giving Array, number of element.
     * Using iterative.
     */
    public static int BinarySearch(int A[], int n, int x) {
        int low = 0;
        int high = n-1;

        while (low <= high) {
            int mid = low + (high-low)/2; // (low+high) may overflow
            if (x == A[mid]) return mid; // Found x, return (exit)
            else if (x < A[mid]) high = mid-1; // x lies before mid
            else low = mid+1; // x lies after mid
        }
        return -1;
    }

    /**
     * Find index of the number by giving Array, number of element.
     * Using Recursive.
     */
    public static int BinarySearch(int A[], int low, int high, int x) {
        int mid = low + (high-low)/2; // Base condition.
        if (low > high) return -1;
        if (x == A[mid]) {
            return mid; //Found x, return and exit.
        } else if (x < A[mid]) {
            BinarySearch(A, low, mid-1, x);
        } else {
            BinarySearch(A, mid+1, high, x);
        }
        return -1;
    }
}
