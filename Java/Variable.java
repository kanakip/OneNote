Local Variable
A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
A local variable cannot be defined with "static" keyword.
No default value

Access modifiers cannot be used for local variables in Java. Local variables are confined to the scope of the method, constructor, or block in which they are declared. Applying access modifiers like public, private, or protected to them is unnecessary and will result in a compilation error. The only modifier allowed for local variables is final, which indicates that the variable's value cannot be changed after initialization. 
public class Example {
    public void myMethod() {
        // The following line will cause a compilation error
        // private int localVar = 10; 

        final int localVar = 10; // This is allowed
        // localVar = 20; // This will cause a compilation error because localVar is final
    }
}
The attempt to use an access modifier on a local variable, as shown in the commented-out line, will prevent the code from compiling.
2) Instance Variable
A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.
It is called an instance variable because its value is instance-specific and is not shared among instances.
Has a default value
3) Static variable
A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.

From <https://www.javatpoint.com/java-variables> 

