In Java, Regular Expressions or Regex (in short) in Java is an API for defining String patterns that can be used for searching, manipulating, and editing a string in Java. Email validation and passwords are a few areas of strings where Regex is widely used to define the constraints. Regular Expressions in Java are provided under java.util.regex package.



Read this high level - 
https://www.geeksforgeeks.org/regular-expressions-in-java/?ref=lbp

import java.util.regex.Pattern;
class GFG {
    public static void main(String args[]){
      
        System.out.println(Pattern.matches("geeks.*", "geeksforgeeks"));
      
        System.out.println(Pattern.matches("geeks[0-9]+", "geeks12s"));
    }
}
true
false


Pattern searching -

import java.util.regex.Matcher;
import java.util.regex.Pattern;
class GFG {
    public static void main(String args[])
    {
       
        Pattern p = Pattern.compile("geeks");

        Matcher m = p.matcher("geeksforgeeks.org");
       
        while (m.find())
	   System.out.println("Pattern found from "
                               + m.start() + " to "
                               + (m.end() - 1));
    }
}

Pattern found from 0 to 4
Pattern found from 8 to 12


Regex Character classes
Character Class	Description
[xyz]	x,y or z
[^xyz]	Any characters other than x,y or z
[a-zA-Z]	characters from range a to z or A to Z.
[a-f[m-t]]	Union of a to f and m to t.
[a-z && p-y] 	All the range of elements intersection between two ranges 
[a-z && [^bc]]	a to z union with except b and c
[a-z && [^m-p]]	a to z union with except range m to p



// FIG


