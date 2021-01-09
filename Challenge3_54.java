/*
Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes them both. Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than the string length.

Sample Input 1:

Java
0 2
Sample Output 1:

Jav
*/

import java.util.Scanner;

class Challenge3_54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String original = scan.nextLine();
        int initial = scan.nextInt();
        int end = scan.nextInt();
        
        System.out.println(original.substring(initial, end + 1));
    }
}