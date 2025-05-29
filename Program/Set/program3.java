Great! Let's dive into **hash-based interview programming questions** with implementations and outputs.

1. Find the First Non-Repeating Character in a String

import java.util.*;

public class FirstNonRepeating {
    public static char findFirstNonRepeating(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0'; // No non-repeating character found
    }

    public static void main(String[] args) {
        String str = "swiss";
        System.out.println("First Non-Repeating Character: " + findFirstNonRepeating(str));
    }
}

Expected Output:

First Non-Repeating Character: w

---

2. Find All Pairs in an Array That Sum to a Given Value

import java.util.*;

public class PairSum {
    public static void findPairs(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair: (" + num + ", " + complement + ")");
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        findPairs(arr, target);
    }
}

Expected Output:

Pair: (5, 1)
Pair: (7, -1)
Pair: (5, 1)

---

3. Find the Longest Consecutive Sequence in an Array

import java.util.*;

public class LongestConsecutiveSequence {
    public static int findLongestSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + findLongestSequence(arr));
    }
}

**Expected Output:

Longest Consecutive Sequence Length: 4

---

4. Find the Majority Element in an Array

import java.util.*;

public class MajorityElement {
    public static int findMajorityElement(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = arr.length;

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        return -1; // No majority element found
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println("Majority Element: " + findMajorityElement(arr));
    }
}

Expected Output:

Majority Element: 4


---

5. Group Anagrams in an Array of Strings

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Grouped Anagrams: " + groupAnagrams(words));
    }
}

Expected Output:
Grouped Anagrams: [[eat, tea, ate], [tan, nat], [bat]]


These programs cover **hash-based problems** commonly asked in interviews. You can explore more **hashing interview questions** [here](https://www.geeksforgeeks.org/top-50-problems-on-hash-data-structure-asked-in-sde-interviews/) and [here](https://www.interviewbit.com/hashmap-interview-questions/). Let me know if you need more examples or explanations! 🚀
