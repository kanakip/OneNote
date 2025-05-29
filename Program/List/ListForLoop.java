Here are different ways to iterate over a List in Java:

1. Using a Traditional For Loop

import java.util.*;

public class TraditionalForLoop {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

✅ Best when index-based access is needed.

---

2. Using an Enhanced For-Loop (For-Each)

import java.util.*;

public class EnhancedForLoop {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        for (String item : list) {
            System.out.println(item);
        }
    }
}

✅ Best for readability and simplicity.

---

3. Using an Iterator

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

✅ Best when you need to remove elements while iterating.

---

4. Using a ListIterator (Bidirectional Traversal)

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.println("Forward: " + listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println("Backward: " + listIterator.previous());
        }
    }
}

✅ Best for bidirectional iteration.

---

5. Using Java 8 `forEach()` Method

import java.util.*;

public class ForEachMethod {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        list.forEach(System.out::println);
    }
}

✅ Concise and recommended for Java 8+.

---

6. Using Stream API (Java 8)

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        list.stream().forEach(System.out::println);
    }
}

✅ Best when filtering or transforming data.

---

7. Using Parallel Stream (Java 8)

import java.util.*;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        list.parallelStream().forEach(System.out::println);
    }
}

✅ Best for parallel processing.

---

8. Using `toArray()` and Traditional For-Loop

import java.util.*;

public class ArrayIteration {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Object[] array = list.toArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

✅ Useful when index-based access is needed.

---

You can explore more details on **[GeeksforGeeks](https://www.geeksforgeeks.org/iterate-through-list-in-java/)**, **[Baeldung](https://www.baeldung.com/java-iterate-list)**, and **[Java Guides](https://www.javaguides.net/2018/06/different-ways-to-iterate-over-list-set-map-in-java.html)**. Let me know if you need further explanations! 🚀
