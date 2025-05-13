Here are various examples of looping through a `List` in Java using different approaches:

  1.  For Loop (Index-Based) 

import java.util.List;
import java.util.Arrays;
public class ListLoopExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

 Description : Loops through the list using an index to access each element.

  2.  Enhanced For Loop (For-Each Loop) 
	
	import java.util.List;
	import java.util.Arrays;
	public class ListLoopExample {
	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
	        for (String fruit : list) {
	            System.out.println(fruit);
	        }
	    }
	}
	
 Description : This is a simplified way to loop through the list elements without an index.


  3.  Iterator 
	
	import java.util.List;
	import java.util.Arrays;
	import java.util.Iterator;
	public class ListLoopExample {
	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}
	
 Description : Uses an `Iterator` to loop through the list elements. Good for removing elements during iteration.



  4.  ListIterator (For Bi-Directional Traversal) 

	import java.util.List;
	import java.util.Arrays;
	import java.util.ListIterator;
	public class ListLoopExample {
	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
	        ListIterator<String> listIterator = list.listIterator();
	        System.out.println("Forward iteration:");
	        while (listIterator.hasNext()) {
	            System.out.println(listIterator.next());
	        }
	        System.out.println("Backward iteration:");
	        while (listIterator.hasPrevious()) {
	            System.out.println(listIterator.previous());
	        }
	    }
	}

 Description : A `ListIterator` allows traversal in both forward and backward directions.


  5.  Streams (forEach Method) 
	
	import java.util.List;
	import java.util.Arrays;
	public class ListLoopExample {
	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
	        list.stream().forEach(fruit -> System.out.println(fruit));
	    }
	}
	
Note - why we used stream here and list.forEach(System.out::println); is it correct ? Yes it is

 Description : Uses Java 8's `Stream API` to loop through the list with a `forEach` method.

---

  6.  forEach (Method Reference) 

import java.util.List;
import java.util.Arrays;
public class ListLoopExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        list.forEach(System.out::println);
    }
}

 Description : Uses method references to iterate over the list. It’s concise and readable.

  7.  forEach (Lambda Expression) 

	import java.util.List;
	import java.util.Arrays;
	public class ListLoopExample {
	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
	        list.forEach(fruit -> System.out.println(fruit));
	    }
	}
	
 Description : Similar to streams but applied directly on the list without creating a stream.

  8.  Parallel Stream 
	
	import java.util.List;
	import java.util.Arrays;
	public class ListLoopExample {
	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
	        list.parallelStream().forEach(fruit -> System.out.println(fruit));
	    }
	}
	
 Description : Loops through the list in parallel, which could improve performance with large datasets.

These examples cover different ways to iterate over a list in Java, catering to various use cases such as performance, readability, or bidirectional traversal.
