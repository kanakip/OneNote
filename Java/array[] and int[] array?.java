What is the difference between int array[] and int[] array?
Both int array[] and int[] array are used to declare an array of integers in java. The only difference between them is on their syntax no functionality difference is present between them.
int arr[] is a C-Style syntax to declare an Array.
int[] arr is a Java-Style syntax to declare an Array.
However, it is generally recommended to use Java-style syntax to declare an Array. As it is easy to read and understand also it is more consistent with other Java language constructs.
What do you understand by the jagged array?
A jagged Array in Java is just a two-dimensional array in which each row of the array can have a different length. Since all the rows in a 2-d Array have the same length but a jagged array allows more flexibility in the size of each row. This feature is very useful in conditions where the data has varying lengths or when memory usage needs to be optimized.   
Syntax:
int[][] Arr = new int[][] {
    {1, 2, 8}, 
    {7, 5}, 
    {6, 7, 2, 6}
};
What are Classes in Java? 
In Java, Classes are the collection of objects sharing similar characteristics and attributes. Classes represent the blueprint or template from which objects are created.  Classes are not real-world entities but help us to create objects which are real-world entities. 
64. How is the ‘new’ operator different from the ‘newInstance()’ operator in Java?
To call contractor - simple ans
the new operator is used to create objects, but if we want to decide the type of object to be created at runtime, there is no way we can use the new operator. In this case, we have to use the newInstance() method.
What is the difference between static (class) method and instance method?
Static(Class) method	Instance method
Static method is associated with a class rather than an object.	The instance method is associated with an object rather than a class.
Static methods can be called using the class name only without creating an instance of a class.	The instance methods can be called on a specific instance of a class using the object reference.
Static methods do not have access to this keyword.	Instance methods have access to this keyword.
Static methods can access only static members of the class.	Instance methods can access both static and non-static methods of the class.
Static methods cannot be overridden because they are resolved at compile time, not at run time. This means that the compiler decides which method to call based on the reference type, not on the object type.	Instance methods can be overridden because they are resolved at run time, not at compile time. This means that the compiler decides which method to call based on the object type, not on the reference type.

 What will be the initial value of an object reference which is defined as an instance variable?
The initial value of an object reference which is defined as an instance variable is a NULL value.
70. What is an object?
An object is a self-contained unit that combines:
 
	1. State (data/properties)
	2. Behavior (methods/functions)
	3. Identity (unique instance in memory)
71. What are the different ways to create objects in Java?
Methods to create objects in Java are mentioned below:
	1. Using new keyword
	2. Using new instance
	3. Using clone() method
	4. Using deserialization
	5. Using the newInstance() method of the Constructor class
To know more about methods to create objects in Java refer to this article.

Can we override the private methods?
It is not possible to override the private methods in Java. Method overriding is where the method in the subclass is implemented instead of the method from the parent class. The private methods are accessible only within the class in which it is declared. Since this method is not visible to other classes and cannot be accessed, it cannot be overridden. 
Can you have virtual functions in Java?
Yes, Java supports virtual functions. Functions are by default virtual and can be made non-virtual using the final keyword.
What is BlockingQueue?

A blocking queue is a Queue that supports the operations that wait for the queue to become non-empty while retrieving and removing the element, and wait for space to become available in the queue while adding the element.

Can we change the scope of the overridden method in the subclass?
In Java, it is not possible to modify the overridden method’s scope. The subclass method’s scope must be equal to or wider than the Superclass method’s overridden method’s scope. The overridden method in the subclass, for instance, can have a public scope or a more accessible scope like protected or default if the overridden method in the superclass has a public scope. It cannot, however, have a more exclusive scope like private.


Changing Scope of Overridden Methods in Java
 
Basic Rule
 
The overridden method in subclass cannot be more restrictive but can be less restrictive than the method in superclass.
 
Access Modifier Hierarchy
 
From most restrictive to least restrictive:
 
1. private
2. default (package-private)
3. protected
4. public
 
Valid Examples
 

javaCopy to clipboard
class Parent {
    protected void display() {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    // Valid: protected → public (less restrictive)
    @Override
    public void display() {
        System.out.println("Child");
    }
}
 
Invalid Examples
 

javaCopy to clipboard
class Parent {
    public void show() {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    // Invalid: public → protected (more restrictive)
    @Override
    protected void show() {    // Compilation Error
        System.out.println("Child");
    }
}
 
Access Modifier Combinations
 
Parent Method	Allowed in Child
public	public only
protected	protected, public
default	default, protected, public
private	Not inherited
 
Important Points
 
5. Private Methods
• Cannot be overridden
• Are not inherited
6. Final Methods
• Cannot be overridden
• Scope is irrelevant
7. Static Methods
• Cannot be overridden
• Can only be hidden
8. Constructor
• Not inherited
• Cannot change access modifier
 
Remember:
 
• Always use @Override annotation
• Compiler checks access modifier rules
• Think of it as "widening" access
• Private methods create new method rather than override

From <https://highlight-chat-frontend.vercel.app/> 





