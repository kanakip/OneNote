Here are some commonly used built-in methods of the List interface in Java:

1. add(E e)
Adds an element to the list.
	list.add("element");

2. add(int index, E element)
Inserts the element at the specified position.
	list.add(1, "element");
	
3. get(int index)
Returns the element at the specified position.
	String value = list.get(0);

4. set(int index, E element)
Replaces the element at the specified position with the given element.
	list.set(1, "newElement");

5. remove(int index)
Removes the element at the specified position.
	list.remove(1);


6. remove(Object o)
Removes the first occurrence of the specified element from the list.
	list.remove("element");


7. size()
Returns the number of elements in the list.
	int size = list.size();

8. contains(Object o)
Checks if the list contains the specified element.
	boolean exists = list.contains("element");

9. isEmpty()
Checks if the list is empty.
	boolean empty = list.isEmpty();

10. clear()
Removes all elements from the list.
	list.clear();

11. indexOf(Object o)
Returns the index of the first occurrence of the element, or -1 if not found.
	int index = IndexOf("element");

12. lastIndexOf(Object o)
Returns the index of the last occurrence of the element, or -1 if not found.
	int lastIndex = list.lastIndexOf("element");

13. toArray()
Converts the list to an array.
	Object[] array = list.toArray();

14. subList(int fromIndex, int toIndex)
Returns a sublist of the list from fromIndex (inclusive) to toIndex (exclusive).
	List<String> subList = list.subList(1, 3);

These are some of the most commonly used methods of the List interface in Java.


removeIf - 

The removeIf() method in Java is a built-in method for Collection types, including List. It removes all elements of the list that satisfy a given predicate (a condition provided as a lambda expression or a method reference).

Syntax:
	boolean removeIf(Predicate<? super E> filter)

filter: A functional interface that provides a condition to test elements of the list.
Returns: true if any elements were removed, otherwise false.

Example:
Remove all elements in a list that start with the letter "s":

List<String> list = new ArrayList<>(Arrays.asList("sneha", "pallavi", "sara", "john"));
list.removeIf(s -> s.startsWith("s"));
System.out.println(list);  // Output: [pallavi, john]

How It Works:
The lambda expression s -> s.startsWith("s") defines a condition to remove any string starting with "s".
removeIf() iterates over the list and removes all elements that satisfy this condition.
