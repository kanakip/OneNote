In Java, the Collection Framework provides a set of classes and interfaces for managing groups of objects. It is designed to store, retrieve, manipulate, and communicate aggregate data efficiently. The main interfaces and classes of the Collection Framework include List, Set, Queue, and Map.
Key Interfaces in the Collection Framework
	1. Collection Interface:
		○ It is the root interface for most of the collection classes. It represents a group of objects, known as elements.
Collection<E> collection;
Main Collection Types
	1. List:
		○ A List is an ordered collection that allows duplicate elements. You can access elements by their index.
		○ Common implementations: ArrayList, LinkedList, Vector.
		○ List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
		
	2. Set:
		○ A Set is a collection that does not allow duplicate elements. It also doesn't guarantee the order of elements (except LinkedHashSet).
		○ Common implementations: HashSet, LinkedHashSet, TreeSet.

Set<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
set.add("Apple");  // Duplicate will be ignore
	
	3. Queue:
		○ A Queue is a collection designed for holding elements prior to processing. Typically, it follows FIFO (First-In-First-Out) order.
		○ Common implementations: LinkedList, PriorityQueue.

Queue<String> queue = new LinkedList<>();
queue.add("Task 1");
queue.add("Task 2");
	
	4. Map:
		○ A Map is a collection of key-value pairs. Each key is unique, but values can be duplicated.
		○ Common implementations: HashMap, LinkedHashMap, TreeMap, Hashtable.
		Map<Integer, String> map = new HashMap<>();
map.put(1, "Apple");
map.put(2, "Banana");
		
Collection Classes

	• ArrayList: A resizable array implementation of the List interface. It allows fast random access but slow insertion/removal operations.
	• LinkedList: A doubly linked list that can act as a List or Queue.
	• HashSet: An implementation of the Set interface that does not maintain any order but allows constant time performance for basic operations.
	• LinkedHashSet: A variant of HashSet that maintains insertion order.
	• TreeSet: Implements the Set interface and maintains elements in a sorted (natural) order.
	• HashMap: Implements the Map interface and allows efficient retrieval based on keys. It does not guarantee any order.
	• LinkedHashMap: A variant of HashMap that maintains insertion order.
	• TreeMap: Implements the Map interface and maintains keys in a sorted order.
Example: Using a List

import java.util.ArrayList;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
System.out.println(fruits);  // Output: [Apple, Banana, Orange]
    }
}
Example: Using a Set

import java.util.HashSet;
import java.util.Set;
public class SetExample {
    public static void main(String[] args) {
        Set<String> items = new HashSet<>();
        items.add("Book");
        items.add("Pen");
        items.add("Book");  // Duplicate will be ignored
System.out.println(items);  // Output might be: [Pen, Book]
    }
}
Example: Using a Map

import java.util.HashMap;
import java.util.Map;
public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Dog");
        map.put(2, "Cat");
System.out.println(map);  // Output: {1=Dog, 2=Cat}
    }
}
Hierarchy of the Collection Framework:

        Iterable
              |
          Collection
        /     |     \
     List    Set   Queue
    /   \     |       \
ArrayList HashSet   PriorityQueue
LinkedList TreeSet   LinkedList
Key Points:
	• Collection is the root interface of most Java collections.
	• The List, Set, and Queue interfaces extend Collection.
	• Map does not extend Collection but is part of the framework.
	
	
	
