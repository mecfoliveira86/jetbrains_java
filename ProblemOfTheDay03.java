/*
Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.

 Report a typo
Sample Input 1:

320
Sample Output 1:

23
Sample Input 2:

976
Sample Output 2:

679
*/

import java.util.Scanner;

class ProblemOfTheDay03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        int cent = num / 100;
        int dec = (num / 10) % 10;
        int unit = num % 10;
        
        int result = unit * 100 + dec * 10 + cent;
        
        System.out.println(result);
    }
}
