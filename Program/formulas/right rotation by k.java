
rotated[(i + k) % n] = arr[i];  this is for right rotation correct???

Yes, exactly! That formula shifts each element **to the right** by `k` positions.

 🔍 How It Works
- `i` is the **current index** of an element in the original array.
- `(i + k) % n` gives the **new index** after shifting k places right.
- This ensures that when `i + k` exceeds `n`, it wraps around using `% n`.

 🔄 Example
Let’s say we have:

arr = {1, 2, 3, 4, 5}, k = 2

Step-by-step mapping:

Index 0 → (0 + 2) % 5 = 2 → moves to index 2
Index 1 → (1 + 2) % 5 = 3 → moves to index 3
Index 2 → (2 + 2) % 5 = 4 → moves to index 4
Index 3 → (3 + 2) % 5 = 0 → moves to index 0
Index 4 → (4 + 2) % 5 = 1 → moves to index 1


🔹 Final Rotated Array:  {4, 5, 1, 2, 3}


// --------------------------------------------



Of course! Here’s the **Java implementation for right rotation, similar to what I did for left rotation.



 ✅ Method 1: Using Extra Array (Simple Approach)

import java.util.Arrays;

public class RotateRight {
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k %= n; // To handle cases where k > n

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i]; // Shift right
        }

        System.out.println("Right-Rotated Array: " + Arrays.toString(rotated));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateRight(arr, k);
    }
}

Output: [4, 5, 1, 2, 3]

// =================------------------------------

🚀 Method 2: In-Place Rotation (Efficient)
This method rotates in **O(1) space** by reversing parts of the array.

import java.util.Arrays;

public class RotateRight {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k %= n;

        reverse(arr, 0, n - 1);   // Reverse whole array
        reverse(arr, 0, k - 1);   // Reverse first k elements
        reverse(arr, k, n - 1);   // Reverse remaining elements

        System.out.println("Right-Rotated Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateRight(arr, k);
    }
}

Output: [4, 5, 1, 2, 3]

🔹 Comparison
- First method uses extra space (`O(n)`) but is straightforward.
- Second method works in-place (`O(1) space`) and is more efficient.

Would you like a breakdown of the logic behind the in-place method? 😊


