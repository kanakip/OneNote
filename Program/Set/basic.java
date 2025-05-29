import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        // Creating two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // Union of two sets
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

        // Intersection of two sets
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet);

        // Difference of two sets (set1 - set2)
        Set<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + differenceSet);
    }
}

o/p-
Union: [1, 2, 3, 4, 5, 6, 7]
Intersection: [3, 4, 5]
Difference (set1 - set2): [1, 2]

