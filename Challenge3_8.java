/*
Given a two-digit number. Print its first digit (i.e. the number of tens).

Sample Input 1: 42
Sample Output 1: 4
*/

import java.util.Scanner;

class Challenge3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        int firstDigit = number / 10;
        
        System.out.println(firstDigit);
    }
} 