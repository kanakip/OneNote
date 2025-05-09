Heap Memory
│
├── String Pool
│   ├── "Hello"
│   └── "World"
│
└── Other Objects (when any object created with new then it takes data from heap)
    └── new String("Hello")

Using String Literal
String str1 = "Python";
String str2 = "Data Science";
String str3 = "Python";
Using new Keyword
String str1 = new String ("Java");
String str2 = new String ("C++");
String str3 = new String ("Data Science");

First, we have created a string literal Python and it takes place in the pool. After that, the string Data Science is created, it also takes place in the pool. At last, again we have created the string Python. But at this time, JVM checks for the string and found that string literal is already present. Instead of taking a new instance in the String pool, it returns the reference of the pooled instance i.e. str1.

Similarly, when we use the new keyword to create the string literals, it also takes place in the String pool. We have created three strings literals Java, C++, and Data Science. We see that the string literals Java and C++ are the new ones. But the Data Science literal is already existing in the pool. At this time, JVM allocates space for the literal Data Science in Java Heap. Remember that all the String literals created with the new keyword take place in the Java heap, not in the String pool.




//FIG
