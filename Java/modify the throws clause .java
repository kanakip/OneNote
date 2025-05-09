Can we modify the throws clause of the superclass method while overriding it in the subclass?

Modifying throws Clause in Method Overriding
 
Basic Rules
 
1. Subclass method can throw fewer exceptions
2. Subclass method can throw narrower exceptions
3. Subclass method can throw unchecked exceptions
4. Subclass method cannot throw broader or new checked exceptions
 
Valid Scenarios
 
1. Throwing No Exception
 

javaCopy to clipboard
class Parent {
    void show() throws IOException {
        // code
    }
}
class Child extends Parent {
    @Override
    void show() {  // Valid: removing exception
        // code
    }
}
 
2. Throwing Narrower Exception
 

javaCopy to clipboard
class Parent {
    void display() throws IOException {
        // code
    }
}
class Child extends Parent {
    @Override
    void display() throws FileNotFoundException {  // Valid: FileNotFoundException is subclass of IOException
        // code
    }
}
 
3. Throwing Unchecked Exception
 

javaCopy to clipboard
class Parent {
    void process() throws IOException {
        // code
    }
}
class Child extends Parent {
    @Override
    void process() throws RuntimeException {  // Valid: unchecked exception
        // code
    }
}
 
Invalid Scenarios
 
1. Throwing Broader Exception
 

javaCopy to clipboard
class Parent {
    void show() throws FileNotFoundException {
        // code
    }
}
class Child extends Parent {
    @Override
    void show() throws IOException {  // Invalid: IOException is broader
        // code
    }
}
 
2. Throwing New Checked Exception
 

javaCopy to clipboard
class Parent {
    void display() throws IOException {
        // code
    }
}
class Child extends Parent {
    @Override
    void display() throws SQLException {  // Invalid: new checked exception
        // code
    }
}
 
Exception Hierarchy
 

plaintextCopy to clipboard
                Throwable
                /       \
           Error       Exception
                      /        \
        CheckedException    RuntimeException
        (IOException)       (unchecked)
 
Summary Table
 
Parent Method Throws	Valid Child Method Throws	Invalid Child Method Throws
IOException	FileNotFoundException	Exception
IOException	No exception	SQLException
RuntimeException	Any RuntimeException	Checked Exception
No exception	RuntimeException	Checked Exception
 
Key Points
 
1. Checked Exceptions
• Must be declared or handled
• Follow inheritance rules strictly
2. Unchecked Exceptions
• Can be thrown anywhere
• No declaration needed
3. Best Practices
• Declare specific exceptions
• Document exceptions clearly
• Use try-catch appropriately
 
Remember:
 
• Always use @Override annotation
• Consider exception hierarchy
• RuntimeException is always allowed
• Cannot add new checked exceptions
• Can remove or narrow exceptions

From <https://highlight-chat-frontend.vercel.app/> 

