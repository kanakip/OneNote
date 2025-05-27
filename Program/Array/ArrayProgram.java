Of course! Here are **even more array programs** for practice and interviews:



6. Find the Second Largest Element in an Array

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Largest Element: " + findSecondLargest(arr));
    }
}

🔹 **Sample Output:  
`Second Largest Element: 34`

-----------------------

7. Find the Intersection of Two Unsorted Arrays

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
        int[] arr1 = {7, 1, 5, 2, 3, 6};
        int[] arr2 = {3, 8, 6, 20, 7};
        System.out.println("Intersection: " + Arrays.toString(findIntersection(arr1, arr2)));
    }
}

🔹 **Sample Output:**  
`Intersection: [3, 6, 7]`

--------------------

8. Find the Union of Two Arrays

import java.util.Arrays;
import java.util.HashSet;

public class ArrayUnion {
    public static int[] findUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 1, 5, 2, 3, 6};
        int[] arr2 = {3, 8, 6, 20, 7};
        System.out.println("Union: " + Arrays.toString(findUnion(arr1, arr2)));
    }
}

🔹 **Sample Output:**  
`Union: [1, 2, 3, 5, 6, 7, 8, 20]`

------------------------------------

9. Find the First and Last Occurrence of an Element

public class FirstLastOccurrence {
    public static void findOccurrences(int[] arr, int key) {
        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (first == -1) first = i;
                last = i;
            }
        }

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 5, 2, 6};
        findOccurrences(arr, 2);
    }
}

🔹 **Sample Output:**  

First Occurrence: 1  
Last Occurrence: 6  


-----------------------------------

10. Find All Triplets in an Array That Sum to a Given Value

import java.util.Arrays;

public class TripletSum {
    public static void findTriplets(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);

        System.out.println("Triplets:");
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println("(" + arr[i] + ", " + arr[left] + ", " + arr[right] + ")");
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 3, 7, 5};
        int target = 10;
        findTriplets(arr, target);
    }
}

🔹 **Sample Output:**  
Triplets:
(1, 3, 6)
(1, 4, 5)
(2, 3, 5)
```

---------------------------------

These **additional array programs** cover **searching, sorting, hashing, and optimization techniques**. Need even tougher problems like **dynamic programming, matrix operations, or bit manipulation**? Let me know, I’d love to help! 🚀
