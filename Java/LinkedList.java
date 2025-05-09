# LinkedList in Java


A LinkedList in Java is a part of the Java Collections Framework and implements the `List` and `Deque` interfaces. Unlike an `ArrayList`, which is backed by a dynamic array, a `LinkedList` uses a doubly linked list data structure.

Key Features:
1. Dynamic Size: Can grow and shrink in size as needed, making it flexible for adding and removing elements.
2. Efficient Insertions/Deletions: Adding or removing elements (especially from the beginning or middle) is generally more efficient than in an `ArrayList` since it does not require shifting elements.
3. Allows Duplicates: Multiple identical elements can be stored.

Common Methods:
- `add(element)`: Appends the specified element to the end of the list.
- `addFirst(element)`: Inserts the specified element at the beginning of the list.
- `remove(index)`: Removes the element at the specified position.
- `get(index)`: Retrieves the element at the specified index.
- `size()`: Returns the number of elements in the list.

Example:

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.addFirst("Orange");
        System.out.println(list.get(0)); // Outputs: Orange
    }
}


LinkedLists are particularly useful when frequent insertions and deletions are required [[1](https://www.geeksforgeeks.org/linked-list-in-java/)][[2](https://www.javatpoint.com/linkedlist-in-java)].
