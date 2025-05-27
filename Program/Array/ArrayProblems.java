Sure! Here are the **array programs with sample outputs**:


1. Rotate an Array

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.println("Rotated Array: " + Arrays.toString(rotated));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotate(arr, k);
    }
}

🔹 Sample Output:
Rotated Array: [4, 5, 1, 2, 3]

--------------------------

2. Merge Two Sorted Arrays Without Extra Space

import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;
        int i = m - 1, j = 0;

        while (i >= 0 && j < n) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--; j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Merged Arrays: " + Arrays.toString(arr1) + " " + Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        merge(arr1, arr2);
    }
}

🔹 Sample Output: 
`Merged Arrays: [1, 2, 3, 4] [5, 6, 7, 8]`

------------------------------------------------

3. Find the Smallest Missing Positive Number

import java.util.HashSet;

public class SmallestMissingNumber {
    public static int findSmallestMissing(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (num > 0) set.add(num);
        }

        int i = 1;
        while (set.contains(i)) {
            i++;
        }

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("Smallest Missing Positive Number: " + findSmallestMissing(arr));
    }
}

🔹 Sample Output:
Smallest Missing Positive Number: 2

---------------------------------

4. Find Pairs in an Array Whose Sum is Equal to a Given Number

import java.util.HashSet;

public class PairSum {
    public static void findPairs(int[] arr, int targetSum) {
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Pairs:");
        for (int num : arr) {
            int complement = targetSum - num;
            if (set.contains(complement)) {
                System.out.println("(" + num + ", " + complement + ")");
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int targetSum = 6;
        findPairs(arr, targetSum);
    }
}

🔹 Sample Output:
Pairs:
(5, 1)
(7, -1)
(5, 1)

------------------------

5. Find the Element that Appears Once (XOR Method)

public class SingleElement {
    public static int findSingle(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println("Unique Element: " + findSingle(arr));
    }
}

🔹 Sample Output:
Unique Element: 4

-------------------

These programs cover **sorting, searching, hashing, bitwise operations, and optimization techniques**. If you need even more challenges or explanations, I’d love to help! 🚀
