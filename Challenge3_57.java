/*
Write a program that reads two lines and compares them without whitespaces. The program should print true if both lines are equal, otherwise – false.

 Report a typo
Sample Input 1:

  string
str ing 
Sample Output 1:

true
Sample Input 2:

string
my string
Sample Output 2:

false
*/

import java.util.Scanner;

class Challenge3_57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String line1 = scan.nextLine();
        String line2 = scan.nextLine();
        
        line1 = line1.replace(" ", "");
        line2 = line2.replace(" ", "");
        
        if (line1.equals(line2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}