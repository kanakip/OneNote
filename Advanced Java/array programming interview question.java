Here are examples for each type of array programming interview question, along with explanations to help you out. Keep practicing, and you'll get even more confident in array handling!

1. Basic Array Questions:

- Find Maximum and Minimum in an Array:**

   int max = arr[0], min = arr[0];
   for (int i = 1; i < arr.length; i++) {
       if (arr[i] > max) max = arr[i];
       if (arr[i] < min) min = arr[i];
   }
   System.out.println("Max: " + max + ", Min: " + min);
   
   You’re off to a great start! Keep it up.
--------------------------------------------------------------------------------
- **Reverse an Array:**
   
   for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }

   Small steps lead to big results!
------------------------------------------------------------------------------
2. Searching and Sorting:

- Binary Search on a Sorted Array:

   int binarySearch(int[] arr, int target) {
       int left = 0, right = arr.length - 1;
       while (left <= right) {
           int mid = left + (right - left) / 2;
           if (arr[mid] == target) return mid;
           else if (arr[mid] < target) left = mid + 1;
           else right = mid - 1;
       }
       return -1;  // Element not found
   }

   *You’re doing amazing! Keep sharpening your skills.*
------------------------------------------------------------------------------
- **Bubble Sort Example:
   
   for (int i = 0; i < arr.length - 1; i++) {
       for (int j = 0; j < arr.length - i - 1; j++) {
           if (arr[j] > arr[j + 1]) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
           }
       }
   }
   ```
   You’ve got this! Your effort is paying off!

3. **Subarrays and Subsets:

- Subarray with Maximum Sum (Kadane's Algorithm):
   
   int maxSum = arr[0], currentSum = arr[0];
   for (int i = 1; i < arr.length; i++) {
       currentSum = Math.max(arr[i], currentSum + arr[i]);
       maxSum = Math.max(maxSum, currentSum);
   }
   System.out.println("Max Subarray Sum: " + maxSum);
  
   *Wow, this is next-level coding! Keep it going.*

- Find All Subsets of an Array:
   `
   for (int i = 0; i < (1 << arr.length); i++) {
       for (int j = 0; j < arr.length; j++) {
           if ((i & (1 << j)) != 0) {
               System.out.print(arr[j] + " ");
           }
       }
       System.out.println();
   }
 
   *Impressive work! Keep striving for more!*

4. Array Manipulation:

- Rotate a 2D Matrix by 90 Degrees:
  
   public void rotate(int[][] matrix) {
       int n = matrix.length;
       for (int i = 0; i < n / 2; i++) {
           for (int j = i; j < n - i - 1; j++) {
               int temp = matrix[i][j];
               matrix[i][j] = matrix[n - j - 1][i];
               matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
               matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
               matrix[j][n - i - 1] = temp;
           }
       }
   }
  
  Your skills are growing stronger!

5. Complex Array Problems:

- Find the Missing Number (1 to n):

   int n = arr.length + 1;
   int totalSum = n * (n + 1) / 2;
   int arraySum = 0;
   for (int num : arr) {
       arraySum += num;
   }
   System.out.println("Missing Number: " + (totalSum - arraySum));
  
 -Find Pairs with a Given Sum:**
   ```java
   Set<Integer> set = new HashSet<>();
   int target = 10;  // example target
   for (int num : arr) {
       if (set.contains(target - num)) {
           System.out.println("Pair: (" + num + ", " + (target - num) + ")");
       }
       set.add(num);
   }

   Amazing work! You’re mastering these challenges!

6. Matrix and 2D Array Examples:

- Search an Element in a Sorted 2D Matrix:
   
   public boolean searchMatrix(int[][] matrix, int target) {
       int row = 0, col = matrix[0].length - 1;
       while (row < matrix.length && col >= 0) {
           if (matrix[row][col] == target) return true;
           else if (matrix[row][col] > target) col--;
           else row++;
       }
       return false;
   }
   
   Great work on mastering 2D arrays! Keep it up!

7. Special Types of Arrays:

- Find Intersection of Two Arrays:

   Set<Integer> set = new HashSet<>();
   for (int num : arr1) set.add(num);
   for (int num : arr2) {
       if (set.contains(num)) {
           System.out.println("Intersection: " + num);
       }
   }

   Keep up the excellent work! You’re making great progress!

- Find Product of Array Except Itself:

   int[] left = new int[arr.length];
   int[] right = new int[arr.length];
   int[] prod = new int[arr.length];
   left[0] = 1;
   right[arr.length - 1] = 1;
   
   for (int i = 1; i < arr.length; i++) left[i] = left[i - 1] * arr[i - 1];
   for (int i = arr.length - 2; i >= 0; i--) right[i] = right[i + 1] * arr[i + 1];
   
   for (int i = 0; i < arr.length; i++) prod[i] = left[i] * right[i];

   *You’re tackling challenging problems head-on! Amazing job!*

Keep practicing these examples. Your consistent effort will definitely pay off! Keep believing in yourself! 🌟
