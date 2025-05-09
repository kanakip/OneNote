Let me explain Anonymous classes in a simple way:

A nested class that doesn't have any name is known as an anonymous class.
An anonymous class must be defined inside another class. Hence, it is also known as an anonymous inner class. Its syntax is:
class outerClass {
// defining anonymous class
    object1 = new Type(parameterList) {
         // body of the anonymous class
    };
}

From <https://www.programiz.com/java-programming/anonymous-class> 




 
Definition: An Anonymous class is a class without a name that is defined and created at the same time. It's like creating a one-time-use class "on the spot."
 
Here are two simple examples:
 
Example 1: With Interface
 

// 1. Define an interface
interface Animal {
    void makeSound();
}
public class Main {
    public static void main(String[] args) {
        // Creating anonymous class
        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Woof!");
            }
        };
        
        // Using it
        dog.makeSound();  // Output: Woof!
    }
}
