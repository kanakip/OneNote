
Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.


1. Compile-Time Polymorphism (Method Overloading): This occurs when multiple methods in the same class have the same name but different parameters (type or number). The method to be executed is determined at compile time. For example:

   void display(int a) { }
   void display(String b) { }
   

2. Runtime Polymorphism (Method Overriding): This occurs when a subclass provides a specific implementation of a method already defined in its superclass. The method that gets executed is determined at runtime, allowing for dynamic method dispatch. For example:

   class Animal {
       void sound() { System.out.println("Animal makes sound"); }
   }
   class Dog extends Animal {
       void sound() { System.out.println("Dog barks"); }
   }


Polymorphism enhances flexibility and scalability in code, allowing methods to handle different data types and objects seamlessly. 
