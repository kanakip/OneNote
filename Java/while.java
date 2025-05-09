While - A while loop in Java executes certain block of code repeatedly until the specified condition evaluates to be true. It terminates as soon as the condition becomes false.

- The condition is checked  before  executing the loop's code block.
- If the condition is false from the start, the loop will never run.
  
   Example :

	  int i = 0;
	  while (i < 5) {
	      System.out.println(i);
	      i++;
	  }
	 
	  Output: 0, 1, 2, 3, 4
	
Do-while - A do...while loop is used when you want that certain block of code should run at least once before checking the loop condition.

- The code block is executed  once  before the condition is checked.
- It ensures the code runs at least once, even if the condition is false.

   Example :
 
	 int i = 0;
	  do {
	      System.out.println(i);
	      i++;
	  } while (i < 5);
	
	  Output: 0, 1, 2, 3, 4

 # Key Difference:
-  While  checks the condition first;  do-while  executes once and checks later.
