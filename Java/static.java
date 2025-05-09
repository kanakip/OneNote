Static in Java
Def - 
The static keyword is used to share the same variable or method of a given class. Static variables are the variables that once declared then a single copy of the variable is created and shared among all objects at the class level.

Static Variables:

1. Shared among instances
2. Initialized only once
3. Accessible via class name or instance

In Java, the static keyword is used to define class-level variables and methods that can be accessed without creating an instance of the class. This keyword serves several important purposes:
	1. Static Variables: These are shared among all instances of a class. A static variable belongs to the class itself rather than any particular object. It is initialized only once, at the start of the program.
	2. Static Methods: Like static variables, static methods can be called without creating an object of the class. They can only directly access other static variables or methods. This is useful for utility or helper functions that don't require object state.
	3. Static Blocks: These are used for static initializations of a class. The code within a static block runs when the class is loaded, allowing you to set up static variables or perform operations.
Overall, the static keyword enhances memory management and provides a way to manage shared data effectively 


Note - If we want to create public method without static method then you need to create object to call public method inside the class
If you want to call static method then no need to create object of that class. It will call without creating object.

public class Hello {
    public void hi()
    {
    System.out.println("hii");
    }       
    public static void main(String[] args) {
        System.out.println("Hello Pallavi");
        Hello h = new Hello();
       h. hi();
    }
}

1. Static Variables (Class Variables)
 
Static variables belong to the class rather than instances and are shared among all objects.


public class StaticVariableExample {
    static int counter = 0;  // Static variable
    String name;
    public StaticVariableExample(String name) {
        this.name = name;
        counter++;  // Counts number of instances created
    }
    public static void main(String[] args) {
        StaticVariableExample obj1 = new StaticVariableExample("First");
        System.out.println("Counter: " + counter);  // Output: 1
        StaticVariableExample obj2 = new StaticVariableExample("Second");
        System.out.println("Counter: " + counter);  // Output: 2
    }
}

2. Static Methods
 
Static methods belong to the class and can be called without creating an instance.

public class StaticMethodExample {
    static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        // Call static method without creating instance
        int result = StaticMethodExample.multiply(5, 3);
        System.out.println("Result: " + result);  // Output: 15
    }
}


3. Static Block
 
Static blocks are executed when the class is loaded into memory, before any static methods or instance creation.

public class StaticBlockExample {
    static int[] numbers;
    
    // Static block
    static {
        numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
    }
    public static void main(String[] args) {
        // numbers array is already initialized
        for (int num : numbers) {
            System.out.print(num + " ");  // Output: 0 2 4 6 8
        }
    }
}

4. Static Nested Classes
 
A static nested class is a static member of the outer class and can be accessed without an instance of the outer class.

public class OuterClass {
    private static String msg = "Hello";
    
    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println(msg);  // Can access static members of outer class
        }
    }
    public static void main(String[] args) {
        // Create instance of static nested class without outer class instance
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();  // Output: Hello
    }
}

5. Static Import
 
Static import allows you to use static members of a class without class qualification.

import static java.lang.Math.*;  // Static import
public class StaticImportExample {
    public static void main(String[] args) {
        // Using static members directly without Math prefix
        double radius = 5.0;
        double area = PI * pow(radius, 2);
        System.out.println("Area: " + area);
    }
}

6. Static Constants
 
Static final variables are constants that belong to the class.


public class StaticConstantsExample {
    public static final double PI = 3.14159;
    public static final String APP_NAME = "MyApplication";
    
    public static void main(String[] args) {
        System.out.println("PI value: " + PI);
        System.out.println("App Name: " + APP_NAME);
    }
}

