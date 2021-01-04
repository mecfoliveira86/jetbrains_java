/*
Write a program that reads the numbers a, b, c and checks if there's a pair of them that adds up to exactly 20.
The program must output true or false.

Sample Input 1: 1 2 3
Sample Output 1: false
--*--
Sample Input 2: 4 16 7
Sample Output 2: true
*/

import java.util.Scanner;

class Challenge3_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        boolean result = num1 + num2 == 20 || num1 + num3 == 20 || num2 + num3 == 20;
        
        System.out.println(result);
    }
}