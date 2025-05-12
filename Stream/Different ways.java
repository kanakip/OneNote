
1. Using Set Instead of List (Removing Duplicates)
If we want unique employee names, we can use a Set:
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;
Set<String> employeeNames = Arrays.stream(employees)
    .map(emp -> emp.name)
    .collect(Collectors.toSet()); // Convert to Set
System.out.println(employeeNames); // Output: Unique employee names

------------------------------------


2. Using Queue or Deque (FIFO/LIFO Ordering)
For first-in-first-out (FIFO) or last-in-first-out (LIFO) ordering:

import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
Queue<String> employeeQueue = new LinkedList<>(
    Arrays.stream(employees)
        .map(emp -> emp.name)
        .collect(Collectors.toList()) // Convert to List first
);
System.out.println(employeeQueue.poll()); // Output: First employee name (FIFO)

--------------------------------------------

3. Using Map for Key-Value Transformations
If we want to store employees as key-value pairs, such as {name → age}:

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
Map<String, Integer> employeeMap = Arrays.stream(employees)
    .collect(Collectors.toMap(emp -> emp.name, emp -> emp.age));
System.out.println(employeeMap); // Output: {Alice=30, Bob=25, Charlie=28}

---------------------------

4. Using Stack (LIFO Order)
For last-in-first-out (LIFO) retrieval:

import java.util.Stack;
import java.util.Arrays;
Stack<String> employeeStack = new Stack<>();
employeeStack.addAll(
    Arrays.stream(employees)
        .map(emp -> emp.name)
        .collect(Collectors.toList()) // Convert to List first
);
System.out.println(employeeStack.pop()); // Output: Last employee name (LIFO)

-----------------

5. Using LinkedHashSet (Maintains Insertion Order)
To maintain the insertion order while ensuring unique values:

import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.stream.Collectors;
LinkedHashSet<String> orderedUniqueNames = Arrays.stream(employees)
    .map(emp -> emp.name)
    .collect(Collectors.toCollection(LinkedHashSet::new));
System.out.println(orderedUniqueNames); // Output: Unique employee names in order

--------------

6. Using ArrayDeque (Efficient Queue Operations)
For an optimized queue structure:

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;
Deque<String> employeeDeque = new ArrayDeque<>(
    Arrays.stream(employees)
        .map(emp -> emp.name)
        .collect(Collectors.toList()) // Convert to List first
);
System.out.println(employeeDeque.poll()); // Output: First employee name (FIFO)

-----------------------

7. Using Collectors.joining() (String Concatenation)
If we want a single formatted string:

String employeeNamesString = Arrays.stream(employees)
    .map(emp -> emp.name)
    .collect(Collectors.joining(", "));
System.out.println(employeeNamesString); // Output: "Alice, Bob, Charlie"


Each example demonstrates a unique approach based on different use cases. Do you have a preference for a particular type of collection or transformation? I can provide more details or advanced variations if needed! 😊
