For left rotation, the formula needs to adjust the index to shift elements to the left instead of right.

 🔄 Formula 

  rotated[(i + k) % n] = arr[i];  // (Right rotation)
  rotated[(i - k + n) % n] = arr[i];  // (Left rotation)


### 🔍 **How It Works**
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


