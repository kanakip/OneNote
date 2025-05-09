Let me explain the default size and capacity behavior of Lists in Java.
 
Default List Sizes in Java
 
ArrayList
 
	• Initial capacity: 10 elements
	• Grows by 50% of current size when capacity is reached
 

javaCopy to clipboard
// Default constructor creates ArrayList with capacity 10
List<String> list = new ArrayList<>();
// You can specify initial capacity
List<String> list = new ArrayList<>(20);
 
LinkedList
 
	• No initial capacity (grows/shrinks by exactly one node as needed)
	• Each element creates a new node as needed
 

javaCopy to clipboard
// Creates empty LinkedList with no preset capacity
List<String> list = new LinkedList<>();
 
Vector (Legacy)
 
	• Initial capacity: 10 elements
	• Grows by 100% of current size when capacity is reached
 

javaCopy to clipboard
// Default constructor creates Vector with capacity 10
Vector<String> vector = new Vector<>();

From <https://highlight-chat-frontend.vercel.app/> 


Arrays vs ArrayList Size & Capacity
 
Regular Arrays
 
// Fixed size - NO DEFAULT SIZE
int[] array = new int[10];  // Must specify size explicitly
 
	• No default size - must be declared
	• Cannot increase capacity (immutable)
	• To "resize", must create new array and copy elements
 
ArrayList
 
// Default initial capacity = 10
ArrayList<Integer> list = new ArrayList<>();
// Custom initial capacity
ArrayList<Integer> list = new ArrayList<>(20);
 
Growth Formula
 
	• Initial capacity: 10
	• Growth factor: 1.5x (increases by 50%)
	• New capacity = (Old capacity * 3/2) + 1


