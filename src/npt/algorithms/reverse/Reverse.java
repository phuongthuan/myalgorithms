package npt.algorithms.reverse;

import java.util.ArrayList;
import java.util.List;

public class Reverse {

    public static void main(String[] args) {

        Reverse r = new Reverse();

        int arr[] = {1, 2, 3, 4, 5, 6};

        List<Integer> listInt = new ArrayList<>();
        listInt.add(6);
        listInt.add(2);
        listInt.add(5);
        listInt.add(7);
        listInt.add(1);
        listInt.add(8);
        listInt.add(4);


        System.out.println(listInt);
        r.removeOddNumber(listInt);
        System.out.println(listInt);

    }

    /**
     * Reverse element in ArrayList.
     */
    public void reverseArrayList(List<Integer> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = arrayList.get(i); // element
            arrayList.set(i, arrayList.get(size-1-i));
            arrayList.set(size-1-i, temp);
        }
    }

    /**
     * Reverse element in array.
     */
    public void reverseArray(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[size-1-i]; //swap
            arr[size-1-i] = temp; //swap

        }
    }

    /**
     * Print all element in array.
     */
    public void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]\n");
    }

    /**
     * Remove all odd number is List.
     */
    public List<Integer> removeOddNumber(List<Integer> listNums) {
        if (listNums.isEmpty()) throw new Error();
        List<Integer> toRemove = new ArrayList<>();

        for (int i = 0; i < listNums.size(); i++) {
            if (listNums.get(i) % 2 != 0) { // check odd number.
                toRemove.add(listNums.get(i)); // add odd number to toRemove list.
            }
        }
        listNums.removeAll(toRemove);
        return listNums;
    }

}
