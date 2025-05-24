Math.abs() returns the absolute value of its parameter.


public class Program {
    public static void main(String[] args) {
        int a = Math.abs(10); 
        System.out.println(a);
        
        int b = Math.abs(-20);
        System.out.println(b);
    }
}


OUTPUT
10
20

Math.ceil() rounds a floating point value up to the nearest integer value. The rounded value is returned as a double.

public class Program {
    public static void main(String[] args) {
        double c = Math.ceil(7.342);
        System.out.println(c);
    }
}

o/p-  8.0


Similarly, Math.floor() rounds a floating point value down to the nearest integer value.

public class Program {
    public static void main(String[] args) {
        double f = Math.floor(7.343);
        System.out.println(f);
    }
}

o/p-  7.0

Math.max() returns the largest of its parameters.

public class Program {
    public static void main(String[] args) {
        int m = Math.max(10, 20);
        System.out.println(m);
    }
}

o/p -  20

Conversely, Math.min() returns the smallest parameter.


public class Program {
    public static void main(String[] args) {
        int m = Math.min(10, 20);
        System.out.println(m);
    }
}

o/p - 10

Math.pow() takes two parameters and returns the first parameter raised to the power of the second parameter.


public class Program {
    public static void main(String[] args) {
        double p = Math.pow(2, 3);
        System.out.println(p);
    }
}

o/p - 8

Math is static class because here we called without creating object.

----------------------------------------------------------------------------
Static variable access - 

public class Counter {
    public static int COUNT=0;
    Counter() {
        COUNT++;
    }
}

public class MyClass {
    public static void main(String[ ] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT); // here without creating object we are calling the count 
    }
}


Static method access  - 

public class Vehicle {
    public static void horn() {
        System.out.println("Beep");
    }
}
public class MyClass {
    public static void main(String[ ] args) {
        Vehicle.horn();
    }
}






