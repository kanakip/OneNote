
# Intermediate Operations
1. filter(): Returns a new Stream containing only elements that match a given predicate.
2. map(): Returns a new Stream containing the results of applying a given function to each element.
3. flatMap(): Similar to map(), but flattens the resulting Stream.
4. distinct(): Returns a new Stream containing only unique elements.
5. sorted(): Returns a new Stream containing elements sorted according to a given comparator.
6. limit(): Returns a new Stream containing only the first n elements.
7. skip(): Returns a new Stream containing all elements except the first n.
8. takeWhile(): Returns a new Stream containing elements from the original Stream as long as a given predicate is true.
9. dropWhile(): Returns a new Stream containing elements from the original Stream after a given predicate is false.
10. peek(): Returns a new Stream that performs an action on each element as it is consumed.

# Terminal Operations
1. forEach(): Applies a given action to each element of the Stream.
2. collect(): Accumulates the elements of the Stream into a collection, such as a List or Set.
3. reduce(): Combines the elements of the Stream into a single result.
4. findFirst(): Returns the first element of the Stream, or an empty Optional if the Stream is empty.
5. findAny(): Returns any element of the Stream, or an empty Optional if the Stream is empty.
6. count(): Returns the number of elements in the Stream.
7. max(): Returns the maximum element of the Stream, according to a given comparator.
8. min(): Returns the minimum element of the Stream, according to a given comparator.
9. toArray(): Returns an array containing the elements of the Stream.
10. toSet(): Returns a Set containing the elements of the Stream.
11. toList(): Returns a List containing the elements of the Stream.
12. toMap(): Returns a Map containing the elements of the Stream.
13. toCollection(): Returns a Collection containing the elements of the Stream.

# Short-Circuiting Operations
1. findFirst(): Stops processing as soon as it finds the first element.
2. findAny(): Stops processing as soon as it finds any element.
3. anyMatch(): Stops processing as soon as it finds an element that matches the given predicate.
4. allMatch(): Stops processing as soon as it finds an element that doesn't match the given predicate.
5. noneMatch(): Stops processing as soon as it finds an element that matches the given predicate.

# Other Operations
1. parallel(): Returns a parallel Stream, which can be processed in parallel.
2. sequential(): Returns a sequential Stream, which is processed sequentially.
3. unordered(): Returns an unordered Stream, which can be processed in any order.
4. onClose(): Returns a Stream that will perform a given action when it is closed.
