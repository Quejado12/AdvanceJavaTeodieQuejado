import java.util.Arrays;
import java.util.Scanner;

public class Teodie {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void insertionSort(String[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            String key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the integer array: ");
        int n = scanner.nextInt();
        int[] intArray = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        selectionSort(intArray);
        System.out.println("Array after Selection Sort: " + Arrays.toString(intArray));

        System.out.print("Enter the number to search (Linear Search): ");
        int target = scanner.nextInt();
        int linearResult = linearSearch(intArray, target);
        if (linearResult != -1) {
            System.out.println("Element found at index (Linear Search): " + linearResult);
        } else {
            System.out.println("Element not found (Linear Search).");
        }

        System.out.print("Enter the number to search (Binary Search): ");
        target = scanner.nextInt();
        int binaryResult = binarySearch(intArray, target);
        if (binaryResult != -1) {
            System.out.println("Element found at index (Binary Search): " + binaryResult);
        } else {
            System.out.println("Element not found (Binary Search). Ensure the array is sorted.");
        }

        System.out.print("Enter the number of strings: ");
        int m = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] stringArray = new String[m];
        System.out.println("Enter " + m + " strings:");
        for (int i = 0; i < m; i++) {
            stringArray[i] = scanner.nextLine();
        }

        insertionSort(stringArray);
        System.out.println("Strings after Insertion Sort:");
        for (String str : stringArray) {
            System.out.println(str);
        }

        scanner.close();
    }
}
