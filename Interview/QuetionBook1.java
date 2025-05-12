1)what is difference between put and patch
The difference between **PUT** and **PATCH** lies in how they update resources in HTTP-based APIs:

1. PUT:
   - It replaces the entire resource with new data.
   - Requires all fields to be provided in the request.
   - If the resource doesn’t exist, it may create one (depending on API design).
   - Example: Updating a user's profile with PUT requires sending all attributes, even if only one changes.

2. PATCH:
   - It partially updates the resource.
   - Only modifies the specified fields instead of replacing everything.
   - More efficient for small updates.
   - Example: Changing just a user's email without affecting other details.

Key Difference:
- PUT → Full replacement.
- PATCH → Partial update.
-------------------------------------------------
  
2)how to implement pagination in spring boot

  Pagination in Spring Boot helps break large datasets into smaller, manageable chunks, improving performance and user experience. Here's how you can implement it:

1. Use Spring Data JPA's `Pageable` Interface
Spring Data JPA provides built-in pagination support through the `Pageable` interface.

Step 1: Define a Repository

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Page<User> findAll(Pageable pageable);
}

This method will return a paginated list of users.

Step 2: Modify the Service Layer

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public Page<User> getUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}

Step 3: Implement Controller to Accept Pagination Parameters
java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Page<User> getUsers(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "10") int size,
        @RequestParam(defaultValue = "id") String sortBy
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return userService.getUsers(pageable);
    }
}


2. Querying Data with Pagination
Now, you can send requests like:

GET /users?page=0&size=5&sortBy=name

- `page=0` → First page
- `size=5` → Five items per page
- `sortBy=name` → Sort by name

3. Response Format
Spring Boot returns paginated results automatically in JSON format:
```json
{
  "content": [ ... ],
  "totalPages": 10,
  "totalElements": 100,
  "size": 10,
  "number": 1,
  "first": false,
  "last": false
}

This makes pagination efficient and simple to implement in Spring Boot! 🚀 

Would you like to customize it further, like adding filters or handling edge cases? 😊

------------------------------------------------------

  
3)what are new features introduced in java 8?

  Java 8, released in **March 2014**, brought several powerful features that transformed Java development, especially around functional programming, performance, and API improvements. Here are some of the key additions:

1. Lambda Expressions (Functional Programming)
- Introduced a concise way to express anonymous functions.
- Example:
   (a, b) -> a + b

- Used extensively in **Streams, Collections, and Functional Interfaces**.

2. Stream API
- Enables processing of collections in a functional style.
- Supports filtering, mapping, reducing, and parallel execution.
- Example:

  List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
  names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
  

3. Functional Interfaces
- Interfaces with a single abstract method (SAM).
- Examples: `Runnable`, `Callable`, `Comparator`, `Function`.
- Java 8 introduced @FunctionalInterface annotation.

4. Default & Static Methods in Interfaces
- Allowed interfaces to have method implementations.
- Example:
  
  interface Vehicle {
      default void start() { System.out.println("Vehicle starting..."); }
  }


5. New Date & Time API (java.time package)
- Replaced `java.util.Date` with a modern and immutable API.
- Example:

  LocalDate today = LocalDate.now();
  LocalDate nextWeek = today.plusDays(7);


6. Optional Class (Avoid NullPointerException)
- Helps handle null values safely.
- Example:
  
  Optional<String> name = Optional.ofNullable(null);
  System.out.println(name.orElse("Default Name"));


7. Nashorn JavaScript Engine
- Enabled running JavaScript code within Java applications.

8. Collectors & Enhanced Concurrent Features
- Added `Collectors.toList()`, `Collectors.groupingBy()`, etc.
- Improved concurrent processing in `java.util.concurrent`.


------------------------------------------------
  
4)What is Lambda Function

  A Lambda Function in Java refers to an anonymous function that can be written in a concise and functional style. It was introduced in Java 8 and is primarily used to simplify code when working with functional interfaces.

Syntax of a Lambda Function:

(parameters) -> expression

Or, if there are multiple statements:

(parameters) -> {
    // Multiple statements
}

Example 1: Lambda Expression for Sorting a List

List<String> names = Arrays.asList("John", "Alice", "Bob");

// Using Lambda Expression with Comparator
Collections.sort(names, (a, b) -> a.compareTo(b));

System.out.println(names); // Output: [Alice, Bob, John]

Example 2: Using Lambda Expression in Functional Interface

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Implementing using Lambda
        MathOperation addition = (a, b) -> a + b;
        
        System.out.println("Sum: " + addition.operation(5, 3)); // Output: Sum: 8
    }
}

Key Advantages of Lambda Functions:

✔ Concise & Readable → Reduces boilerplate code.
✔ Functional Programming Support → Works with Streams, Collections.
✔ Improves Code Maintainability → No need for anonymous inner classes.
-----------------------------------------------------------------------------------
  
5)What is Functional Interface?

  A Functional Interface in Java is an interface that contains exactly one abstract method. It was introduced in Java 8 to support Lambda Expressions, enabling functional programming.

Key Characteristics of Functional Interfaces:

✔ Single Abstract Method (SAM) → Defines the behavior of the interface.
✔ Can Have Default & Static Methods → Allows additional functionalities.
✔ Works with Lambda Expressions → Simplifies implementation.
✔ Annotated with @FunctionalInterface (optional) → Helps avoid accidental addition of multiple abstract methods.

Example of Functional Interface:

@FunctionalInterface
interface MyFunction {
    void sayHello();
}

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda Expression implementing Functional Interface
        MyFunction func = () -> System.out.println("Hello, Functional Interface!");
        func.sayHello(); // Output: Hello, Functional Interface!
    }
}

Common Functional Interfaces in Java (java.util.function Package):

Predicate<T> → Accepts a value and returns true or false.

Function<T, R> → Accepts an input and returns a result.

Consumer<T> → Accepts an input and performs an action (no return).

Supplier<T> → Supplies a value (no input, only output).
-----------------------------------------------------------------------------
  
6)What is Optional Class in Java 8?
  
1. What is Optional in Java 8?
Optional<T> is a container class introduced in Java 8 to handle null values more effectively. It prevents NullPointerException by providing safe ways to handle missing values.

Think of Optional as a wrapper around a value. If the value is present, Optional gives access to it. If the value is absent, it avoids exceptions by providing alternate handling methods.

2. Why Was Optional Introduced?
Before Java 8, handling null was problematic:

String name = getName();  // Might return null
System.out.println(name.length());  // Risk of NullPointerException!
With Optional, we avoid this risk:

Optional<String> nameOpt = Optional.ofNullable(getName());
System.out.println(nameOpt.orElse("Default Name").length()); // Safe approach!
3. Creating an Optional Object
There are three ways to create an Optional:

1. Optional.of(value) → Used when value is NOT null
java
Optional<String> name = Optional.of("Pallavi");
System.out.println(name.get());  // Output: Pallavi
2. Optional.empty() → Represents an empty Optional

Optional<String> emptyOpt = Optional.empty();
System.out.println(emptyOpt.isPresent());  // Output: false
3. Optional.ofNullable(value) → Accepts null values

Optional<String> nullableOpt = Optional.ofNullable(null);
System.out.println(nullableOpt.orElse("Default Value")); // Output: Default Value
4. Common Methods in Optional
Here are the key methods used in Optional:

1. isPresent() → Checks if value exists

Optional<String> nameOpt = Optional.ofNullable("Pallavi");

if (nameOpt.isPresent()) {
    System.out.println("Value exists: " + nameOpt.get());
}

2. orElse() → Provides a default value if null

Optional<String> emptyOpt = Optional.ofNullable(null);
System.out.println(emptyOpt.orElse("Default Name"));  // Output: Default Name

3. orElseGet() → Uses a supplier if value is absent

Optional<String> emptyOpt = Optional.ofNullable(null);
System.out.println(emptyOpt.orElseGet(() -> "Generated Default Name")); // Output: Generated Default Name.

4. map() → Transforms value inside Optional

Optional<String> nameOpt = Optional.of("Pallavi");
Optional<String> upperNameOpt = nameOpt.map(String::toUpperCase);
System.out.println(upperNameOpt.orElse("Default")); // Output: PALLAVI

5. filter() → Applies a condition

Optional<Integer> numOpt = Optional.of(10);
numOpt.filter(n -> n > 5).ifPresent(System.out::println); // Output: 10

6. flatMap() → Used to transform Optional content

Optional<String> nameOpt = Optional.of("Pallavi");
Optional<String> upperNameOpt = nameOpt.flatMap(name -> Optional.of(name.toUpperCase()));
System.out.println(upperNameOpt.orElse("Default")); // Output: PALLAVI

5. Using Optional in Real-world Scenarios
  
1. Returning an Optional from a Method

public Optional<String> findUserById(int id) {
    if (id == 1) {
        return Optional.of("Pallavi");
    } else {
        return Optional.empty();
    }
}
This ensures safe handling of missing values.

2. Avoiding NullPointerException in API Responses

Optional<String> username = Optional.ofNullable(getUserNameFromDB());
System.out.println(username.orElse("Guest"));

6. Key Benefits of Using Optional
  ✅ Prevents NullPointerException → Avoids runtime errors. 
  ✅ Improves Code Readability → Makes intent clearer.
  ✅ Encourages Functional Programming → Supports map(), filter(), etc.
  ✅ Better API Design → Helps handle missing data gracefully.

7. When NOT to Use Optional
🚫 For fields in POJOs (Plain Old Java Objects) → Increases unnecessary overhead. 🚫 When null handling is trivial → No need for Optional if simple checks work.

Final Thoughts
Optional improves code safety and reduces null-related issues in Java 8. It’s widely used in APIs, Streams, and modern application design.
-----------------------------------------------------------------------------

  
7)What is Streams in java 8?
8)What is Future in java 8?
9)Ways achieve Threading in Java?
10)What is synchronized keyword and where do we use with methods or classes?
11)What is failfast and failsafe and how to avoid concurrent modification exception java?
12)What is ConcurrentHashmap?
13)How Hashmap works internally?
14)What are SOLID design Principles in java?
15)Difference between Set and List?
16)Which collections you have used in your project?
17)SQL Query to find second highest salary If you have customer table with cust id, name, 
salary without using limit?
18)Write a Program using stream API
I/p = Str string = Rahul Dravid
O/p = Str uniqueString = Rahul Dvi // remove duplicate elements from the words
