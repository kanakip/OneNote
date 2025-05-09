If we have threee class

one class -> static main method

secound class -> static method class

Thired class -> public method class
Show me this example

I'll create three classes demonstrating the interaction between static main method, static methods, and public methods.
 
Example with Three Classes
 
1. MainClass (Contains static main method)

public class MainClass {
    public static void main(String[] args) {
        // Call static methods directly from StaticMethodClass
        System.out.println("Calling static methods:");
        System.out.println("Sum: " + StaticMethodClass.add(10, 20));
        System.out.println("Multiply: " + StaticMethodClass.multiply(5, 6));
        System.out.println("Square: " + StaticMethodClass.square(7));
        
        // Create instance of PublicMethodClass to call its methods
        System.out.println("\nCalling public methods:");
        PublicMethodClass obj = new PublicMethodClass();
        obj.setName("John Doe");
        obj.setAge(25);
        
        // Call public methods
        obj.displayInfo();
        System.out.println("Is Adult? " + obj.isAdult());
        System.out.println("Name in uppercase: " + obj.getNameInUpperCase());
    }
}

2. StaticMethodClass (Contains static methods)


public class StaticMethodClass {
    // Static variable example
    private static int counter = 0;
    
    // Static methods can be called without creating an instance
    public static int add(int a, int b) {
        counter++;
        return a + b;
    }
    
    public static int multiply(int a, int b) {
        counter++;
        return a * b;
    }
    
    public static int square(int number) {
        counter++;
        return number * number;
    }
    
    // Static method to get counter
    public static int getCounter() {
        return counter;
    }
    
    // Static utility method for validation
    public static boolean isPositive(int number) {
        return number > 0;
    }
}

3. PublicMethodClass (Contains public instance methods)


public class PublicMethodClass {
    // Instance variables
    private String name;
    private int age;
    
    // Public constructor
    public PublicMethodClass() {
        this.name = "";
        this.age = 0;
    }
    
    // Public setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Public getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Other public methods
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public boolean isAdult() {
        return age >= 18;
    }
    
    public String getNameInUpperCase() {
        return name.toUpperCase();
    }
}



Output -

Calling static methods:
Sum: 30
Multiply: 30
Square: 49

Calling public methods:
Name: John Doe
Age: 25
Is Adult? true
Name in uppercase: JOHN DOE


o/p - 
Calling static methods:
Sum: 30
Multiply: 30
Square: 49

Calling public methods:
Name: John Doe
Age: 25
Is Adult? true
Name in uppercase: JOHN DOE
