Absolutely! Here are some **Java programming interview questions on Lists**, along with their solutions and expected output.

---

### 1️⃣ **Remove Duplicates from a List**
```java
import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list); // Maintain order while removing duplicates
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 6, 5);
        System.out.println("Original List: " + list);
        System.out.println("Without Duplicates: " + removeDuplicates(list));
    }
}

Output: Original List: [1, 2, 3, 2, 4, 3, 5, 6, 5]
    Without Duplicates: [1, 2, 3, 4, 5, 6]

// --------------------------------------------------------------

### 2️⃣ **Reverse a List**

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original List: " + list);

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
}

Output:

Original List: [1, 2, 3, 4, 5]
Reversed List: [5, 4, 3, 2, 1]

// -------------------------------------------------

3️⃣ Find the Second Largest Element

import java.util.*;

public class SecondLargest {
    public static int findSecondLargest(List<Integer> list) {
        Set<Integer> uniqueNums = new TreeSet<>(list); // Removes duplicates and sorts
        List<Integer> sortedList = new ArrayList<>(uniqueNums);
        return sortedList.size() > 1 ? sortedList.get(sortedList.size() - 2) : -1;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 35, 1, 10, 35, 1);
        System.out.println("Second Largest Element: " + findSecondLargest(list));
    }
}

Output:

Second Largest Element: 12

// ----------------------------------------------------------------

 4️⃣ Check If a List is a Palindrome

import java.util.*;

public class PalindromeList {
    public static boolean isPalindrome(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return list.equals(reversed);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
        System.out.println("Is Palindrome? " + isPalindrome(list));
    }
}

Output:

Is Palindrome? true


// -----------------------------------------------------------

5️⃣ Rotate a List `k` Times

import java.util.*;

public class RotateList {
    public static List<Integer> rotateList(List<Integer> list, int k) {
        int n = list.size();
        k %= n;
        Collections.rotate(list, k); // Built-in function to rotate
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original List: " + list);
        System.out.println("Rotated by 2: " + rotateList(new ArrayList<>(list), 2));
    }
}

Output:

Original List: [1, 2, 3, 4, 5]
Rotated by 2: [4, 5, 1, 2, 3]

---

Would you like more interview questions on Lists? 😊
