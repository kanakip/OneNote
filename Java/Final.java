Note - 
Methods and classes can also be marked final. This serves to restrict methods so that they can't be overridden and classes so that they can't be subclassed.


The final keyword in Java is a non-access modifier used to restrict modifications to variables, methods, and classes.
Usage of final in Java
	1. Final Variables (Constants)
		○ A variable declared as final cannot be changed after initialization.
		○ Example: 
final int PI = 3.14159; // Cannot be modified later

	2. Final Methods (Prevent Overriding)
		○ A method declared as final cannot be overridden by subclasses.
		○ Example: 
class Parent {
    final void show() {
        System.out.println("This is a final method.");
    }
}
class Child extends Parent {
    // ERROR: Cannot override final method
    void show() { 
        System.out.println("Trying to override.");
    }
}

	3. Final Classes (Prevent Inheritance)
		○ A class declared as final cannot be extended.
		○ Example: 
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}
// ERROR: Cannot extend a final class
class SubClass extends FinalClass { }

Key Characteristics
	• Final variables must be initialized either at declaration or in the constructor.
	• Final methods improve security by preventing unintended modifications.
	• Final classes ensure that their functionality remains unchanged.
For a deeper dive, check out this guide. Would you like me to explain how final affects performance or memory management? 😊





