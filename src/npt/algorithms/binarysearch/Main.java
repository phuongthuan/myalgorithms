package npt.algorithms.binarysearch;

public class Main {

    public static void main(String[] args) {

        //Giving an array.
        int A[] = {2, 4, 5, 6, 7, 9, 11, 16};

        int index = BinarySearch(A, 8, 11);
        if (index != -1) {
            System.out.println("Number 11 at index: " + index);
        }
    }


    /**
     * Find index of the number by giving Array, number of element.
     */
    public static int BinarySearch(int A[], int n, int x) {
        int low = 0;
        int high = n-1;

        while (low <= high) {
            int mid = (low+high)/2;
            if (x == A[mid]) return mid;
            else if (x < A[mid]) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}