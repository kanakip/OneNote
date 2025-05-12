Here's an example of using Java Streams with an array:


import java.util.Arrays;

public class ArrayStreamExample {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Create a Stream from the array
        Arrays.stream(numbers)
                // Filter out even numbers
                .filter(n -> n % 2 != 0)
                // Double each number
                .map(n -> n * 2)
                // Print the results
                .forEach(System.out::println);
    }
}


This code will output:


2
6
10


Here's what's happening:

1. We create an array of integers numbers.
2. We use Arrays.stream(numbers) to create a Stream from the array.
3. We use filter(n -> n % 2 != 0) to filter out even numbers from the Stream.
4. We use map(n -> n * 2) to double each number in the Stream.
5. We use forEach(System.out::println) to print each number in the Stream.

Note that Arrays.stream() is a static method that creates a Stream from an array. This method is overloaded to work with different types of arrays, including primitive arrays and object arrays.
