final	finally	finalize
final is a keyword and access modifier, which is used to apply restrictions on a class, method, or variable.	finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not.	finalize is the method in Java that is used to perform clean-up processing just before an object is garbage collected.
The final keyword is used with the classes, methods, and variables.	Finally, the block is always related to the try-catch block in exception handling.	finalize() method is used with the objects.
It is used with variables, methods, and classes.	It is with the try-catch block in exception handling.	Used with objects
Once declared, the final variable becomes constant and can't be modified. A sub-class can neither override a final method nor can the final class be inherited.	finally block cleans up all the resources used in the try block	finalize method performs the cleaning concerning the object before its destruction
final method is executed only when we call it	finally block executes as soon as the execution of the try-catch block is completed without depending on the exception	finalize method is executed just before the object is destroyed

Key Points
 
1. final:
	• Used with classes, methods, variables
	• Indicates immutability
	• Improves security and performance
2. finalize:
	• Called before garbage collection
	• Not guaranteed to be called
	• Deprecated in newer Java versions
	• Better to use try-with-resources
3. finally:
	• Always executes after try-catch
	• Used for cleanup code
	• Executes even if exception occurs
	• Modern alternative: try-with-resources




1. final Keyword

	// 1. final Class - cannot be inherited
	final class FinalClass {
	    // Class implementation
	}
	// 2. final Method - cannot be overridden
	class Parent {
	    final void display() {
	        System.out.println("This method cannot be overridden");
	    }
	}
	// 3. final Variable - cannot be modified
	public class FinalExample {
	    final int CONSTANT = 100;
	    final String NAME;
	    
	    // final variable initialization in constructor
	    FinalExample() {
	        NAME = "John";
	    }
	    
	    void method() {
	        final int localVar = 10;
	        // localVar = 20; // Error: cannot modify final variable
	    }
	}
	
2. finalize Method

public class FinalizeExample {
    private String name;
    
    FinalizeExample(String name) {
        this.name = name;
    }
    
    // finalize method called by garbage collector
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalizing object: " + name);
            // cleanup code here
        } finally {
            super.finalize();
        }
    }
    
    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample("Test Object");
        obj = null; // making object eligible for garbage collection
        System.gc(); // requesting garbage collection
    }
}

3. finally Block


public class FinallyExample {
    // Example 1: Basic try-catch-finally
    public void basicExample() {
        try {
            System.out.println("Try block");
            throw new Exception("Test Exception");
        } catch (Exception e) {
            System.out.println("Catch block: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes");
        }
    }
    
    // Example 2: Resource management
    public void resourceExample() {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            // File operations
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
    
    // Example 3: Try-with-resources (modern approach)
    public void modernResourceExample() {
        try (FileReader reader = new FileReader("file.txt")) {
            // File operations
        } catch (IOException e) {
            System.out.println("Error with file");
        }
        // finally block implicit in try-with-resources
    }
}

