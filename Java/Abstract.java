Abstract in Java
Abstraction in Java is a fundamental concept in object-oriented programming that focuses on hiding the implementation details and showing only the essential 
	features of an object. This helps in reducing complexity and increasing efficiency. In Java, abstraction can be achieved using abstract classes 
	and interfaces.

• Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
• Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

Key Features of Abstract Classes:
	1. Declaration: An abstract class is declared using the abstract keyword. It can contain both abstract methods (without body) 
	    and concrete methods (with body) [1].
	2. Instantiation: Abstract classes cannot be instantiated directly. They are meant to be subclassed [2].
	3. Purpose: They provide a blueprint for subclasses, which must implement the abstract methods [3].

Example:

	abstract class Animal {
    abstract void sound();
}
	class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
This design allows for polymorphism, where the method that gets executed is determined at runtime, depending on the object type [5].

Extends


-------------------

In Java, the `abstract` keyword is used to define abstract classes and abstract methods. Here's a breakdown of what it means:

### **Abstract Classes**
- An abstract class is a class that cannot be instantiated directly.
- It may contain abstract methods (methods without a body) as well as **concrete methods** (methods with implementation).
- It serves as a blueprint for subclasses to implement abstract methods.

Abstract Methods
- An abstract method is a method that is declared without an implementation.
- It must be implemented by subclasses unless they are also abstract.
- Abstract methods force child classes to provide specific behavior.

Example of an Abstract Class and Method

// Abstract class
abstract class Animal {
    abstract void makeSound(); // Abstract method

    void sleep() { // Concrete method
        System.out.println("Sleeping...");
    }
}

// Subclass implementing the abstract method
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark!");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Bark!
        myDog.sleep(); // Output: Sleeping...
    }
}

Key Points
✔ An abstract class can't be instantiated.  
✔ If a class has at least one abstract method, it must be declared abstract.  
✔ Subclasses must override abstract methods unless they are also abstract.  
✔ Abstract classes can have constructors, fields, and concrete methods.



