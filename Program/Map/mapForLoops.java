Absolutely! Here are different ways to iterate over a Map in Java:

1. Using `entrySet()` with a For-Each Loop

import java.util.*;

public class EntrySetIteration {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

Output:

Alice -> 25
Bob -> 30
Charlie -> 35

✅ Best when you need both keys and values.

---

2. Using `keySet()` to Iterate Over Keys

import java.util.*;

public class KeySetIteration {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }
    }
}

Output:

Key: Alice
Key: Bob
Key: Charlie

✅ Best when you only need keys.

---

3. Using `values()` to Iterate Over Values

import java.util.*;

public class ValuesIteration {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }
    }
}

Output:

Value: 25
Value: 30
Value: 35

✅ Best when you only need values.

---

4. Using `Iterator` with `entrySet()`

import java.util.*;

public class IteratorEntrySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

✅ Best when you need removal while iterating.

---

5. Using `forEach()` (Java 8)

import java.util.*;

public class ForEachIteration {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}

✅ **Most concise** and recommended for Java 8+.

---

6. Using Stream API (Java 8)

import java.util.*;
import java.util.stream.Collectors;

public class StreamIteration {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        map.entrySet().stream()
            .filter(entry -> entry.getValue() > 25)
            .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}

✅ Best when filtering or transforming data.

---

You can explore more details on **[GeeksforGeeks](https://www.geeksforgeeks.org/iterate-map-java/)**, **[Java Guides](https://www.javaguides.net/2018/12/different-ways-to-iterate-over-map-in-java.html)**, and **[Baeldung](https://www.baeldung.com/java-iterate-map)**. Let me know if you need further explanations! 🚀
