package SortingAlgorithm;
import java.util.*;
//Ascending order; 
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements into the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Sorting Array: " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }






    
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the index of the smallest element in the unsorted part
            int minIndex = getMinIndex(arr, i, arr.length - 1);
            // Swap the found minimum element with the first element of the unsorted part
            swap(arr, i, minIndex);
        }
    }

    static int getMinIndex(int[] arr, int start, int end) {
        int min = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }
}
// Descendingorder

// import java.util.*;

// public class SelectionSort {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter elements into the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         System.out.println("Original Array: " + Arrays.toString(arr));
//         selectionSort(arr);
//         System.out.println("After Sorting Array (Descending Order): " + Arrays.toString(arr));
//     }

//     static void swap(int[] arr, int s, int e) {
//         int temp = arr[s];
//         arr[s] = arr[e];
//         arr[e] = temp;
//     }
    
//     static void selectionSort(int[] arr) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             // Find the index of the maximum element in the unsorted part
//             int maxIndex = getMaxIndex(arr, i, arr.length - 1);
//             // Swap the found maximum element with the first element of the unsorted part
//             swap(arr, i, maxIndex);
//         }
//     }

//     static int getMaxIndex(int[] arr, int start, int end) {
//         int max = start;
//         for (int i = start + 1; i <= end; i++) {
//             if (arr[max] < arr[i]) { // Find the maximum element
//                 max = i;
//             }
//         }
//         return max;
//     }
// }
