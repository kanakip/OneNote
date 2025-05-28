Great! Let's go through the Java implementations for some of the important **List-based interview questions**:

---

1️⃣ Find the Missing Number in a Sorted List

import java.util.*;

public class MissingNumber {
    public static int findMissingNumber(List<Integer> list) {
        int n = list.size() + 1; // Since one number is missing
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers

        int listSum = list.stream().mapToInt(Integer::intValue).sum();
        return totalSum - listSum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10); // Missing 5
        System.out.println("Missing Number: " + findMissingNumber(list));
    }
}

Output:

Missing Number: 5

✅ This uses O(n) time and O(1) space.



2️⃣ Reverse a List Without Using Collections.reverse()

import java.util.*;

public class ReverseList {
    public static void reverseList(List<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            Collections.swap(list, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original List: " + list);
        reverseList(list);
        System.out.println("Reversed List: " + list);
    }
}

Output:

Original List: [1, 2, 3, 4, 5]
Reversed List: [5, 4, 3, 2, 1]

✅ O(n) time, in-place O(1) space.

---

3️⃣ Merge Two Sorted Lists

import java.util.*;

public class MergeSortedLists {
    public static List<Integer> mergeSorted(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i++));
            } else {
                merged.add(list2.get(j++));
            }
        }

        while (i < list1.size()) merged.add(list1.get(i++));
        while (j < list2.size()) merged.add(list2.get(j++));

        return merged;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);
        System.out.println("Merged List: " + mergeSorted(list1, list2));
    }
}

Output:

Merged List: [1, 2, 3, 4, 5, 6, 7, 8]

✅ O(n + m) time, O(n + m) space.

---

4️⃣ Detect Cycle in a Linked List (Floyd’s Cycle Detection)

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class DetectCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Moves 1 step
            fast = fast.next.next;    // Moves 2 steps
            if (slow == fast) return true; // Cycle detected
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head.next; // Creates a cycle

        System.out.println("Has Cycle? " + hasCycle(head));
    }
}

Output:

Has Cycle? true

✅ O(n) time, O(1) space (no extra memory needed).

---

5️⃣ Rotate a List `k` Times Without Using Collections.rotate()

import java.util.*;

public class RotateList {
    public static void rotateList(List<Integer> list, int k) {
        int n = list.size();
        k %= n; // Handles k > n
        reverse(list, 0, n - 1);
        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
    }

    private static void reverse(List<Integer> list, int start, int end) {
        while (start < end) {
            Collections.swap(list, start++, end--);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original List: " + list);
        rotateList(list, 2);
        System.out.println("Rotated by 2: " + list);
    }
}

Output:

Original List: [1, 2, 3, 4, 5]
Rotated by 2: [4, 5, 1, 2, 3]

✅ O(n) time, O(1) space (in-place).

---

Would you like more interview questions and solutions? 😊
