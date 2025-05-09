
print, println, and printf all are used for printing the elements but print prints all the elements and the cursor remains in the same line. println shifts the cursor to next line. And with printf we can use format identifiers too.


String name = "John";
int age = 25;
double height = 5.9;

System.out.printf("Name: %s, Age: %d, Height: %.1f", name, age, height);
// Output: Name: John, Age: 25, Height: 5.9

// Width and alignment
System.out.printf("%-10s|%10s%n", "Left", "Right");
// Output: Left      |     Right
