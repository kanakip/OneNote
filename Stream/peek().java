The peek() method in Java Streams is an intermediate operation that allows you to perform an action on each element of the Stream without consuming the Stream. Here are some use cases for peek():

Debugging and Logging:
1. Logging elements: Use peek() to log each element in the Stream for debugging purposes.
2. Tracking execution: Use peek() to track the execution of the Stream pipeline.

Data Validation:
1. Checking for nulls: Use peek() to check for null elements in the Stream and throw an exception or perform some other action.
2. Validating data: Use peek() to validate data in the Stream, such as checking for invalid values or formats.

Side Effects:
1. Sending notifications: Use peek() to send notifications or alerts based on the elements in the Stream.
2. Updating external state: Use peek() to update external state, such as a database or a file, based on the elements in the Stream.

Auditing and Monitoring:
1. Auditing data: Use peek() to audit data in the Stream, such as tracking changes or updates.
2. Monitoring performance: Use peek() to monitor the performance of the Stream pipeline.

Other Use Cases:
1. Measuring execution time: Use peek() to measure the execution time of the Stream pipeline.
2. Handling exceptions: Use peek() to handle exceptions that occur during the execution of the Stream pipeline.

Remember that peek() is an intermediate operation, so it doesn't consume the Stream. It allows you to perform actions on each element without affecting the downstream operations.

The peek() method in Java Streams is an intermediate operation that allows you to perform an action on each element of the Stream without consuming the Stream. It's like a "sneak peek" at the elements.

Here are some examples of using peek():

Example 1: Logging Elements

import java.util.stream.Stream;
public class PeekExample1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Apple", "Banana", "Cherry");
        stream.peek(System.out::println)
                .forEach(System.out::println);
    }
}

This code will output:

Apple
Apple
Banana
Banana
Cherry
Cherry


As you can see, peek() allows us to log each element without consuming the Stream.

Example 2: Modifying Elements


import java.util.stream.Stream;
public class PeekExample2 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Apple", "Banana", "Cherry");
        stream.peek(s -> s = s.toUpperCase())
                .forEach(System.out::println);
    }
}

This code will output:

Apple
Banana
Cherry

The peek method does not modify the stream elements. It is generally used for debugging rather than transforming data. In your code:

stream.peek(s -> s = s.toUpperCase())
      .forEach(System.out::println);

Here, s = s.toUpperCase() assigns a new value to s, but it does not update the actual stream elements. So, the output will still be:

Apple
Banana
Cherry
Solution: Use map() Instead of peek()
If you want to convert elements to uppercase, you should use map() instead:

stream.map(String::toUpperCase)
      .forEach(System.out::println);
Correct Output:

APPLE
BANANA
CHERRY



Note that peek() doesn't modify the original Stream. The toUpperCase() method is called on each element, but the result is not stored anywhere.

Example 3: Throwing Exceptions

import java.util.stream.Stream;
public class PeekExample3 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Apple", "Banana", "Cherry");
        stream.peek(s -> {
            if (s.equals("Banana")) {
                throw new RuntimeException("Banana is not allowed!");
            }
        })
                .forEach(System.out::println);
    }
}


This code will throw a RuntimeException when it encounters the "Banana" element.

These examples demonstrate how peek() can be used to perform various actions on Stream elements without consuming the Stream.

