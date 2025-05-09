The `super` keyword is used to reference the parent class of an object. It serves three main purposes:

1.  Access Parent Class Methods : You can use `super.methodName()` to call a method from the parent class that has been overridden in the child class.
2.  Access Parent Class Variables : If the child class has variables with the same names as those in the parent class, you can use `super.variableName` to access the parent class variable.
3.  Call Parent Class Constructor : You can use `super()` to invoke the parent class's constructor, especially when you need to initialize variables or methods in the parent class before the child class.

class Animal {
    String sound = "Generic Animal Sound";
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    String sound = "Bark";
    void makeSound() {
        // Calls the parent class method
        super.makeSound();
        System.out.println("Dog makes sound: " + sound);
    }
    void displaySound() {
        // Accesses parent class variable
        System.out.println("Animal sound: " + super.sound);
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Calls both Dog and Animal sounds
        dog.displaySound(); // Displays the parent class's sound
    }
}


Animal makes sound
Dog makes sound: Bark
Animal sound: Generic Animal Sound

