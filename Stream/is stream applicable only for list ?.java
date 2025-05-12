No, Java Streams are not limited to only Lists. They can be applied to various data sources, including:

Collections:
1. List: ArrayList, LinkedList, etc.
2. Set: HashSet, TreeSet, etc.
3. Map: HashMap, TreeMap, etc. (using entrySet(), keySet(), or values())

Arrays:
1. Primitive arrays: int[], double[], etc.
2. Object arrays: String[], Integer[], etc.

Other data sources:
1. Files: Using Files.lines() or Files.readAllLines()
2. Database queries: Using JDBC or ORM libraries like Hibernate
3. Network sockets: Using java.net package
4. Generators: Using Stream.generate() or Stream.iterate()

To create a Stream from a data source, you can use various methods, such as:

1. Collection.stream(): For Collections
2. Arrays.stream(): For arrays
3. Files.lines(): For files
4. Stream.of(): For creating a Stream from a variable number of arguments
5. Stream.generate(): For creating a Stream from a generator function
6. Stream.iterate(): For creating a Stream from an iterative process

Once you have a Stream, you can apply various operations to it, such as:

1. Filtering: Using filter()
2. Mapping: Using map()
3. Reducing: Using reduce()
4. Collecting: Using collect()
5. Sorting: Using sorted()
6. Distinct: Using distinct()

And many more!
