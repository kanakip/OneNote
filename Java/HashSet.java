A HashSet in Java is a part of the Java Collections Framework and implements the Set interface. It is used to store a collection of unique elements, meaning it does not allow duplicate values.
Key Features:
	1. Unordered: The elements in a HashSet are not stored in any particular order, and their order may change over time.
	2. Fast Operations: HashSet provides constant-time performance for basic operations like add, remove, and contains, assuming the hash function disperses elements properly.
	3. Allows Null Values: It can store one null value.
Common Methods:
	• add(element): Adds the specified element to the set if it is not already present.
	• remove(element): Removes the specified element from the set.
	• contains(element): Returns true if the set contains the specified element.
	• size(): Returns the number of elements in the set.
	• clear(): Removes all elements from the set.
Example:

import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate, won't be added
        System.out.println(set); // Outputs: [Apple, Banana]
    }
}
HashSet is particularly useful when you want to ensure that a collection contains no duplicates while providing fast access and modification capabilities [1][2].
