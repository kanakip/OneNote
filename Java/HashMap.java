A HashMap in Java is a part of the Java Collections Framework and implements the Map interface. It stores data in key/value pairs, allowing you to retrieve values based on their corresponding keys.
Key Features:
	1. Storage: It uses a hash table to store data, which allows for fast access and modification.
	2. Null Keys and Values: HashMap permits one null key and multiple null values.
	3. Non-Synchronized: It is not synchronized, making it suitable for single-threaded environments. For thread-safe operations, consider using ConcurrentHashMap.
Common Methods:
	• put(key, value): Inserts a key/value pair into the map.
	• get(key): Retrieves the value associated with the specified key.
	• remove(key): Deletes the key/value pair from the map.
	• containsKey(key): Checks if a specific key exists in the map.
	• size(): Returns the number of key/value pairs in the map.
Example:

import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        System.out.println(map.get("Apple")); // Outputs: 1
    }
}
HashMap is widely used for its efficiency in data retrieval and storage [1][3].
