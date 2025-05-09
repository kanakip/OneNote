Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
We use wrapper with collection 
ArrayList<Integer> myNumbers = new ArrayList<Integer>();


Primitive Data Type	Wrapper Class
byte	Byte
short	Short
int	Integer
long	Long
float	Float
double	Double
boolean	Boolean
char	Character

	1. Wrapper classes are final and immutable
	2. Provides methods like valueOf(), parseInt(), etc.
	3. It provides the feature of autoboxing and unboxing.


Wrapper classes are final and immutable ??
 
Final Classes
	• All wrapper classes (Integer, Boolean, Character, etc.) are declared as final
	• This means they cannot be inherited/extended
	• Prevents creation of subclasses that could potentially alter their behavior
 
Immutability
 
	1. Instance variables are final
		○ The internal value cannot be changed after object creation
		○ Example: private final int value; in Integer class
	2. No setter methods
		○ Only getter methods are provided
		○ Operations create new objects instead of modifying existing ones
	Example
	 
	Integer num1 = new Integer(5);
Integer num2 = num1; // Both reference same object
num1 = 6; // Creates new Integer object, num2 still holds 5
 Benefits of Immutability
 
	1. Thread Safety
		○ Safe for concurrent access
		○ No synchronization needed
	2. Security
		○ Values cannot be modified after creation
		○ Prevents accidental changes
	3. Cache Benefits
		○ Allows caching of frequently used values
		○ Example: Integer cache for values -128 to 127

Remember: When performing operations on wrapper classes, new objects are created instead of modifying existing ones, maintaining immutability.


Another useful method is the toString() method, which is used to convert wrapper objects to strings.
In the following example, we convert an Integer to a String, and use the length() method of the String class to output the length of the "string":
Example
public class Main {
  public static void main(String[] args) {
    Integer myInt = 100;
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}
