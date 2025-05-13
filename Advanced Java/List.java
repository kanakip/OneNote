In Java, the List is an ordered collection that allows duplicate elements and provides a positional access to the elements, meaning you can access elements by their index. It also allows null elements.
Key Features of List:
	• Duplicates Allowed: A List can contain duplicate elements.
	• Ordered: A List maintains the order in which elements are inserted.
	• Positional Access: You can access elements by their position in the list (using indices starting from 0).
Main Implementations of List Interface:
	1. ArrayList
	2. LinkedList
	3. Vector (rarely used now)
Let’s go through each of these types with examples.

1. ArrayList:
	ArrayList is the most commonly used implementation of the List interface. It is backed by a dynamic array, which grows as elements are added.
	• Access Time: Fast (O(1)) for random access.
	• Insertion/Deletion: Slower (O(n)) because elements need to be shifted.

Example:

import java.util.ArrayList;
import java.util.List;
public class loop1 {
    public static void main(String[] args) {
      
        List<String> fruits = new ArrayList<>();
     
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        fruits.add(1, "Mango");
  
        System.out.println(fruits.get(0));  // Output: Apple
        
        fruits.remove("Banana");   //TODO : System.out.println(cities);
       
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

Output:

	Apple
Apple
Mango
Orange

2. LinkedList:
LinkedList is a doubly linked list implementation of the List interface. It is better suited for scenarios where frequent insertion and deletion of elements are required.
	• Access Time: Slower (O(n)) for random access.
	• Insertion/Deletion: Fast (O(1)) for adding/removing elements from the start or end.
Example:

import java.util.LinkedList;
import java.util.List;
public class loop1 {
    public static void main(String[] args) {
       
        List<String> cities = new LinkedList<>();
      
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
   
        cities.add(0, "San Francisco");
     
        cities.remove(2);
      
        System.out.println(cities);
    }
}

Output:
	[San Francisco, New York, Chicago]

3. Vector:
Vector is a synchronized (thread-safe) implementation of the List interface. It is rarely used now due to performance reasons (synchronization overhead). However, it can be useful in multi-threaded environments where thread safety is required.
	• Thread Safety: Vector is synchronized, so it is slower compared to ArrayList and LinkedList.
Example:


import java.util.List;
import java.util.Vector;
public class loop1 {
    public static void main(String[] args) {
        // Creating a Vector of Integers
        Vector<Integer> numbers = new Vector<>();
		
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        // Accessing elements by index
        System.out.println(numbers.get(1));  // Output: 2
        // Removing an element
        numbers.remove(Integer.valueOf(3));
        // Printing the vector
        System.out.println(numbers);
    }
}

Output:
	2
[1, 2]

Additional Methods in List:
	• add(int index, E element): Inserts the element at the specified index.
	• get(int index): Returns the element at the specified position.
	• remove(int index): Removes the element at the specified index.
	• set(int index, E element): Replaces the element at the specified position with the specified element.
	• indexOf(Object o): Returns the index of the first occurrence of the specified element.
	• size(): Returns the number of elements in the list.

Comparison Between ArrayList and LinkedList:
Feature	ArrayList	LinkedList
Data Structure	Dynamic Array	Doubly Linked List
Access Time	O(1) for random access	O(n) for random access
Insertion/Deletion	O(n) (shift elements if not at the end)	O(1) (constant time for adding/removing at start/end)
Memory Usage	Less memory overhead	More memory (due to pointers)


Example of Using List for a Simple Task
Let’s look at an example where we need to remove all occurrences of a specific value from the list:

// Remove duplicate words
import java.util.ArrayList;
import java.util.List;
public class loop1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        // Remove all occurrences of "apple"
        words.removeIf(word -> word.equals("apple"));
        System.out.println(words);  
    }
}

Output: [banana, orange]

Working with List Subsets:
You can also extract a portion of the list using the subList method.


import java.util.ArrayList;
import java.util.List;
public class loop1 {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        // Extract a portion of the list (from index 1 to 3, exclusive)
        List<String> subList = languages.subList(1, 3);
        System.out.println(subList);  
    }
}

Output: [Python, C++]

Conclusion:
	• ArrayList is best when you need fast random access and don't have frequent insertions/removals.
	• LinkedList is better when you need frequent insertions/removals at the beginning or end of the list.
	• Vector is used in multi-threaded environments where synchronization is required, but Collections.synchronizedList() is often preferred today.
