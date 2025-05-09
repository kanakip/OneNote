Lambda in Java
🗒️ Answer
Lambda expressions in Java, introduced in Java SE 8, provide a concise way to represent functional interfaces (interfaces with a single abstract method). They enable you to express instances of these interfaces using a more compact syntax.
Key Features:
	1. Syntax: The basic syntax is (parameters) -> expression or (parameters) -> { statements; }.
		○ Example:
     (a, b) -> a + b
	2. Usage: Commonly used for:
		○ Implementing functional interfaces like Runnable, Callable, or custom interfaces.
		○ Enhancing the Java Collections Framework (e.g., using forEach, map, and filter methods).
	3. Benefits:
		○ Conciseness: Reduces boilerplate code compared to anonymous inner classes.
		○ Readability: Makes the code more readable and easier to understand.
Example:

import java.util.Arrays;
public class LambdaExample {
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Jack"};
        Arrays.sort(names, (a, b) -> a.compareTo(b)); // Using a lambda expression
        System.out.println(Arrays.toString(names));
    }
}

Lambda expressions significantly enhance Java's capability for functional programming [1][2].
