Great observation! The reason you **can't** use `a.toString()` after sorting is that it doesn't actually convert the array into a readable string format. Instead, it returns the **default object representation**, which looks like something like `[C@6d06d69c]` (a memory address).

### **What Happens?**
```java
char[] a = {'e', 'a', 't'};
Arrays.sort(a);
String s1 = a.toString(); 

System.out.println("Using toString(): " + s1);
```
**Output:**
```
Using toString(): [C@6d06d69c
```
It doesn’t convert the `char[]` to `"eat"`—it prints the object's reference.

### **Correct Approach**
Instead, use:
```java
String s = new String(a);
```
or
```java
String s = String.valueOf(a);
```
Both will correctly convert the sorted array into a string.

Would you like a deeper explanation of how `toString()` works with arrays? 🚀
