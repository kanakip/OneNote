Absolutely! Array-based coding problems are quite common in technical interviews. Here are some frequently asked array programs:

 1. Find the Missing Number in an Array

public class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        System.out.println("Missing Number: " + findMissing(arr, n));
    }
}


 2. Find the Subarray with the Maximum Sum (Kadane’s Algorithm)**

public class MaxSubarraySum {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = arr[0], currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));
    }
}


 3. Find the First Duplicate Element

import java.util.HashSet;

public class FirstDuplicate {
    public static int findDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1; // No duplicate found
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println("First Duplicate: " + findDuplicate(arr));
    }
}


 4. Find the Intersection of Two Arrays

import java.util.Arrays;
import java.util.HashSet;

public class ArrayIntersection {
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {3, 7, 8, 10};
        System.out.println("Array Intersection: " + Arrays.toString(findIntersection(arr1, arr2)));
    }
}


 5. Find the Majority Element in an Array (Boyer-Moore Voting Algorithm)

public class MajorityElement {
    public static int findMajority(int[] arr) {
        int candidate = arr[0], count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }
        
        // Verify that it's actually a majority element
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return count > arr.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println("Majority Element: " + findMajority(arr));
    }
}

Majority Element: 4

// ---------------------

 To find the minimum occurring element in an array, we can use hashing or a frequency map approach.

✅ Method: Using HashMap (Efficient Approach

                         
import java.util.HashMap;

public class MinFrequencyElement {
    public static int findMinFrequencyElement(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        // Count occurrences of each element
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find the element with the minimum frequency
        int minFreq = Integer.MAX_VALUE;
        int minElement = -1;
        
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) < minFreq) {
                minFreq = freqMap.get(key);
                minElement = key;
            }
        }

        return minElement;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 5, 5, 6};
        System.out.println("Minimum Frequency Element: " + findMinFrequencyElement(arr));
    }
}
These problems cover searching, sorting, hash-based approaches, and optimized algorithms. Want to try something even trickier like matrix operations or dynamic programming challenges? Let me know what you need!
