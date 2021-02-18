/*
Take a look at the method that takes a string, converts all characters of the string to the upper case and then returns the resulting string.

But there is a problem. Sometimes an input string is null. As you already know, in this case, the method throws NullPointerException.

Your task is to fix the method in order to avoid NPE.

If the input string is null, the method should return the empty string "".

 Report a typo
Sample Input 1:

a string
Sample Output 1:

A STRING
*/

import java.util.Scanner;
import java.util.Locale;

public class Challenge5_12 {

    /* Fix this method */
    public static String toUpperCase(String str) {
        if (str == null) {
            return "";
        } else {
            return str.toUpperCase(Locale.ENGLISH);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        System.out.println(toUpperCase(line));
    }
}