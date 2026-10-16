import java.util.*;

public class Sorting {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 44. Selection Sort
    // Description: Sort ascending using selection sort.
    // Example input : arr=[13,46,24,52,20,9]
    // Example output: [9,13,20,24,46,52]
    public static void selectionSort(int[] arr) {
        // code
    }

    // easy
    // 45. Bubble Sort
    // Description: Sort ascending using bubble sort.
    // Example input : arr=[13,46,24,52,20,9]
    // Example output: [9,13,20,24,46,52]
    public static void bubbleSort(int[] arr) {
        // code
    }

    // easy
    // 46. Insertion Sort
    // Description: Sort ascending using insertion sort.
    // Example input : arr=[13,46,24,52,20,9]
    // Example output: [9,13,20,24,46,52]
    public static void insertionSort(int[] arr) {
        // code
    }

    // easy
    // 47. Recursive Bubble Sort
    // Description: Bubble sort using recursion.
    // Example input : arr=[5,3,1]
    // Example output: [1,3,5]
    public static void recursiveBubbleSort(int[] arr) {
        // code
    }

    // easy
    // 48. Recursive Insertion Sort
    // Description: Insertion sort using recursion.
    // Example input : arr=[5,3,1]
    // Example output: [1,3,5]
    public static void recursiveInsertionSort(int[] arr) {
        // code
    }

    // medium
    // 49. Merge Sort
    // Description: Sort ascending using merge sort.
    // Example input : arr=[9,4,7,6,3,1,5]
    // Example output: [1,3,4,5,6,7,9]
    public static void mergeSort(int[] arr) {
        // code
    }

    // medium
    // 50. Quick Sort
    // Description: Sort ascending using quick sort.
    // Example input : arr=[4,6,2,5,7,9,1,3]
    // Example output: [1,2,3,4,5,6,7,9]
    public static void quickSort(int[] arr) {
        // code
    }

    public static void main(String[] args) {
        int[] a = {13, 46, 24, 52, 20, 9};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
        a = new int[]{13, 46, 24, 52, 20, 9};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
        a = new int[]{13, 46, 24, 52, 20, 9};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
        a = new int[]{5, 3, 1};
        recursiveBubbleSort(a);
        System.out.println(Arrays.toString(a));
        a = new int[]{5, 3, 1};
        recursiveInsertionSort(a);
        System.out.println(Arrays.toString(a));
        a = new int[]{9, 4, 7, 6, 3, 1, 5};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
        a = new int[]{4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
