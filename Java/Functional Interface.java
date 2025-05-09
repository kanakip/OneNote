Functional Interface is also known as Single Abstract Method Interfaces
It can have any number of default, static methods but can contain only one abstract method. 

• Contains exactly one abstract method
• Can have multiple default and static methods
• Annotated with @FunctionalInterface (optional but recommended)

Eg1 -

@FunctionalInterface  
interface sayable{  
    void say(String msg);  
}  
public class FunctionalInterfaceExample implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.say("Hello there");  
    }  
}  
Custom Functional Interface
 
@FunctionalInterface
interface Calculator {
    int calculate(int x, int y);
    
    // Can have default methods
    default void printInfo() {
        System.out.println("Calculator Interface");
    }
    
    // Can have static methods
    static void about() {
        System.out.println("Calculator Operations");
    }
}
// Usage
Calculator addition = (a, b) -> a + b;
int sum = addition.calculate(5, 3); // 8



https://www.javatpoint.com/java-8-functional-interfaces

https://www.geeksforgeeks.org/function-interface-in-java-with-examples/


