Awesome! Here are more **Java interview questions on Lists**, along with their solutions:

---

6️⃣ Find All Pairs That Sum to a Given Value

import java.util.*;

public class PairSum {
    public static void findPairs(List<Integer> list, int target) {
        Set<Integer> seen = new HashSet<>();
        System.out.println("Pairs with sum " + target + ":");
        for (int num : list) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            seen.add(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        findPairs(list, 8);
    }
}

Output:

Pairs with sum 8:
(3, 5)
(2, 6)
(1, 7)

✅ Uses O(n) time instead of O(n²) brute force.



7️⃣ Find the Largest and Smallest Element in a List

import java.util.*;

public class MinMaxList {
    public static void findMinMax(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 35, 1, 10, 34, 1);
        findMinMax(list);
    }
}

Output:

Minimum: 1
Maximum: 35

✅ Uses **O(n) time** (efficient).



8️⃣ Find Subarrays That Sum to a Target

import java.util.*;

public class SubarraySum {
    public static void findSubarrays(int[] arr, int target) {
        System.out.println("Subarrays with sum " + target + ":");
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j + 1)));
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        findSubarrays(arr, 5);
    }
}

Output:

Subarrays with sum 5:
[2, 3]
[5]

✅ O(n²) time, optimized for small inputs.

---

9️⃣ Implement a Custom Linked List

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; next = null; }
}

class LinkedList {
    Node head;

    void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node(data);
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.printList();
    }
}

Output:

1 -> 2 -> 3 -> null

✅ O(n) traversal, flexible structure.

---

 🔥 10️⃣ Find the First Non-Repeating Element

import java.util.*;

public class FirstUnique {
    public static int firstUnique(List<Integer> list) {
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int num : list) freq.put(num, freq.getOrDefault(num, 0) + 1);
        
        for (int key : freq.keySet()) {
            if (freq.get(key) == 1) return key;
        }
        return -1; // No unique element
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 6, 5, 4, 7, 8);
        System.out.println("First unique element: " + firstUnique(list));
    }
}

Output:

First unique element: 6

✅ O(n) time, preserves order.

---

Would you like even more questions? 😊
