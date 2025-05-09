Interface in Java
In Java, an interface is a reference type, similar to a class, that can contain only abstract methods (methods without a body) and static constants. Interfaces define a contract for classes to implement, ensuring that certain methods are available for use. Here are key points about interfaces:
	1. Blueprint of Behavior: An interface specifies what a class must do, but not how it does it. It acts as a blueprint for classes to follow [1].
	2. No Implementation: Interfaces cannot contain any method implementations (prior to Java 8). All methods are implicitly abstract and public [3].
	3. Multiple Inheritance: A class can implement multiple interfaces, allowing Java to support multiple inheritance of type [2].
	4. Default Methods: Since Java 8, interfaces can have default methods with an implementation, allowing them to evolve without breaking existing implementations [2].
	5. Usage: Interfaces are used to achieve abstraction and to provide a way to achieve loose coupling in applications [5].
Overall, interfaces are essential for defining capabilities in a system while promoting modular and maintainable code.


Notes on Interfaces:
	• Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
	• Interface methods do not have a body - the body is provided by the "implement" class
	• On implementation of an interface, you must override all of its methods
	• Interface methods are by default abstract and public
	• Interface attributes are by default public, static and final
	• An interface cannot contain a constructor (as it cannot be used to create objects)

From <https://www.w3schools.com/java/java_interface.asp> 

implements
