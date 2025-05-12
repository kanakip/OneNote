I'd be happy to explain each of the Stream operations in Java, along with examples.

# Intermediate Operations
1. filter()
- Returns a new Stream containing only the elements that match a given predicate.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
System.out.println(evenNumbers); // [2, 4]

---------------

import java.util.*;
class GFG {
      public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
        list.stream()
            .filter(num -> num % 5 == 0)
            .forEach(System.out::println);
    }
}

// 20
---------------

import java.util.stream.Stream;
class GFG {
    public static void main(String[] args)
    {
        // Creating a stream of strings
        Stream<String> stream = Stream.of(
            "Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");
       
        stream
            .filter(
                str -> Character.isUpperCase(str.charAt(1)))
            .forEach(System.out::println);
    }
}

// 
fOr
GEEKSQUIZ


-----------------


import java.util.stream.Stream;
class GFG {
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of(
            "Geeks", "foR", "GeEksQuiz", "GeeksforGeeks");
        stream.filter(str -> str.endsWith("s"))
            .forEach(System.out::println);
    }
}

// o/p
Geeks
GeeksforGeeks

----------------

2. map()
- Returns a new Stream containing the results of applying a given function to each element.

Example:

List<String> words = Arrays.asList("hello", "world");
List<String> uppercaseWords = words.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
System.out.println(uppercaseWords); // [HELLO, WORLD]

-------------------------


1. Basic Transformation Using map()
Transforming a list of numbers by squaring each value.

import java.util.List;
import java.util.stream.Collectors;
public class MapExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
            .map(n -> n * n) // Square each number
            .collect(Collectors.toList());
        System.out.println(squaredNumbers); // Output: [1, 4, 9, 16, 25]
    }
}

--------------------


2. Converting Strings to Uppercase
Convert all names in a list to uppercase.

import java.util.List;
import java.util.stream.Collectors;
public class StringMapExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<String> upperCaseNames = names.stream()
            .map(String::toUpperCase) // Convert to uppercase
            .collect(Collectors.toList());
        System.out.println(upperCaseNames); // Output: [ALICE, BOB, CHARLIE]
    }
}

-----------------------------


3. Extracting Length of Each String
Compute the length of each word in a list.

import java.util.List;
import java.util.stream.Collectors;
public class StringLengthExample {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "Streams", "Map");
        List<Integer> wordLengths = words.stream()
            .map(String::length) // Get length of each word
            .collect(Collectors.toList());
        System.out.println(wordLengths); // Output: [4, 7, 3]
    }
}

----------------------


4. Transforming Objects
Convert a list of Employees to a list of Employee names.

import java.util.List;
import java.util.stream.Collectors;
class Employee {
    String name;
    int age;
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ObjectMapExample {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", 30),
            new Employee("Bob", 25),
            new Employee("Charlie", 28)
        );
        List<String> employeeNames = employees.stream()
            .map(emp -> emp.name) // Extract names
            .collect(Collectors.toList());
        System.out.println(employeeNames); // Output: [Alice, Bob, Charlie]
    }
}

------------------

5. Converting Numbers to Strings
Convert integers into formatted strings.

import java.util.List;
import java.util.stream.Collectors;
public class NumberToStringExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 10, 15);
        List<String> formattedNumbers = numbers.stream()
            .map(n -> "Value: " + n) // Format numbers
            .collect(Collectors.toList());
        System.out.println(formattedNumbers); // Output: [Value: 5, Value: 10, Value: 15]
    }
}


--------------------------


different ways conditions


1. Filtering Employees Before Mapping
Extract names of employees whose age is greater than 25.

List<String> employeeNames = employees.stream()
    .filter(emp -> emp.age > 25) // Filtering based on age
    .map(emp -> emp.name) // Extracting names
    .collect(Collectors.toList());
System.out.println(employeeNames); // Output: Names of employees older than 25

----------------------

2. Converting Names to Uppercase
Modify names to be in uppercase.

List<String> employeeNames = employees.stream()
    .map(emp -> emp.name.toUpperCase()) // Convert names to uppercase
    .collect(Collectors.toList());
System.out.println(employeeNames); // Output: [ALICE, BOB, CHARLIE]

-------------------

3. Sorting Employee Names
Sort the names in alphabetical order.

List<String> sortedNames = employees.stream()
    .map(emp -> emp.name)
    .sorted() // Sorting the names
    .collect(Collectors.toList());
System.out.println(sortedNames); // Output: Alphabetically sorted names

---------------


4. Removing Duplicate Names
Ensure names appear only once.

List<String> distinctNames = employees.stream()
    .map(emp -> emp.name)
    .distinct() // Remove duplicates
    .collect(Collectors.toList());
System.out.println(distinctNames); // Output: Unique employee names

--------------------

5. Limiting the Number of Results
Retrieve only the first two employee names.

List<String> limitedNames = employees.stream()
    .map(emp -> emp.name)
    .limit(2) // Get only first 2 names
    .collect(Collectors.toList());
System.out.println(limitedNames); // Output: First two employee names

-----------------

6. Counting the Number of Employees
Find out how many employees exist.

long employeeCount = employees.stream()
    .map(emp -> emp.name)
    .count(); // Count the total number of employees
System.out.println(employeeCount); // Output: Total number of employees

------------------

7. Concatenating Names into a Single String
Join employee names into one formatted string.

String allNames = employees.stream()
    .map(emp -> emp.name)
    .collect(Collectors.joining(", "));
System.out.println(allNames); // Output: "Alice, Bob, Charlie"
These variations show how you can manipulate the map() function in different ways to suit various interview scenarios. Would you like me to add more advanced use cases?


-------------------------------------------


import java.util.Arrays;
import java.util.stream.Collectors;
class Employee {
    String name;
    int age;
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ArrayMapExample {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", 30),
            new Employee("Bob", 25),
            new Employee("Charlie", 28)
        };
        // Extract employee names from an array
        String[] employeeNames = Arrays.stream(employees)
            .map(emp -> emp.name) // Transform Employee object to name
            .toArray(String[]::new); // Collect results in an array
        System.out.println(Arrays.toString(employeeNames)); // Output: [Alice, Bob, Charlie]
    }
}

Key Differences:
	1. Instead of List<Employee>, we used an array Employee[].
	2. Used Arrays.stream(employees) instead of .stream().
	3. Used .toArray(String[]::new) instead of .collect(Collectors.toList()).


----------------------------------------

3. flatMap()
- Similar to map(), but flattens the resulting Stream.

It combines two operations:
	1. Mapping (transforming elements) — Like map(), it applies a function to each element of a collection.
	2. Flattening — Unlike map(), it does not return a nested structure (like an array of arrays). Instead, it flattens the results into a single collection.


Example:

List<List<String>> nestedWords = Arrays.asList(
        Arrays.asList("hello", "world"),
        Arrays.asList("java", "streams")
);
List<String> flatWords = nestedWords.stream()
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
System.out.println(flatWords); // [hello, world, java, streams]


---------------------------------

import java.util.List;
import java.util.stream.Collectors;
public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = List.of(
            List.of("red", "green"),
            List.of("blue", "yellow")
        );
        List<String> flattenedList = listOfLists.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());
        System.out.println(flattenedList); // Output: [red, green, blue, yellow]
    }
}

---------------------------------------
Flattening Lists

import java.util.List;
import java.util.stream.Collectors;
public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = List.of(
            List.of("apple", "banana"),
            List.of("cherry", "date"),
            List.of("elderberry", "fig")
        );
        List<String> flattenedList = listOfLists.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());
        System.out.println(flattenedList);
    }
}

[apple, banana, cherry, date, elderberry, fig]

----------------------------------------------------------------------------
Transforming and Flattening Lists

import java.util.List;
import java.util.stream.Collectors;
public class FlatMapTransformation {
    public static void main(String[] args) {
        List<String> words = List.of("Hello", "World");
        List<Character> characters = words.stream()
            .flatMap(word -> word.chars().mapToObj(c -> (char) c))
            .collect(Collectors.toList());
        System.out.println(characters);
    }
}


[H, e, l, l, o, W, o, r, l, d]

--------------------------------------------------------------

Handling Objects

import java.util.List;
import java.util.stream.Collectors;
class Employee {
    String name;
    List<String> skills;
    Employee(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }
    List<String> getSkills() {
        return skills;
    }
}
public class FlatMapObjects {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", List.of("Java", "Spring")),
            new Employee("Bob", List.of("Python", "Django")),
            new Employee("Charlie", List.of("JavaScript", "React"))
        );
        List<String> allSkills = employees.stream()
            .flatMap(emp -> emp.getSkills().stream())
            .collect(Collectors.toList());
        System.out.println(allSkills);
    }
}


[Java, Spring, Python, Django, JavaScript, React]

--------------------------------------------


1. Filtering Employees Before Using flatMap
Condition: Extract skills only for employees whose names start with "A".

List<String> allSkills = employees.stream()
    .filter(emp -> emp.name.startsWith("A"))  // Filtering employees
    .flatMap(emp -> emp.getSkills().stream()) // Flattening skills
    .collect(Collectors.toList());
System.out.println(allSkills); // Output: Skills of employees whose names start with 'A'

----------------------------

2. Distinct Skills (Removing Duplicates)
Condition: Ensure no duplicate skills appear in the final list.

List<String> distinctSkills = employees.stream()
    .flatMap(emp -> emp.getSkills().stream())
    .distinct() // Remove duplicates
    .collect(Collectors.toList());
System.out.println(distinctSkills); // Output: Unique skills across all employees

---------------------------------

3. Limiting the Number of Results
Condition: Get only the first 3 skills.

List<String> limitedSkills = employees.stream()
    .flatMap(emp -> emp.getSkills().stream())
    .limit(3) // Get only the first 3 skills
    .collect(Collectors.toList());
System.out.println(limitedSkills); // Output: First 3 skills from the list

--------------------------

4. Sorting the Skills
Condition: Get a sorted list of skills alphabetically.

List<String> sortedSkills = employees.stream()
    .flatMap(emp -> emp.getSkills().stream())
    .sorted() // Sort skills in ascending order
    .collect(Collectors.toList());
System.out.println(sortedSkills); // Output: Alphabetically sorted skills

-----------------------------------

5. Counting the Number of Skills
Condition: Count the total number of skills across all employees.

long skillCount = employees.stream()
    .flatMap(emp -> emp.getSkills().stream())
    .count(); // Count total skills
System.out.println(skillCount); // Output: Number of skills in the list

---------------------------

6. Grouping Employees by Skills
Condition: Group employees by each skill.

Map<String, List<Employee>> skillToEmployees = employees.stream()
    .flatMap(emp -> emp.getSkills().stream().map(skill -> Map.entry(skill, emp)))
    .collect(Collectors.groupingBy(Map.Entry::getKey, 
        Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
System.out.println(skillToEmployees); // Output: Skill-to-Employee mapping

----------------------------------

4. distinct()
- Returns a new Stream containing only unique elements.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
List<Integer> uniqueNumbers = numbers.stream()
        .distinct()
        .collect(Collectors.toList());
System.out.println(uniqueNumbers); // [1, 2, 3, 4, 5]


5. sorted()
- Returns a new Stream containing elements sorted according to a given comparator.

Example:

List<String> words = Arrays.asList("hello", "world", "java", "streams");
List<String> sortedWords = words.stream()
        .sorted()
        .collect(Collectors.toList());
System.out.println(sortedWords); // [hello, java, streams, world]

6. limit()
- Returns a new Stream containing only the first n elements.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> limitedNumbers = numbers.stream()
        .limit(3)
        .collect(Collectors.toList());
System.out.println(limitedNumbers); // [1, 2, 3]

7. skip()
- Returns a new Stream containing all elements except the first n.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> skippedNumbers = numbers.stream()
        .skip(3)
        .collect(Collectors.toList());
System.out.println(skippedNumbers); // [4, 5]

8. takeWhile()
- Returns a new Stream containing elements from the original Stream as long as a given predicate is true.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> takenNumbers = numbers.stream()
        .takeWhile(n -> n < 4)
        .collect(Collectors.toList());
System.out.println(takenNumbers); // [1, 2, 3]

9. dropWhile()
- Returns a new Stream containing elements from the original Stream after a given predicate is false.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> droppedNumbers = numbers.stream()
        .dropWhile(n -> n < 4)
        .collect(Collectors.toList());
System.out.println(droppedNumbers); // [4, 5]


10. peek()
- Returns a new Stream that performs an action on each element as it is consumed.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream()
        .peek(System.out::println)
        .collect(Collectors.toList());
// prints: 1, 2, 3, 4, 5


# Terminal Operations
1. forEach()
- Applies a given action to each element of the Stream.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream()
        .forEach(System.out::println);
// prints: 1, 2, 3, 4, 5


2. collect()
- Accumulates the elements of the Stream into a collection, such as a List or Set.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> collectedNumbers = numbers.stream()
        .collect(Collectors.toList());
System.out.println(collectedNumbers); // [1, 2, 3, 4, 5]

3. reduce()
- Combines the elements of the Stream into a single result.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
        .reduce(0, (a, b) -> a + b);
System.out.println(sum); // 15


4. findFirst()
- Returns the first element of the Stream, or an empty Optional if the Stream is empty.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> firstNumber = numbers.stream()
        .findFirst();
System.out.println(firstNumber.get()); // 1


5. findAny()
- Returns any element of the Stream, or an empty Optional if the Stream is empty.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> anyNumber = numbers.stream()
        .findAny();
System.out.println(anyNumber.get()); // 1 (or any other number)


6. count()
- Returns the number of elements in the Stream.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
long count = numbers.stream()
        .count();
System.out.println(count); // 5


7. max()
- Returns the maximum element of the Stream, according to a given comparator.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int max = numbers.stream()
        .max(Integer::compare)
        .get();
System.out.println(max); // 5


8. min()
- Returns the minimum element of the Stream, according to a given comparator.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int min = numbers.stream()
        .min(Integer::compare)
        .get();
System.out.println(min); // 1


9. toArray()
- Returns an array containing the elements of the Stream.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Integer[] array = numbers.stream()
        .toArray(Integer[]::new);
System.out.println(Arrays.toString(array)); // [1, 2, 3, 4, 5]


10. toSet()
- Returns a Set containing the elements of the Stream.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Set<Integer> set = numbers.stream()
        .collect(Collectors.toSet());
System.out.println(set); // [1, 2, 3, 4, 5]


11. toList()
- Returns a List containing the elements of the Stream.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> list = numbers.stream()
        .collect(Collectors.toList());
System.out.println(list); // [1, 2, 3, 4, 5]


12. toMap()
- Returns a Map containing the elements of the Stream.

Example:

List<String> words = Arrays.asList("hello", "world");
Map<String, Integer> map = words.stream()
        .collect(Collectors.toMap(Function.identity(), String::length));
System.out.println(map); // {hello=5, world=5}


13. toCollection()
- Returns a Collection containing the elements of the Stream.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Collection<Integer> collection = numbers.stream()
        .collect(Collectors.toCollection(ArrayList::new));
System.out.println(collection); // [1, 2, 3, 4, 5]


---------------------------------------------------------------------------


Here are explanations for the other Stream operations:

# Parallel Operations
- parallel(): Returns a parallel Stream, which can be processed in parallel.
- sequential(): Returns a sequential Stream, which is processed sequentially.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.parallelStream()
        .forEach(System.out::println);



import java.util.stream.IntStream;
public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("Sequential Stream:");
        IntStream.range(1, 11)
                 .forEach(i -> System.out.println("Number: " + i + " - Thread: " + Thread.currentThread().getName()));
        System.out.println("\nParallel Stream:");
        IntStream.range(1, 11)
                 .parallel()
                 .forEach(i -> System.out.println("Number: " + i + " - Thread: " + Thread.currentThread().getName()));
    }
}



Sequential Stream:
Number: 1 - Thread: main
Number: 2 - Thread: main
Number: 3 - Thread: main
Number: 4 - Thread: main
Number: 5 - Thread: main
Number: 6 - Thread: main
Number: 7 - Thread: main
Number: 8 - Thread: main
Number: 9 - Thread: main
Number: 10 - Thread: main
Parallel Stream:
Number: 1 - Thread: ForkJoinPool.commonPool-worker-1
Number: 6 - Thread: ForkJoinPool.commonPool-worker-2
Number: 2 - Thread: ForkJoinPool.commonPool-worker-3
Number: 7 - Thread: ForkJoinPool.commonPool-worker-2
Number: 3 - Thread: ForkJoinPool.commonPool-worker-1
Number: 8 - Thread: ForkJoinPool.commonPool-worker-3
Number: 4 - Thread: ForkJoinPool.commonPool-worker-2
Number: 9 - Thread: ForkJoinPool.commonPool-worker-1
Number: 5 - Thread: ForkJoinPool.commonPool-worker-3
Number: 10 - Thread: ForkJoinPool.commonPool-worker-2



# Unordered Operations
- unordered(): Returns an unordered Stream, which can be processed in any order.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream()
        .unordered()
        .forEach(System.out::println);


# onClose Operations
- onClose(): Returns a Stream that will perform a given action when it is closed.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream()
        .onClose(() -> System.out.println("Stream closed"))
        .forEach(System.out::println);


# Iterator Operations
- iterator(): Returns an Iterator over the elements of the Stream.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Iterator<Integer> iterator = numbers.stream()
        .iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}


# Spliterator Operations
- spliterator(): Returns a Spliterator over the elements of the Stream.

Example:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Spliterator<Integer> spliterator = numbers.stream()
        .spliterator();
while (spliterator.tryAdvance(System.out::println)) {
    // do nothing
}

---------------------------------

After re-checking the Java documentation, I can confirm that the operations I listed earlier are the standard Stream operations available in Java.

However, there are some additional operations that can be performed on Streams using other classes and methods, such as:

- Stream.builder(): Returns a builder for a Stream.
- Stream.empty(): Returns an empty Stream.
- Stream.generate(): Returns a Stream generated by a supplier.
- Stream.iterate(): Returns a Stream generated by an iterative function.
- Stream.of(): Returns a Stream containing the given elements.
- Stream.concat(): Concatenates two Streams.

Additionally, there are some operations that can be performed on Streams using collectors, such as:

- Collectors.toList(): Accumulates the elements of the Stream into a List.
- Collectors.toSet(): Accumulates the elements of the Stream into a Set.
- Collectors.toMap(): Accumulates the elements of the Stream into a Map.
- Collectors.groupingBy(): Groups the elements of the Stream by a given function.
- Collectors.partitioningBy(): Partitions the elements of the Stream by a given predicate.

These are some of the additional operations that can be performed on Streams in Java. If you have any specific questions about these operations, feel free to ask!

