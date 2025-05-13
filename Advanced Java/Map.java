In Java, Map is an interface that represents a collection of key-value pairs. It maps unique keys to values, meaning that each key can be associated with exactly one value. However, a single value can be associated with multiple keys. It is part of the Java Collections Framework but differs from other collection types such as List and Set since it doesn't extend the Collection interface.
Key Features of Map:
	• Unique Keys: No two keys can be the same (i.e., duplicate keys are not allowed).
	• One Value per Key: Each key maps to exactly one value, but the same value can appear multiple times associated with different keys.
	• Allows Null: Depending on the implementation, a Map may allow one null key and multiple null values (e.g., HashMap).

Main Implementations of Map Interface:
	1. HashMap
	2. LinkedHashMap
	3. TreeMap
	4. Hashtable

1. HashMap:
HashMap is the most commonly used implementation of the Map interface. It stores key-value pairs in a hash table and allows for constant time performance (O(1)) for basic operations like put and get.
	• No Order: It does not maintain any order for keys or values.
	• Null Keys and Values: Allows one null key and multiple null values.
	• Performance: Fastest among the map implementations.
Example:

import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
      
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        System.out.println("Alice's age: " + map.get("Alice"));
        // Iterating over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }
    }
}

Output:
	Alice's age: 25
Alice is 25 years old.
Bob is 30 years old.
Charlie is 35 years old.

2. LinkedHashMap:
LinkedHashMap is an ordered version of HashMap. It maintains a doubly-linked list that links all entries in the map, meaning it retains the insertion order.
	• Insertion Order: Maintains the order in which key-value pairs are added.
	• Null Keys and Values: Allows one null key and multiple null values.
	• Performance: Slightly slower than HashMap due to the overhead of maintaining the linked list.
Example:

import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> linkedMap = new LinkedHashMap<>();
     
        linkedMap.put("First", "Apple");
        linkedMap.put("Second", "Banana");
        linkedMap.put("Third", "Cherry");
        // Iterating over the map
        for (Map.Entry<String, String> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

Output:
	First -> Apple
Second -> Banana
Third -> Cherry

3. TreeMap:
TreeMap is a sorted map implementation. It stores key-value pairs in a Red-Black Tree, and the keys are sorted according to their natural ordering (or by a Comparator provided at map creation time).
	• Sorted Order: The keys are sorted either naturally (e.g., alphabetically for strings) or by a custom comparator.
	• No Null Keys: It does not allow null keys (but allows multiple null values).
	• Performance: Operations like put, get, and remove take O(log n) time due to the tree structure.
Example:

import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
       
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Cherry");
        // Iterating over the map (in sorted order by key)
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

Output:
	1 -> Banana
2 -> Cherry
3 -> Apple

4. Hashtable:
Hashtable is an older implementation of the Map interface. It is similar to HashMap, but it is synchronized, meaning it is thread-safe and can be used in multi-threaded environments. However, this comes with performance overhead compared to HashMap.
	• No Null Keys/Values: It does not allow null keys or values.
	• Thread-safe: All methods are synchronized, making it thread-safe.
	• Performance: Slower than HashMap due to synchronization overhead.

Example:

import java.util.Hashtable;
import java.util.Map;
public class HashtableExample {
    public static void main(String[] args) {
        Map<String, Integer> table = new Hashtable<>();
        
        table.put("USA", 1);
        table.put("India", 91);
        table.put("UK", 44);
        // Accessing values
        System.out.println("Country code of India: " + table.get("India"));
    }
}

Output:
	Country code of India: 91

Common Methods in Map:
	• put(K key, V value): Adds a key-value pair to the map. If the key already exists, the value is updated.
	• get(Object key): Retrieves the value associated with the key.
	• remove(Object key): Removes the key-value pair associated with the given key.
	• containsKey(Object key): Returns true if the map contains the specified key.
	• containsValue(Object value): Returns true if the map contains the specified value.
	• keySet(): Returns a Set view of the keys in the map.
	• values(): Returns a Collection view of the values in the map.
	• entrySet(): Returns a Set view of the key-value mappings in the map.

Example Use Case: Counting Word Frequencies


import java.util.HashMap;
import java.util.Map;
public class WordCount {
    public static void main(String[] args) {
    
    String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
	Map<String, Integer> wordCount = new HashMap<>();
	for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
// Print the word frequencies
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}
Output:

apple occurs 3 times.
banana occurs 2 times.
orange occurs 1 time.

Conclusion:
	• HashMap: Best for fast lookups and if you don't care about order.
	• LinkedHashMap: Use when you need to maintain insertion order.
	• TreeMap: Use when you need sorted order (either natural or custom sorting).
	• Hashtable: Use if thread safety is required but expect slower performance.
