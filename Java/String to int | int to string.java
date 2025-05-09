convert an int to a string in Java. Here are some common methods:
 
1. Using String.valueOf()

int number = 123;
String str = String.valueOf(number);
2. Using Integer.toString()

int number = 123;
String str = Integer.toString(number);
3. Using String Concatenation

int number = 123;
String str = number + "";

convert a string to an int in Java:
 
4. Using Integer.parseInt()
This is the most common method. Note that if the string does not contain a parsable integer, a NumberFormatException will be thrown.

String numberStr = "123";
int number = Integer.parseInt(numberStr);
5. Using Integer.valueOf()
This method returns an Integer object, which can be unboxed to an int.

String numberStr = "123";
int number = Integer.valueOf(numberStr);
 
Always make sure the string is a valid integer representation before conversion, or handle potential exceptions using a try-catch block.





