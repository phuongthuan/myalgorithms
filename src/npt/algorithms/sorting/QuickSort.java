package npt.algorithms.sorting;

class QuickSort {

    public static void main(String[] args) {
        int A[] = {10, 7, 8, 9, 1, 5};
        int n = A.length;
        QuickSort q = new QuickSort();
        q.quickSort(A, 0, n-1);
        printArray(A);
    }

    /**
     * Function implement quick sort.
     */
    void quickSort(int A[], int start, int end) {
        if (start < end) {
            int pi = partition(A, start, end);

            // Recursively sort elements before
            // partition and after partition
            quickSort(A, start, pi-1);
            quickSort(A, pi+1, end);
        }
    }

    /**
     * Function get pivot index.
     */
    int partition(int A[], int start, int end) {

        int pivot = A[end];
        int pIndex = start;

        for (int i = start; i < end; i++) {
            if (A[i] <= pivot) {
                //Swap A[i] and A[pIndex]
                int temp = A[i];
                A[i] = A[pIndex];
                A[pIndex] = temp;

                //Increase pIndex by 1.
                pIndex++;
            }
        }

        //Swap A[pIndex] and A[end] <- is pivot index.
        int temp = A[pIndex];
        A[pIndex] = A[end];
        A[end] = temp;

        return pIndex;
    }

    /**
     * A utility function to print array of size n
     */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}


