Here are some **Java programs related to hashing** with implementation and expected output:

1. Implementing a Simple Hash Function

import java.util.*;

public class SimpleHashFunction {
    public static int hashFunction(String key, int tableSize) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash += c;
        }
        return hash % tableSize;
    }

    public static void main(String[] args) {
        String key = "hello";
        int tableSize = 10;
        System.out.println("Hash Value: " + hashFunction(key, tableSize));
    }
}

Expected Output:

Hash Value: 2

---

2. Using HashMap to Count Word Frequency
  
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "java is fun and java is powerful";
        String[] words = text.split(" ");
        
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency: " + wordCount);
    }
}

Expected Output:

Word Frequency: {java=2, is=2, fun=1, and=1, powerful=1}

---

3. Detecting Duplicates Using HashSet

import java.util.*;

public class DetectDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3};
        Set<Integer> uniqueNumbers = new HashSet<>();
        boolean hasDuplicates = false;

        for (int num : numbers) {
            if (!uniqueNumbers.add(num)) {
                hasDuplicates = true;
                System.out.println("Duplicate Found: " + num);
            }
        }

        System.out.println("Has Duplicates? " + hasDuplicates);
    }
}

Expected Output:

Duplicate Found: 2
Duplicate Found: 3
Has Duplicates? true

---

4. Implementing a Hash Table Using Separate Chaining

import java.util.*;

class HashTable {
    private List<List<Integer>> table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        table = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            table.add(new LinkedList<>());
        }
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void insert(int key) {
        int index = hashFunction(key);
        table.get(index).add(key);
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println("Bucket " + i + ": " + table.get(i));
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(5);
        ht.insert(10);
        ht.insert(15);
        ht.insert(20);
        ht.insert(25);
        ht.insert(30);
        ht.display();
    }
}

Expected Output:

Bucket 0: [10, 15, 20, 25, 30]
Bucket 1: []
Bucket 2: []
Bucket 3: []
Bucket 4: []


---

5. Finding the First Non-Repeating Character Using HashMap

import java.util.*;

public class FirstNonRepeatingCharacter {
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

These programs cover **hash functions, HashMap, HashSet, HashTable, and hashing techniques**. You can explore more **hashing programs** on [GeeksforGeeks](https://www.geeksforgeeks.org/hashing-in-java/) and [GoLinuxCloud](https://www.golinuxcloud.com/java-hashing-methods/). Let me know if you need more variations or explanations! 🚀
