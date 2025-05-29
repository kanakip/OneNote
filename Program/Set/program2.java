Here are more Java programs based on Set with implementation and expected output:

6. Finding Common Elements Between Two Sets

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Banana", "Cherry", "Date"));

        set1.retainAll(set2);
        System.out.println("Common Elements: " + set1);
    }
}

Expected Output:

Common Elements: [Banana, Cherry]


---

7. Checking If a Set Is a Subset of Another

import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Is set1 a subset of set2? " + set2.containsAll(set1));
    }
}

Expected Output:

Is set1 a subset of set2? true


---

8. Finding the First and Last Elements in a TreeSet
  
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());
    }
}

Expected Output:

First Element: 10
Last Element: 50


---

9. Converting a Set to a List

import java.util.*;

public class SetToList {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Red", "Green", "Blue"));
        List<String> list = new ArrayList<>(set);

        System.out.println("List Elements: " + list);
    }
}

Expected Output:

List Elements: [Red, Green, Blue]

---

10. Finding Unique Characters in a String Using Set

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "programming";
        Set<Character> uniqueChars = new HashSet<>();

        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

        System.out.println("Unique Characters: " + uniqueChars);
    }
}

Expected Output:

Unique Characters: [r, g, m, i, n, p, o, a]
  
(Note: Order may vary due to `HashSet` behavior.)

---

These programs cover **subset checks, common elements, TreeSet operations, conversions, and unique character extraction**. You can explore more Java Set examples [here](https://www.geeksforgeeks.org/set-in-java/) and [here](https://www.programiz.com/java-programming/set). Let me know if you need additional variations or explanations! 🚀
