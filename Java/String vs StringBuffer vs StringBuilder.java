
1. String
 
• Immutable: Once created, cannot be modified
• Stored in String Pool
• Thread-safe by default
• Each operation creates new String object
 
String str = "Hello";
str = str + " World"; // Creates new String object
 2. StringBuffer
 
• Mutable: Can be modified
• Thread-safe (synchronized)
• Better for multi-threaded environments
• Slower than StringBuilder
 
StringBuffer buffer = new StringBuffer("Hello");
buffer.append(" World"); // Modifies existing object
 3. StringBuilder
 
• Mutable: Can be modified
• Not thread-safe
• Faster than StringBuffer
• Preferred for single-threaded environments
 
StringBuilder builder = new StringBuilder("Hello");
builder.append(" World"); // Modifies existing object
When to Use What
 
1. String
• When immutability is required
• For constant strings
• When string won't be modified
2. StringBuffer
• In multi-threaded environments
• When thread safety is needed
• For mutable strings
3. StringBuilder
• In single-threaded environments
• When performance is critical
• For mutable strings
Comparison Table
 
Feature	String	StringBuffer	StringBuilder
Mutability	Immutable	Mutable	Mutable
Thread Safety	Yes	Yes	No
Performance	Slowest	Moderate	Fastest
Memory Usage	High	Low	Low
Storage	String Pool	Heap	Heap
 
Common Methods
 
StringBuffer/StringBuilder
 
// Append
append(" World")
// Insert
insert(1, "Java")
// Replace
replace(1, 3, "Java")
// Delete
delete(1, 3)
// Reverse
reverse()
 Performance Comparison
 
// String - Creates multiple objects
String str = "Hello";
str += " World";
str += "!";
// StringBuffer - Single object
StringBuffer buffer = new StringBuffer("Hello");
buffer.append(" World");
buffer.append("!");
// StringBuilder - Single object
StringBuilder builder = new StringBuilder("Hello");
builder.append(" World");
builder.append("!");
 
 Remember: For concatenation operations in loops, always prefer StringBuilder (single-thread) or StringBuffer (multi-thread) over String.

Why it is mutable an immutable ??
When u free ans this.
