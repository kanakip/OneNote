Here are some common built-in methods for the Collection interface in Java, which is the root interface for most collection types like List, Set, and Queue:

1. add(E e)
Adds the specified element to the collection.
	collection.add("element");
  
2. addAll(Collection<? extends E> c)
Adds all elements from the specified collection to the current collection. 
	
	collection.addAll(otherCollection);

3. clear()
Removes all elements from the collection.

	collection.add("element");

4. contains(Object o)
Returns true if the collection contains the specified element.

	boolean exists = collection.contains("element");
  

5. containsAll(Collection<?> c)
Returns true if the collection contains all elements from the specified collection.
  
	boolean allExist = collection.containsAll(otherCollection);

  6. isEmpty()
Returns true if the collection contains no elements.
 
	boolean empty = collection.isEmpty();
	
7. iterator()
Returns an iterator over the elements in the collection.
  
	Iterator<String> it = collection.iterator();
  
8. remove(Object o)
Removes a single instance of the specified element from the collection if it exists.
    
	collection.remove("element");

9. removeAll(Collection<?> c)
Removes all elements in the current collection that are also present in the specified collection.
  
	collection.removeAll(otherCollection);

10. removeIf(Predicate<? super E> filter)
Removes all elements that satisfy the condition defined by the given predicate.
  
	collection.removeIf(e -> e.startsWith("s"));

11. retainAll(Collection<?> c)
Retains only the elements in the current collection that are present in the specified collection.
  
	collection.retainAll(otherCollection);

12. size()
Returns the number of elements in the collection.
	
	int size = collection.size();

13. toArray()
Converts the collection to an array.

	Object[] array = collection.toArray();

14. toArray(T[] a)
Converts the collection to an array of the specified type.
  
	String[] array = collection.toArray(new String[0]);

15. stream()
Returns a stream to process elements with functional operations like filter, map, reduce, etc.
  
	collection.stream().filter(e -> e.startsWith("a")).forEach(System.out::println);
  
16. parallelStream()
Returns a parallel stream to process elements concurrently.
  
	collection.parallelStream().forEach(System.out::println);

17. equals(Object o)
Compares the specified object with the collection for equality.
  
	boolean isEqual = collection.equals(otherCollection);
  
18. hashCode()
Returns the hash code value for the collection.
  
	int hash = collection.hashCode();

19. spliterator()
Creates a spliterator over the elements in the collection for parallel processing.
  
	Spliterator<String> spliterator = collection.spliterator();

  
These are the most common built-in methods for Collection in Java. They provide a powerful way to manipulate and query collections of data.
