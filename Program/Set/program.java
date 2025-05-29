Here are some Java programs related to Set with implementation and expected output:

1. Creating and Printing a Set

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element

        System.out.println("Set Elements: " + set);
    }
}

Expected Output:

Set Elements: [Banana, Cherry, Apple]

(Note: Order may vary as `HashSet` does not maintain insertion order.)



2. Finding Union, Intersection, and Difference of Two Sets

import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // Union
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

        // Intersection
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet);

        // Difference
        Set<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + differenceSet);
    }
}

Expected Output:

Union: [1, 2, 3, 4, 5, 6, 7]
Intersection: [3, 4, 5]
Difference (set1 - set2): [1, 2]


---

3. Removing Duplicates from a List Using Set

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> uniqueSet = new HashSet<>(list);

        System.out.println("Unique Elements: " + uniqueSet);
    }
}

Expected Output:

Unique Elements: [1, 2, 3, 4, 5]


---

4. Sorting a Set Using TreeSet

import java.util.*;

public class SortedSetExample {
    public static void main(String[] args) {
        Set<Integer> sortedSet = new TreeSet<>(Arrays.asList(5, 3, 8, 1, 2));
        System.out.println("Sorted Set: " + sortedSet);
    }
}

Expected Output:

Sorted Set: [1, 2, 3, 5, 8]

(TreeSet maintains elements in sorted order.)

---

5. Checking if Two Sets Are Equal

import java.util.*;

public class SetEqualityCheck {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        System.out.println("Are sets equal? " + set1.equals(set2));
    }
}

Expected Output:

Are sets equal? true


---

These programs cover **basic operations, set manipulations, sorting, and comparisons**. Let me know if you need more examples or explanations! 🚀
