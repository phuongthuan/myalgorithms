package npt.algorithms.binarysearch;

public class Main {

    public static void main(String[] args) {

        //Giving an array.
        int A[] = {2, 4, 5, 6, 7, 9, 11, 16};

        int index = binarySearch(A, 0, 8, 7);

        if (index != -1) {
            System.out.println("Found number exists at index: " + index);
        }

        System.out.println("==========================\n");
        /*
         * Giving an array: A = [2, 4, 10, 10, 10, 18, 20]
         * Find the first number 10 in array.
         */
        int B[] = {2, 4, 10, 10, 10, 18, 20};

        int findFirst = findOccurrence(B, 7, 10, true); //findFirst.

        if (findFirst != -1) {
            System.out.println("Found first number exists at index: " + findFirst);
        }

        System.out.println("==========================\n");
        /*
         * Giving an array: C[] = {2, 4, 10, 10, 10, 10, 10, 18, 20};
         * Find the last number 10 in array.
         */
        int C[] = {2, 4, 10, 10, 10, 10, 10, 18, 20};
        int findLast = findOccurrence(C, 9, 10, false); //findLast.

        if (findLast != -1) {
            System.out.println("Found last number exists at index: " + findLast);
        }


        System.out.println("==========================\n");
        /*
         * Count occurrences of a number in a sorted
         * array with duplicates using Binary Search.
         *
         * Giving an array: X[] = {1,1,3,3,5,5,5,5,5,9,9,11};
         */
        int X[] = {1,1,3,3,5,5,5,5,5,9,9,11};
        int firstIndex = findOccurrence(X, 12, 5, true); //findFirst

        if (firstIndex == -1) {
            System.out.println("Count of 5 is 0");
        } else {
            int lastIndex = findOccurrence(X, 12, 5, false); //findLast
            int count = lastIndex - firstIndex + 1;
            System.out.println("Count of 5 is: " + count); // Expect 5.
        }









    }

    /**
     * Find index of the number by giving Array, number of element.
     * Using iterative.
     */
    static int binarySearch(int A[], int n, int x) {
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
    static int binarySearch(int A[], int low, int high, int x) {
        int mid = low + (high-low)/2; // Base condition.
        if (low > high) return -1;
        if (x == A[mid]) {
            return mid; //Found x, return and exit.
        } else if (x < A[mid]) {
            binarySearch(A, low, mid-1, x);
        } else {
            binarySearch(A, mid+1, high, x);
        }
        return -1;
    }

    /**
     * Giving an array: B[] = {2, 4, 10, 10, 10, 10, 10, 18, 20};
     * Find the last number 10 in array.
     */
    static int findOccurrence(int A[], int size, int x, boolean findFirst) {
        int low = 0;
        int high = size-1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high-low)/2; // (low+high) may overflow.
            if (x == A[mid]) {
                result = mid;
                if (findFirst) {
                    high = mid-1; // continue search first.
                } else {
                    low = mid + 1; // continue search last.
                }
            }
            else if (x > A[mid]) low = mid + 1;
            else high = mid -1;
        }
        return result;
    }
}
