/*
Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.

The program should print out the resulting string.

Sample Input 1:
aaa
Sample Output 1:
bbb

Sample Input 2:
bca
Sample Output 2:
bcb
*/

import java.util.Scanner;

class Challenge3_53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String original = scan.nextLine();
        String result = "";
        
        for (int i = 0; i < original.length(); i++) {
            char partial = original.charAt(i);
            if (partial == 'a') {
                result += "b";
            } else {
                result += original.charAt(i);
            }
        }
        System.out.println(result);
    }
}