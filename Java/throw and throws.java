https://www.scholarhat.com/tutorial/java/exception-handling-in-java


5. throws - uses checked exception - compile time
The throws keyword is used in the method signature to indicate that a method in Java can throw particular exceptions.

4. throw - checked and uncheck exception1
	• The throw keyword is used to explicitly throw a checked or an unchecked exception.

	• The program's execution flow stops immediately after the throw statement is executed, and the nearest try block is checked to see if it has a catch statement that matches the type of exception.

From <https://www.scholarhat.com/tutorial/java/exception-handling-in-java> 


Checked exception - compile time
Unchecked exception - runtime 

// FIG
  // FIG





Keyword	Description
try	The "try" keyword specifies an exception block.
catch	specifies the code block to be executed if an exception occurs in the try block.
finally	the finally block will always be executed whether an exception occurs or not
throw	the "throw" keyword triggers an exception
throws	The "throws" keyword declares an exception.

From <https://www.scholarhat.com/tutorial/java/exception-handling-in-java> 

throw Vs. throws in Java
throw	throws
The throw keyword is used to explicitly throw an exception inside any block of code or function in the program.	
Java throws keyword is used in method or function signature to declare an exception that the method may throw while execution of code

throw keyword can be used to throw both checked and unchecked exceptions
throws keyword can be used only with checked exceptions.

throw is used within the method.
throws is used within the method signature

Syntax: throw new exception_class("error message");	
Syntax: void method() throws ArithmeticException

We can throw only one exception at a time	
We can declare multiple exceptions using the throws keyword that the method can throw

From <https://www.scholarhat.com/tutorial/java/exception-handling-in-java> 


//FIG
