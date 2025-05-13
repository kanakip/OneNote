In Java, the Set is a collection that does not allow duplicate elements. It is part of the java.util package and is one of the primary interfaces of the Collection Framework. Sets are typically used to model sets in mathematics and to avoid duplicates in a collection of elements.
Key Features of Set:
	• No Duplicates: A Set does not allow duplicate elements.
	• Unordered: Most implementations of Set do not maintain any order of elements (except for LinkedHashSet and TreeSet).
	• Unique Elements: Every element in a set is unique.
Main Implementations of Set Interface:
	1. HashSet
	2. LinkedHashSet
	3. TreeSet

1. HashSet:
HashSet is the most commonly used implementation of the Set interface. It uses a hash table for storing elements, meaning it does not guarantee the order of elements.
	• No Order: It does not maintain any insertion order.
	• Performance: HashSet offers constant time performance (O(1)) for basic operations like add, remove, contains, and size, provided the hash function disperses the elements properly across the buckets.
Example:
	
	import java.util.HashSet;
	import java.util.Set;
	public class loop1 {
	    public static void main(String[] args) {
	        Set<String> animals = new HashSet<>();
	        // Adding elements to the set
	        animals.add("Dog");
	        animals.add("Cat");
	        animals.add("Horse");
	        // Trying to add duplicate element
	        animals.add("Dog");
	        // Iterating over elements
	        for (String animal : animals) {
	            System.out.println(animal);
	        }
	    }
	}

Output:
	Dog
Cat
Horse
	(Note that "Dog" is not added twice.)

2. LinkedHashSet:
LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked list across all of its elements. This means that the elements are stored in the order in which they are inserted.
	• Insertion Order: It maintains the order of elements as they were inserted.
	• Performance: Performance is slightly slower than HashSet due to the overhead of maintaining the linked list.
Example:


import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();
        // Adding elements to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");  // Duplicate element, won't be added
        // Printing the set (maintains insertion order)
        System.out.println(fruits);
    }
}

Output:
	[Apple, Banana, Orange]

3. TreeSet:
TreeSet is a sorted set implementation that uses a Red-Black Tree. This means the elements are stored in sorted order (either by natural ordering or by a comparator provided during the set's creation).
	• Sorted Order: It sorts elements in their natural order (for example, lexicographical order for strings).
	• Performance: Operations such as add, remove, and contains take O(log n) time due to the tree structure.
Example:


import java.util.Set;
import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        // Adding elements to the set
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        // Printing the set (elements are sorted)
        System.out.println(numbers);
    }
}

Output:
	[1, 2, 5, 8]

Additional Methods in Set:
	• add(E e): Adds the specified element to the set if it is not already present.
	• remove(Object o): Removes the specified element from the set, if it is present.
	• contains(Object o): Returns true if the set contains the specified element.
	• size(): Returns the number of elements in the set.
	• clear(): Removes all elements from the set.

Comparison Between HashSet, LinkedHashSet, and TreeSet:
Feature	HashSet	LinkedHashSet	TreeSet
Underlying Data Structure	Hash Table	Hash Table + Linked List	Red-Black Tree
Order Maintained	No	Yes (insertion order)	Yes (sorted order)
Performance (Add, Remove, Contains)	O(1)	O(1)	O(log n)
Duplicates Allowed	No	No	No

Example Use Case: Removing Duplicates from a List
Let’s use HashSet to remove duplicates from a list:


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create a list with duplicate elements
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");
        // Convert the list to a set to remove duplicates
        Set<String> uniqueNames = new HashSet<>(names);
        // Convert back to a list
        List<String> namesWithoutDuplicates = new ArrayList<>(uniqueNames);
        System.out.println(namesWithoutDuplicates);  // Output: [Alice, Bob, Charlie]
    }
}

Output:
	[Alice, Bob, Charlie]

Conclusion:
	• HashSet: Best for fast lookups and operations when you don’t care about the order.
	• LinkedHashSet: Use when you need fast operations and care about maintaining the insertion order.
	• TreeSet: Use when you need to keep the elements sorted in natural or custom order.

