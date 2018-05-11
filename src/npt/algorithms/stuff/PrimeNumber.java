package npt.algorithms.stuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Prime Number Test");
        System.out.println("=================");

        char ch;

        do {

            System.out.println("Operators");
            System.out.println("1. Insert sequence of numbers.");
            System.out.println("2. Show all prime number.");
            System.out.println("3. Remove all prime number.");
            System.out.println("4. Check number is prime or not.");
            System.out.println("5. Show sequence of numbers.");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Insert sequence of numbers from: ");
                    int start = scanner.nextInt();
                    System.out.println("to: ");
                    int end = scanner.nextInt();
                    insertSequenceOfNumber(list, start, end);
                    break;
                case 2:
                    System.out.println(getAllPrimeNumberInList(list));
                    break;
                case 3:
                    removePrimeNumberInArrayList(list);
                    break;
                case 4:
                    System.out.println("Enter a prime number: ");
                    int prime = scanner.nextInt();
                    if (checkPrime(prime)) {
                        System.out.println(prime + " is a prime number.");
                    } else {
                        System.out.println(prime + " is not a prime number.");
                    }
                    break;
                case 5:
                    display(list);
                    break;
                default:
                    System.out.println("Wrong empty!");
                    break;
            }

            System.out.println("\nDo you want to continue (Type Y or N) \n");
            ch = scanner.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }


    /**
     * Check number is prime or not.
     */
    public static boolean checkPrime(int prime) {
        if (prime <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(prime); i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Insert sequence of number.
     */
    public static void insertSequenceOfNumber(List<Integer> list, int start, int end) {
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
    }

    /**
     * Remove all of the prime number in list.
     */
    public static List<Integer> removePrimeNumberInArrayList(List<Integer> list) {
        boolean isPrime = false;
        for (int i = 0; i < list.size(); i++) {
            isPrime = checkPrime(list.get(i));
            if (isPrime) {
                list.remove(i);
            }
        }
        return list;
    }

    /**
     * Get all prime number in list.
     */
    public static List<Integer> getAllPrimeNumberInList(List<Integer> list) {
        List<Integer> primeList = new ArrayList<>();
        boolean isPrime = false;
        for (int i = 0; i < list.size(); i++) {
            isPrime = checkPrime(list.get(i));
            if (isPrime) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    /**
     * Show all numbers of sequence.
     */
    public static void display(List<Integer> list) {
        for (Integer u :
                list) {
            System.out.println(u);
        }
    }

}
