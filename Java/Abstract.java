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



