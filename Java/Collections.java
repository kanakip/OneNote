Collections in Java with Types

Java Collections Framework provides a set of classes and interfaces for storing and manipulating groups of objects. The main types of collections in Java are:
	1. List: Ordered collection that allows duplicates. Key implementations include:
		○ ArrayList: Resizable array implementation.
		○ LinkedList: Doubly linked list implementation.
		○ Vector: Synchronized resizable array.
	2. Set: Collection that does not allow duplicates. Key implementations include:
		○ HashSet: Unordered, uses a hash table.
		○ LinkedHashSet: Maintains insertion order, uses a hash table.
		○ TreeSet: Sorted set based on natural ordering or a comparator.
	3. Map: Collection of key-value pairs, where keys must be unique. Key implementations include:
		○ HashMap: Unordered, allows null values.
		○ LinkedHashMap: Maintains insertion order.
		○ TreeMap: Sorted based on keys.
	4. Queue: Collection for holding elements prior to processing. Key implementations include:
		○ LinkedList: Also implements Queue interface.
		○ PriorityQueue: Elements are processed based on priority.
These collections provide essential functionality for data manipulation tasks such as searching, sorting, and iterating [1][3][4].


Hash -> if hash keyword present it maintain the insertion order.

