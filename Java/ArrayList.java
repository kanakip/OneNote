ArrayList in Java
🗒️ Answer
An ArrayList in Java is a part of the Java Collections Framework and is implemented using the List interface. It provides a dynamic array that can grow as needed, unlike traditional arrays that have a fixed size.
Key Features:
	1. Resizable: Automatically resizes itself when elements are added or removed.
	2. Ordered: Maintains the order of insertion of elements.
	3. Allows Duplicates: Multiple identical elements can be stored.
Common Methods:
	• add(element): Adds an element to the end of the list.
	• remove(index): Removes the element at the specified position.
	• get(index): Retrieves the element at the specified index.
	• size(): Returns the number of elements in the list.
Example:

import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println(list.get(1)); // Outputs: Banana
    }
}
ArrayLists are widely used for their flexibility and ease of use in managing collections of data [1][2].
