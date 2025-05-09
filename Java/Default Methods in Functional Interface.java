A default method is a method with an implementation defined in an interface. It was introduced in Java 8.
 
Basic Syntax
 
interface MyInterface {
    // Abstract method (regular interface method)
    void abstractMethod();
    
    // Default method
    default void defaultMethod() {
        System.out.println("Default method implementation");
    }
}
