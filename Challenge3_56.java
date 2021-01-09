/*
Write a program that checks if a given string starts with the prefix "J" ignoring the case.

The program should output true or false.

 Report a typo
Sample Input 1:

Java
Sample Output 1:

true
Sample Input 2:

Kotlin
Sample Output 2:

false
*/

import java.util.Scanner;

class Challenge3_56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String original = scan.nextLine();
        
        if (original.charAt(0) == 'J' || original.charAt(0) == 'j') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}