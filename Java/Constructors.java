 A constructor in Java is a special method used to initialize objects. It is invoked when an object of a class is created and cannot have a return type. Constructors have the same name as the class.

 # Types of Constructors in Java:
1.  Default Constructor : A constructor with no parameters that initializes object fields with default values.

   class Example {
       Example() {
           System.out.println("Default Constructor");
       }
   }
   
2.  Parameterized Constructor : A constructor that takes arguments to initialize an object with specific values.

   class Example {
       Example(int x) {
           System.out.println("Parameterized Constructor: " + x);
       }
   }

3.  Copy Constructor : A constructor that creates a copy of an object by taking an object of the same class as a parameter.
  
   class Example {
       int x;
       Example(Example obj) {
           this.x = obj.x;
       }
   }

Eg - 

public class Student {
    private String name;
    private int age;
    private double gpa;
    
    // Normal constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    // Copy constructor
    public Student(Student originalStudent) {
        // Copy all the fields from the original object
        this.name = originalStudent.name;
        this.age = originalStudent.age;
        this.gpa = originalStudent.gpa;
    }
    
    // Example usage
    public static void main(String[] args) {
        // Create original student
        Student student1 = new Student("John", 20, 3.8);
        
        // Create a copy using copy constructor
        Student student2 = new Student(student1);
        
        // Now student2 is a separate object with the same values
    }
}


# chaining constructor

  🗒️ Answer
Constructor chaining in Java refers to the process where one constructor calls another constructor within the same class or from a parent class. This is often done to avoid code duplication when initializing an object with multiple constructors.

 # How Constructor Chaining Works:
1.  Within the Same Class : A constructor can call another constructor in the same class using the `this()` keyword.
 
   class Example {
       Example() {
           this(10); // Calls parameterized constructor
           System.out.println("Default constructor");
       }
       Example(int x) {
           System.out.println("Parameterized constructor: " + x);
       }
   }
   

2.  From Parent Class : A constructor in a subclass can call a constructor of its parent class using the `super()` keyword.
   
   class Parent {
       Parent() {
           System.out.println("Parent constructor");
       }
   }
   class Child extends Parent {
       Child() {
           super(); // Calls Parent constructor
           System.out.println("Child constructor");
       }
   }
   
	
Constructor chaining is useful for initializing an object in multiple ways while reusing code.


# Constructor overriding in Java

 In Java, constructors  cannot be overridden . This is because:

1.  Constructors Are Not Inherited : Unlike methods, constructors are not inherited by subclasses. Each class has its own constructor(s), and they are not treated like regular methods that can be overridden.

2.  Same Name Requirement : While you can define a constructor in a subclass with the same name as the superclass constructor, this does not constitute overriding. The constructor in the subclass merely shadows the superclass constructor and is treated as a separate constructor 

3.  Overloading vs. Overriding : Constructors can be overloaded (multiple constructors with different parameters), but overriding, as seen with methods, is not applicable to constructors
 
What happens if you don’t provide a constructor in a class?
If you don’t provide a constructor in a class in Java, the compiler automatically generates a default constructor with no arguments and no operation which is a default constructor.
What do you mean by aggregation?

Aggregation is a term related to the relationship between two classes best described as a “has-a” relationship. This kind is the most specialized version of association. It is a unidirectional association means it is a one-way relationship. It contains the reference to another class and is said to have ownership of that class.
98. What is the composition of Java?
Composition implies a relationship where the child cannot exist independently of the parent. For example Human heart, the heart doesn’t exist separately from a Human.
99. State the difference between Composition and Aggregation.
Aggregation	Composition
It defines a “has a” relationship between the objects	It represents the part-of relationship
Objects are independent of each other.	Objects are dependent on each other.
Represent it by using the empty diamond.	Represent it by using the filled diamond.
Child objects don’t have a lifetime.	Child objects have a lifetime.

From <https://www.geeksforgeeks.org/java-interview-questions/> 
