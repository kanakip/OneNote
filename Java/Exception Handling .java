Here's a clear explanation of Exception Handling in Java with examples:
 
1. Basic Try-Catch
 
public class BasicExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
 
2. Multiple Catch Blocks
 


public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50;  // ArrayIndexOutOfBoundsException
            int result = 10 / 0;  // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error!");
        } catch (Exception e) {
            System.out.println("General error!");
        }
    }
}
 
3. Try-Catch-Finally
 

javaCopy to clipboard
public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            // Some code that might throw exception
            System.out.println("Try block");
            throw new Exception("Test Exception");
        } catch (Exception e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block - Always executes");
        }
    }
}
 
4. Custom Exception
 

javaCopy to clipboard
// Custom Exception class
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
public class CustomExceptionExample {
    public static void validateAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("Age cannot be negative");
        }
    }
    public static void main(String[] args) {
        try {
            validateAge(-5);
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 
5. Try-with-Resources
 

javaCopy to clipboard
public class ResourceExample {
    public static void main(String[] args) {
        // Automatically closes resources
        try (FileReader fr = new FileReader("file.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
 
6. Throw and Throws
 

javaCopy to clipboard
public class ThrowExample {
    // Method declares it might throw exception
    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        System.out.println(a / b);
    }
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 
Common Exception Types
 

javaCopy to clipboard
// 1. NullPointerException
String str = null;
try {
    str.length();  // This will throw NullPointerException
} catch (NullPointerException e) {
    System.out.println("Null object reference");
}
// 2. ArrayIndexOutOfBoundsException
try {
    int[] arr = new int[5];
    arr[10] = 50;  // This will throw ArrayIndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index error");
}
// 3. NumberFormatException
try {
    int num = Integer.parseInt("abc");  // This will throw NumberFormatException
} catch (NumberFormatException e) {
    System.out.println("Invalid number format");
}
 
Best Practices
 

javaCopy to clipboard
public class BestPracticesExample {
    public static void main(String[] args) {
        // 1. Always catch specific exceptions first
        try {
            // Some code
        } catch (NullPointerException e) {
            // Handle specific exception
        } catch (Exception e) {
            // Handle general exception
        }
        // 2. Use finally for cleanup
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
        // 3. Use try-with-resources for auto-closeable resources
        try (Scanner scanner = new Scanner(System.in)) {
            // Use scanner
        }
    }
}
 
Remember:
 
1. Always catch specific exceptions before general ones
2. Use finally block for cleanup code
3. Prefer try-with-resources for handling resources
4. Create custom exceptions for specific business logic
5. Don't catch exceptions you can't handle
6. Always include meaningful error messages

From <https://highlight-chat-frontend.vercel.app/> 
