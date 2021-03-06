/*
Write a program that reads an array of lowercase strings and checks whether the array is in alphabetical order or not.

There are some rules to compare a pair of strings a and b:

First chars of strings are compared: a[0] and b[0]. If a[0] comes earlier than b[0] in the alphabet, then a comes before b in terms of alphabetical order. If the first chars are the same, then the second chars are compared, and so on.
If a position is reached where one string has no more chars to compare while the other does, then the shorter string is deemed to come first in alphabetical order.
Finally, identical strings are always in alphabetical order.
You can use compareTo method of the String class to compare 2 strings. If this String object alphabetically precedes the argument string, then the result is a negative integer. The result is a positive integer if this String object alphabetically follows the argument string. The result is zero if the strings are identical. This is exactly what you need to compare 2 strings in terms of alphabetical order!

For example

System.out.println("abc".compareTo("acd")); // -1 "abc" < "acd"
System.out.println("abc".compareTo("aac")); //  1 "abc" > "aac"
System.out.println("abc".compareTo("abc")); //  0 "abc" = "abc"
Input data format

The single input line contains lowercase strings separated by spaces.

Output data format

Only a single word: true or false.
*/

import java.util.*;

class ProblemOfTheDay08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] data = sc.nextLine().split(" ");
        boolean result = false;
        
        for (int i = 0; i < data.length - 1; i++) {
            
            int numA = data[i].length();
            int numB = data[i + 1].length();
            
            if (numA <= numB) {
                if (data[i].substring(0,numA).compareTo(data[i + 1].substring(0, numA)) <= -1 || data[i].substring(0,numA).compareTo(data[i + 1].substring(0, numA)) == 0) {
                    result = true;
                } else {
                    result = false;        
                    break;
                }
            } else {
                if (data[i].substring(0,numB).compareTo(data[i + 1].substring(0, numB)) <= -1 || data[i].substring(0,numB).compareTo(data[i + 1].substring(0, numB)) == 0) {
                    result = false;
                    break;
                } else {
                    result = true;
                } 
            }
        }
        System.out.println(result);
    }
}
        