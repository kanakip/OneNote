Let me explain the finalize() method in Java and its key aspects.
 
What is ()?
 
The finalize() method is a special method in Java that gets called by the Garbage Collector (GC) before destroying an object to perform cleanup operations.
 
Basic Syntax
 
protected void finalize() throws Throwable {
    // cleanup code
    try {
        // release resources
    } finally {
        super.finalize();
    }
}
 
Key Points
 
1. Purpose
	• Resource cleanup
	• Releasing system resources
	• Closing database connections
	• Closing file handles
2. Characteristics
	• Called only once per object
	• Protected method
	• Cannot be static
	• Can throw exceptions
	• No guarantee of execution
3. Important Limitations
	• Not recommended for modern Java
	• No guaranteed execution time
	• May never be called if program exits
	• Can cause performance issues
