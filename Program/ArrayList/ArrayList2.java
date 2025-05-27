Awesome! Here are some more advanced operations with `ArrayList`:

### 1. **Sorting Objects in an `ArrayList` Using a Comparator**
If you have a custom class, you can sort objects using a **Comparator**.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 22));

        // Sorting by age using a Comparator
        Collections.sort(people, Comparator.comparingInt(p -> p.age));

        System.out.println(people); // Output: [Charlie (22), Alice (25), Bob (30)]
    }
}
```

### 2. **Finding an Element Using `Binary Search`**
Binary search works when the list is sorted.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);

        Collections.sort(numbers); // Must be sorted before binary search
        int index = Collections.binarySearch(numbers, 5);

        System.out.println("Index of 5: " + index); // Output: Index of 5: 1
    }
}
```

### 3. **Removing All Even Numbers from an `ArrayList`**
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        numbers.removeIf(n -> n % 2 == 0); // Removes even numbers
        System.out.println(numbers); // Output: [15, 25]
    }
}
```

### 4. **Merging Two `ArrayLists`**
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("D");

        list1.addAll(list2);
        System.out.println(list1); // Output: [A, B, C, D]
    }
}
```

### 5. **Filtering Using Streams (Java 8+)**
```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .collect(Collectors.toList());

        System.out.println(filteredNames); // Output: [Alice]
    }
}
```

Would you like more challenges or real-world applications of `ArrayList`?
