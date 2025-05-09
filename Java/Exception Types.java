Here are the different types of Exceptions in Java with examples:
 
1. Checked Exceptions (Compile-time)
 
These must be handled using try-catch or declared using throws.
 
public class CheckedExceptionExample {
    // 1. IOException
    void fileOperation() {
        try {
            FileReader file = new FileReader("file.txt");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
    // 2. SQLException
    void databaseOperation() {
        try {
            Connection conn = DriverManager.getConnection("url");
        } catch (SQLException e) {
            System.out.println("Database error");
        }
    }
    // 3. ClassNotFoundException
    void loadClass() {
        try {
            Class.forName("com.example.MyClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
 
2. Unchecked Exceptions (Runtime)
 
These don't need to be explicitly handled.
 

javaCopy to clipboard
public class UncheckedExceptionExample {
    // 1. NullPointerException
    void nullPointer() {
        String str = null;
        try {
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Null reference");
        }
    }
    // 2. ArrayIndexOutOfBoundsException
    void arrayIndex() {
        try {
            int[] arr = new int[5];
            arr[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        }
    }
    // 3. ArithmeticException
    void arithmetic() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
    // 4. NumberFormatException
    void numberFormat() {
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
 
3. Error
 
Serious problems that shouldn't be caught.
 

javaCopy to clipboard
public class ErrorExample {
    // 1. StackOverflowError
    void stackOverflow() {
        stackOverflow();  // Recursive call
    }
    // 2. OutOfMemoryError
    void outOfMemory() {
        try {
            int[] bigArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory");
        }
    }
}
 
4. Custom Exceptions
 


// Custom checked exception
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}
// Custom unchecked exception
class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}
public class CustomExceptionExample {
    // Using custom checked exception
    void validateAge(int age) throws CustomCheckedException {
        if (age < 0) {
            throw new CustomCheckedException("Age cannot be negative");
        }
    }
    // Using custom unchecked exception
    void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new CustomUncheckedException("Name cannot be empty");
        }
    }
}
 
Exception Hierarchy
 

plaintextCopy to clipboard
                   Throwable
                      |
          -------------------------
          |                       |
      Exception                 Error
          |
    ----------------
    |              |
RuntimeException  IOException, SQLException, etc.
    |
NullPointerException,
ArithmeticException,
etc.
 
Common Exception Categories:
 
1. Input/Output Exceptions:
 

javaCopy to clipboard
// FileNotFoundException
// IOException
try {
    FileInputStream file = new FileInputStream("nonexistent.txt");
} catch (FileNotFoundException e) {
    System.out.println("File not found");
}
 
2. Database Exceptions:
 

javaCopy to clipboard
// SQLException
try {
    Connection conn = DriverManager.getConnection("invalid_url");
} catch (SQLException e) {
    System.out.println("Database connection error");
}
 
3. Network Exceptions:
 

javaCopy to clipboard
// SocketException
// UnknownHostException
try {
    Socket socket = new Socket("invalidhost", 80);
} catch (UnknownHostException e) {
    System.out.println("Host not found");
} catch (IOException e) {
    System.out.println("Connection error");
}
 
4. Collection Exceptions:
 

javaCopy to clipboard
// ConcurrentModificationException
// NoSuchElementException
List<String> list = new ArrayList<>();
try {
    Iterator<String> iter = list.iterator();
    list.add("item");  // Modifying while iterating
    iter.next();
} catch (ConcurrentModificationException e) {
    System.out.println("Collection modified during iteration");
}
 
Remember:
 
1. Checked Exceptions:
• Must be handled or declared
• Represent recoverable conditions
2. Unchecked Exceptions:
• Don't need explicit handling
• Usually programming errors
3. Errors:
• Serious problems
• Usually not recoverable
• Shouldn't be caught
4. Best Practices:
• Handle specific exceptions before general ones
• Don't catch Error or RuntimeException unless necessary
• Always provide meaningful error messages
• Close resources in finally block or use try-with-resources

From <https://highlight-chat-frontend.vercel.app/> 

