https://www.javatpoint.com/difference-between-arraylist-and-linkedlist

Difference Between ArrayList and LinkedList
ArrayList and LinkedList both implement the List interface and maintain insertion order. Both are non-synchronized classes.
However, there are many differences between the ArrayList and LinkedList classes that are given below.
ArrayList	LinkedList
1) ArrayList internally uses a dynamic array to store the elements.	LinkedList internally uses a doubly linked list to store the elements.
2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the other elements are shifted in memory.	Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
3) An ArrayList class can act as a list only because it implements List only.	LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4) ArrayList is better for storing and accessing data.	LinkedList is better for manipulating data.
5) The memory location for the elements of an ArrayList is contiguous.	The location for the elements of a linked list is not contagious.
6) Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList.	There is no case of default capacity in a LinkedList. In LinkedList, an empty list is created when a LinkedList is initialized.
7) To be precise, an ArrayList is a resizable array.	LinkedList implements the doubly linked list of the list interface.
Example of ArrayList and LinkedList in Java
Let's see a simple example where we are using ArrayList and LinkedList both.
FileName: TestArrayLinked.java

import java.util.*;    
class TestArrayLinked{    
 public static void main(String args[]){    
     
  List<String> al=new ArrayList<String>();//creating arraylist    
  al.add("Ravi");//adding object in arraylist    
  al.add("Vijay");    
  al.add("Ravi");    
  al.add("Ajay");    
    
  List<String> al2=new LinkedList<String>();//creating linkedlist    
  al2.add("James");//adding object in linkedlist    
  al2.add("Serena");    
  al2.add("Swati");    
  al2.add("Junaid");    
    
  System.out.println("arraylist: "+al);  
  System.out.println("linkedlist: "+al2);  
 }    
}    

Test it Now
Output:
arraylist: [Ravi,Vijay,Ravi,Ajay]
linkedlist: [James,Serena,Swati,Junaid]

Points to Remember
The following are some important points to remember regarding an ArrayList and LinkedList.
	• When the rate of addition or removal rate is more than the read scenarios, then go for the LinkedList. On the other hand, when the frequency of the read scenarios is more than the addition or removal rate, then ArrayList takes precedence over LinkedList.
	• Since the elements of an ArrayList are stored more compact as compared to a LinkedList; therefore, the ArrayList is more cache-friendly as compared to the LinkedList. Thus, chances for the cache miss are less in an ArrayList as compared to a LinkedList. Generally, it is considered that a LinkedList is poor in cache-.ity.
	• Memory overhead in the LinkedList is more as compared to the ArrayList. It is because, in a LinkedList, we have two extra links (next and previous) as it is required to store the address of the previous and the next nodes, and these links consume extra space. Such links are not present in an ArrayList.
