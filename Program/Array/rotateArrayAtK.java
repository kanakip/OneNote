
import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n; // Handle cases where k > n
        
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



The `k` value determines **how many steps** each element in the array moves forward, not just the range from index `0` to `k`.  

How It Works:
- Each element shifts exactly `k` positions forward, wrapping around when reaching the end.
- The calculation `(i + k) % n` ensures proper cyclic movement.

Example (k = 2, n = 5)
Original array:  
[1, 2, 3, 4, 5]

Each element shifts **2 steps forward**:

1 → index (0 + 2) % 5 → 2  
2 → index (1 + 2) % 5 → 3  
3 → index (2 + 2) % 5 → 4  
4 → index (3 + 2) % 5 → 0 _(wraps around!)_  
5 → index (4 + 2) % 5 → 1 _(wraps around!)_  

Final rotated array:  
[4, 5, 1, 2, 3]


Analogy
Think of a clock:  
- If it's 8 AM and you advance **6 hours**, it's now 2 PM _(not just from 8 to 6!)_.  
- Similarly, `k` moves **all elements** that many steps ahead, looping when needed.  

Hope that clears it up! 🚀  
Let me know if you’d like a different explanation.
