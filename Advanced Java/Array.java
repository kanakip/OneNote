String[] cars = new String[2];  cars = {"sneha", "pallavi"};  - this is wrong 

    String [] cars ;
       cars = new String[2];
       cars = {'sneha','pallavi'};    - this is wrong 

Here's the corrected version of your code:
  
	1. String[] cars = new String[2];

	2. String[] cars;
    cars = new String[2];  // Initialize the array with size 2
    cars[0] = "sneha";     // Assign value to the first element
    cars[1] = "pallavi";       // Assign value to the second element
        
Alternatively, you can initialize the array and assign values at the same time:

String[] cars = {"sneha", "pallavi"};

Both options are correct, depending on your preference!

Q - share  me different ways of initializing

 array.

------------------------------------------------------------------------------------------------------------------------------------------------------------
For looping - 

public class loop1 {
        public static void main(String[] args) {
         
          // create an array
          int[] age = {12, 4, 5};
          System.out.println("Using for Loop:");
          for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
          }
        }
}


ForEach -


public class loop1 {
   
        public static void main(String[] args) {
          int[] age = {12, 4, 5};
          System.out.println("Using for-each Loop:");
          for(int a : age) {
            System.out.println(a);
          }
        }
       
}


Finding average and sum - 

public class loop1 {
                public static void main(String[] args) {
               
                  int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
                  int sum = 0;
                  Double average;
                 
                  for (int number: numbers) {
                    sum += number;
                  }
                 
                  int arrayLength = numbers.length;
               
                  average =  ((double)sum / (double)arrayLength);
               
                  System.out.println("Sum = " + sum);
                  System.out.println("Average = " + average);
                }
}



Assignment - 


public class loop1 {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40};
        int len = arr.length;
       
        double avg =  calculateAverage(arr,len);
        System.out.println("main double :"+avg);
                  
    }
    public static double calculateAverage(int[] arr, int arrSize) {
              
        int sum=0;
        for(int s : arr){
            sum += s;
        }
                   
        double avg = ((double)sum/(double)arrSize);
        System.out.println(avg);
        return  avg;
    }


//Find Maximum and Minimum in an Array:

public class loop1 {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40};
        MaxMin(arr);            
    }
    public static void MaxMin(int[] arr) {  // method should be static
        
       int max=arr[0],min=arr[0];  // initializing array first index valu
       for (int i=0; i<arr.length;i++) {
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];        
       }
       System.out.println("max :"+max+"\n min: "+min);
    }
                
}



// Reverse array 

i  j
1 4 = 50 20 30 40 10
2 3 = 50 40 30 20 10
3 2 = false // so it put as it is   i < j
4 1
5


10 20 30 40 50
 1  2  3  4  5
 
arr[i] = 10 arr[j] = 50

Rule - 
for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}


//Find reverse an Array:
public class loop1 {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60};
        revers(arr);            
    }
    public static void revers(int[] arr) {
        
        int start = 0, end = arr.length-1;
      //  using while loop
        while(start<end){
           int  temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // // using for loop
        // for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }
        for (int value : arr) {
            System.out.print(value + " ");
        }
        
    }
                
}


--------------------------------------

Binary Search using array -
Explanation:
	• binarySearch function:
		○ Takes a sorted array and the target value as inputs.
		○ Uses two pointers left and right to mark the range of the array being searched.
		○ Repeatedly calculates the middle index mid and compares it with the target value:
			§ If the middle element equals the target, return the index.
			§ If the middle element is smaller than the target, continue the search in the right half by adjusting left.
			§ If the middle element is larger, continue the search in the left half by adjusting right.
		○ If the element is not found, return -1.

public class loop1 {
    // Binary Search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2
;  // Avoid potential overflow
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80};  // Example sorted array
        int target = 50;  // Element to search for
        int result = binarySearch(sortedArray, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}



