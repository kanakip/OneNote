- is used for iterating a block of code multiple times based on a condition. It has three components: initialization, condition, and increment/decrement. 

Types of For Loops:

1. Basic For Loop: Used when the number of iterations is known.
  
   for(int i = 0; i < 5; i++) {
       System.out.println(i);
   }
  
   Output: 0, 1, 2, 3, 4

2. Enhanced For Loop (For-each Loop): Used to iterate over arrays or collections.
  
   int[] numbers = {1, 2, 3, 4};
   for(int num : numbers) {
       System.out.println(num);
   }

   Output: 1, 2, 3, 4

The basic for loop is ideal for repetitive tasks, while the enhanced for loop simplifies iterating over collections.


