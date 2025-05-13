# frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); explain

🗒️ Answer
This line is used to update the frequency of an element `num` in a `HashMap` called `frequencyMap`. Here's the breakdown:

- **`frequencyMap.getOrDefault(num, 0)`**: 
   - This method checks if the key `num` exists in the `frequencyMap`.
   - If `num` exists, it returns its current value (i.e., its frequency so far).
   - If `num` does not exist, it returns the default value, which is `0`.
  
- **`+ 1`**: 
   - The result from `getOrDefault` is incremented by 1. This increases the frequency of `num` by 1.
  
- **`frequencyMap.put(num, ...)`**: 
   - This stores the updated frequency of `num` back into the `HashMap`.

Example:
If `num` is `5`, and it has appeared twice already, `frequencyMap.getOrDefault(5, 0)` will return `2`. Adding 1 makes it `3`, so `frequencyMap.put(5, 3)` updates the map to show that `5` has appeared 3 times.



import java.util.HashMap;
public class loop1 {
   
    public static int findMostFrequent(int[] arr) {
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            int maxFrequency = 0;
            int mostFrequentElement = arr[0];
            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
                // Update most frequent element
                if (frequencyMap.get(num) > maxFrequency) {
                    maxFrequency = frequencyMap.get(num);
                    mostFrequentElement = num;
                }
            }
            return mostFrequentElement;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 3, 2, 1, 4, 1, 3};
            System.out.println("Most Frequent Element: " + findMostFrequent(arr));
        }
}

Most Frequent Element: 1


# frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); explain

🗒️ Answer
This line is used to update the frequency of an element `num` in a `HashMap` called `frequencyMap`. Here's the breakdown:

- frequencyMap.getOrDefault(num, 0): 
   - This method checks if the key `num` exists in the `frequencyMap`.
   - If `num` exists, it returns its current value (i.e., its frequency so far).
   - If `num` does not exist, it returns the default value, which is `0`.
  
- + 1: 
   - The result from `getOrDefault` is incremented by 1. This increases the frequency of `num` by 1.
  
- frequencyMap.put(num, ...): 
   - This stores the updated frequency of `num` back into the `HashMap`.

Example:
If `num` is `5`, and it has appeared twice already, `frequencyMap.getOrDefault(5, 0)` will return `2`. Adding 1 makes it `3`, so `frequencyMap.put(5, 3)` updates the map to show that `5` has appeared 3 times.


