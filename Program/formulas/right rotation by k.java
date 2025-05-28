
rotated[(i + k) % n] = arr[i];  this is for right rotation correct???

Yes, exactly! That formula shifts each element **to the right** by `k` positions.

 🔍 How It Works
- `i` is the **current index** of an element in the original array.
- `(i + k) % n` gives the **new index** after shifting `k` places right.
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


🔹 Final Rotated Array:** `{4, 5, 1, 2, 3}`

