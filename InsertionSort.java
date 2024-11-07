package SortingAlgorithm;
import java.util.Arrays;
import java.util.Scanner;

/**
 * InsertionSort
 */
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements into the given array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // Start from the second element
            int key = arr[i]; // The element to be inserted
            int j = i - 1;
            

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert the key into the correct position
        }
    }
}
