In Java, arrays themselves do not have built-in methods like collections (List, Set, etc.). However, the Arrays class in the java.util package provides utility methods to manipulate arrays. Below are some useful methods from the Arrays class:
1. Arrays.toString(array)
	• Converts the array to a String representation.
	
	int[] arr = {1, 2, 3};
	System.out.println(Arrays.toString(arr));  // Output: [1, 2, 3]
	
2. Arrays.sort(array)
	• Sorts the array in ascending order.
	
	int[] arr = {3, 1, 2};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));  // Output: [1, 2, 3]
	
3. Arrays.copyOf(original, newLength)
	• Copies the original array, truncating or padding with default values to fit the new length.

	int[] arr = {1, 2, 3};
	int[] newArr = Arrays.copyOf(arr, 5);
	System.out.println(Arrays.toString(newArr));  // Output: [1, 2, 3, 0, 0]
	
4. Arrays.copyOfRange(original, from, to)
	• Copies the specified range of the array into a new array.
	
	int[] arr = {1, 2, 3, 4, 5};
	int[] newArr = Arrays.copyOfRange(arr, 1, 4);
	System.out.println(Arrays.toString(newArr));  // Output: [2, 3, 4]
5. Arrays.equals(array1, array2)
	• Compares two arrays for equality (deeply compares contents).
	int[] arr1 = {1, 2, 3};
	int[] arr2 = {1, 2, 3};
	System.out.println(Arrays.equals(arr1, arr2));  // Output: true
6. Arrays.fill(array, value)
	• Fills the entire array with the specified value.
	
	int[] arr = new int[5];
	Arrays.fill(arr, 10);
	System.out.println(Arrays.toString(arr));  // Output: [10, 10, 10, 10, 10]

7. Arrays.binarySearch(array, key)
	• Searches for the specified value in the sorted array using the binary search algorithm.
	
	int[] arr = {1, 2, 3, 4, 5};
	int index = Arrays.binarySearch(arr, 3);
	System.out.println(index);  // Output: 2
	
8. Arrays.deepEquals(array1, array2)
	• Compares two multi-dimensional arrays deeply for equality.
	
	int[][] arr1 = {{1, 2}, {3, 4}};
	int[][] arr2 = {{1, 2}, {3, 4}};
	System.out.println(Arrays.deepEquals(arr1, arr2));  // Output: true
	
9. Arrays.deepToString(array)
	• Returns a string representation of a multi-dimensional array.
	
	int[][] arr = {{1, 2}, {3, 4}};
	System.out.println(Arrays.deepToString(arr));  // Output: [[1, 2], [3, 4]]
	
10. Arrays.asList(array)
	• Converts the array into a List.
	
	String[] arr = {"apple", "banana"};
	List<String> list = Arrays.asList(arr);
	System.out.println(list);  // Output: [apple, banana]
	
11. Arrays.stream(array)
	• Creates a stream from the array for functional operations like filtering and mapping.
	
	int[] arr = {1, 2, 3, 4, 5};
	int sum = Arrays.stream(arr).sum();
	System.out.println(sum);  // Output: 15
	

