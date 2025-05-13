
import java.util.ArrayList;
import java.util.Arrays;
public class loop1 {
    public static void main(String[] args) {
        // Array to ArrayList
        String[] array = {"Apple", "Banana", "Cherry"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + arrayList);
        // ArrayList to Array
        String[] newArray = arrayList.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(newArray));
    }
}

String[] newArray = arrayList.toArray(new String[0]);

Explain :=

This line converts an `ArrayList<String>` to a `String[]` array in Java. Here's how it works:

1. toArray(new String[0]):
   - The toArray() method converts the `ArrayList` into an array.
   - new String[0] is passed to indicate the type of the array (`String[]`).
   - If the array size passed (here, `0`) is smaller than the `ArrayList`, a new array of the correct size is created internally.
   - Passing new String[0] is common as it's optimized in modern JVMs and avoids unnecessary pre-calculation of the array size.

2.Why not use new String[size]?:
   - Passing new String[0] is typically faster because Java internally handles the array creation in an optimized way. Pre-sizing the array manually (e.g., new String[size]) has minimal performance improvement and is less flexible[[1](https://stackoverflow.com/questions/18136437/whats-the-use-of-new-string0-in-toarraynew-string0)][[3](https://www.baeldung.com/java-collection-toarray-methods)].


