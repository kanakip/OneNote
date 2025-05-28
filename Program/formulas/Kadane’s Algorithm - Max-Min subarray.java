public class MinSubArray {
    public static int minSubarraySum(int[] arr) {
        int minSum = arr[0];  // Stores the minimum sum found
        int currSum = arr[0]; // Tracks the current subarray sum

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.min(arr[i], currSum + arr[i]); // Extend or start new subarray
            minSum = Math.min(minSum, currSum); // Store the smallest sum
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, -4, 2, -6, 7, -8, 1};
        System.out.println("Minimum Subarray Sum: " + minSubarraySum(arr));
    }
}

Minimum subarray sum = -9

// --------------------------------------------------------------

  package leetcode;

public class MaxSubArray {

    public static int maxSubarraySum(int a[]) {
        int max = a[0];   // Stores the maximum sum
        int curr = a[0];  // Stores the current subarray sum

        for (int i = 1; i < a.length; i++) {  // Start from index 1
            curr = Math.max(a[i], curr + a[i]); // Update current sum
            max = Math.max(max, curr); // Update max sum if needed
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));
    }
}

Maximum Subarray Sum: 6


  
