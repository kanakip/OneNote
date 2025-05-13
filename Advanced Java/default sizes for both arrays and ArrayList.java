Here are the default sizes for both arrays and `ArrayList` in Java:

1. Array: 
   - In Java, arrays have a fixed size once created, which means there is no "default" size for an array. The size must be specified at the time of creation.
	
int[] arr = new int[10]; // creates an array of size 10
	   
2. ArrayList:
   - In `ArrayList`, if no capacity is specified during initialization, the default initial capacity is **10**. However, the capacity increases automatically when the `ArrayList` needs more space to accommodate new elements.
   
ArrayList<Integer> arrayList = new ArrayList<>(); // initial capacity is 10

 
When the `ArrayList` exceeds its capacity, it typically resizes by increasing its capacity by **50%** (1.5 times the current size).
