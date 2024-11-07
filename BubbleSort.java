

import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Original Array: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("After Sorting The Array Is: " + Arrays.toString(arr));
    }

    // bubbleSort method does not need to return a value
    static void bubbleSort(int[] arr) {
        int n = arr.length; // Initialize n with the length of the array
        for (int i = 0; i < n - 1; i++) { // Loop through all elements
            for (int j = 0; j < n - i - 1; j++) { // Loop through unsorted part of the array
                if (arr[j] > arr[j + 1]) { // Compare adjacent elements
                    // Swap if elements are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
