Here’s a Java program demonstrating the use of a Map with key-value pairs:

Java Code

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Retrieving a value
        System.out.println("Bob's Age: " + map.get("Bob"));

        // Iterating over the Map
        System.out.println("All Entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Checking if a key exists
        System.out.println("Contains 'Alice'? " + map.containsKey("Alice"));

        // Removing an entry
        map.remove("Charlie");
        System.out.println("After Removal: " + map);
    }
}


Expected Output

Bob's Age: 30
All Entries:
Alice -> 25
Bob -> 30
Charlie -> 35
Contains 'Alice'? true
After Removal: {Alice=25, Bob=30}

This program demonstrates **adding, retrieving, iterating, checking, and removing elements** in a `HashMap`. You can explore more **Map implementations** like `TreeMap`, `LinkedHashMap`, and `ConcurrentHashMap` [here](https://www.geeksforgeeks.org/map-interface-java-examples/) and [here](https://www.programiz.com/java-programming/map). Let me know if you need more variations! 🚀
