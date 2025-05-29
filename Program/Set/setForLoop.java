Here are **different ways to iterate over a Set in Java:

1. Using Enhanced For-Loop (For-Each)

import java.util.*;

public class ForEachSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));

        for (String item : set) {
            System.out.println(item);
        }
    }
}

✅ Best for readability and simplicity.

---

2. Using Iterator

import java.util.*;

public class IteratorSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

✅ Best when you need to remove elements while iterating.

---

3. Using Java 8 `forEach()` Method

import java.util.*;

public class ForEachMethodSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));

        set.forEach(System.out::println);
    }
}

✅ Concise and recommended for Java 8+.

---

4. Using Stream API

import java.util.*;
import java.util.stream.Stream;

public class StreamSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));

        set.stream().forEach(System.out::println);
    }
}

✅ Best when filtering or transforming data.

---

5. Using `toArray()` and Traditional For-Loop

import java.util.*;

public class ArraySetIteration {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        Object[] array = set.toArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

✅ Useful when index-based access is needed.



You can explore more details on **[Baeldung](https://www.baeldung.com/java-iterate-set)** and **[Java Guides](https://www.javaguides.net/2018/06/different-ways-to-iterate-over-list-set-map-in-java.html)**. Let me know if you need further explanations! 🚀
