In Java, all non-static methods are virtual by default. This means that unless a method is marked as final, it can be overridden in a subclass, enabling runtime polymorphism.
How  Work in Java:
	• Java does not have an explicit virtual keyword like C++.
	• All instance methods are virtual unless they are final, private, or static.
	• Dynamic method dispatch ensures that the overridden method in the derived class is called at runtime.
Example:

class Parent {
    void show() { // Virtual function (implicitly)
        System.out.println("Parent class show()");
    }
}
class Child extends Parent {
    @Override
    void show() { // Overriding the virtual function
        System.out.println("Child class show()");
    }
}
public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Parent reference, Child object
        obj.show(); // Calls Child's show() due to dynamic binding
    }
}

Output:
Child class show()
Key Takeaways:
	• Java automatically treats instance methods as virtual.
	• Overriding allows dynamic method dispatch.
	• Final methods cannot be overridden, making them non-virtual.
Want to explore more? Check out this resource for additional details! Let me know if you need further clarification. 😊
