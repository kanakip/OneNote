Got it! Here are some array programs in Java:

 1. Reverse an Array

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        System.out.println("Reversed Array: " + Arrays.toString(reversed));
    }
}


 2. Find the Largest Element in an Array

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 45, 22, 89, 33};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest Element: " + max);
    }
}


 3. Sort an Array

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}


 4. Remove Duplicates from an Array

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            set.add(num);
        }

        Integer[] uniqueArr = set.toArray(new Integer[0]);
        System.out.println("Array Without Duplicates: " + Arrays.toString(uniqueArr));
    }
}


Want something more complex? I can help with searching, matrix operations, or dynamic programming challenges!
