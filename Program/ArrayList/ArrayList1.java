Great! Here are some more complex examples using `ArrayList` in Java:

### 1. **Using Generics for Type Safety**
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Trying to add a String will cause a compile-time error
        // numbers.add("Hello"); // ❌ Error

        System.out.println(numbers);
    }
}
```

### 2. **Handling Concurrent Modifications**
If you try to modify an `ArrayList` while iterating over it using a loop, you may get `ConcurrentModificationException`. Here's how to avoid it using an **Iterator**:
```java
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");

        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("Eraser")) {
                iterator.remove(); // Correct way to remove items while iterating
            }
        }

        System.out.println(items); // Output: [Pen, Notebook]
    }
}
```

### 3. **Finding the Maximum Value in a List**
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);

        int maxNumber = Collections.max(numbers);
        System.out.println("Max number: " + maxNumber); // Output: 89
    }
}
```

### 4. **Using `ArrayList` in Multi-Threaded Environment**
To make `ArrayList` thread-safe, use `Collections.synchronizedList()`:
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("Task 1");
        syncList.add("Task 2");
        syncList.add("Task 3");

        synchronized (syncList) {
            for (String task : syncList) {
                System.out.println(task);
            }
        }
    }
}
```

### 5. **Convert `ArrayList` to an Array**
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        String[] array = languages.toArray(new String[0]);
        for (String lang : array) {
            System.out.println(lang);
        }
    }
}
```

Would you like examples of sorting, searching, or more advanced operations with `ArrayList`? I’m happy to help!
