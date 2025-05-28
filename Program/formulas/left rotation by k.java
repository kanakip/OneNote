For left rotation, the formula needs to adjust the index to shift elements to the left instead of right.

 🔄 Formula 

  rotated[(i + k) % n] = arr[i];  // (Right rotation)
  rotated[(i - k + n) % n] = arr[i];  // (Left rotation)


 🔍 How It Works
- `(i - k + n) % n` ensures negative indices wrap around correctly.
- It moves each element **to the left** by `k` positions.

 🔄 Example
Given:  

arr = {1, 2, 3, 4, 5}, k = 2

Step-by-step mapping:

Index 0 → (0 - 2 + 5) % 5 = 3 → moves to index 3
Index 1 → (1 - 2 + 5) % 5 = 4 → moves to index 4
Index 2 → (2 - 2 + 5) % 5 = 0 → moves to index 0
Index 3 → (3 - 2 + 5) % 5 = 1 → moves to index 1
Index 4 → (4 - 2 + 5) % 5 = 2 → moves to index 2


🔹 **Final Left-Rotated Array: {3, 4, 5, 1, 2}



// ================================================================================

Of course! Here’s the **Java implementation** for **left rotation** using a temporary array:

 ✅ Method 1: Using Extra Array

import java.util.Arrays;

public class RotateLeft {
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k %= n; // To handle cases where k > n

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i - k + n) % n] = arr[i]; // Shift left
        }

        System.out.println("Left-Rotated Array: " + Arrays.toString(rotated));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateLeft(arr, k);
    }
}

Output: [3, 4, 5, 1, 2]

// -----------------------------------------------------
 
🚀 **Method 2: In-Place Rotation (Efficient)**
Instead of using extra space, we can rotate **in place** using the **three-reversal method**:


import java.util.Arrays;

public class RotateLeft {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k %= n;

        reverse(arr, 0, k - 1);   // Reverse first k elements
        reverse(arr, k, n - 1);   // Reverse remaining elements
        reverse(arr, 0, n - 1);   // Reverse whole array

        System.out.println("Left-Rotated Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateLeft(arr, k);
    }
}

Output: [3, 4, 5, 1, 2]


🔹 **Which Method is Best?**
- First method is easier but uses extra space (O(n)).
- Second method is more efficient (O(1) space) and works in-place.

Would you like a deeper breakdown of the steps? 😊


