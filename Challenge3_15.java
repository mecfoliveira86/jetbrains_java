/*
Write a program that reads three numbers and checks that they all are different, i.e. not equal to one another.

The output should be true or false.

Sample Input 1: 5 5 9
Sample Output 1: false
 */

import java.util.Scanner;

class Challenge3_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        
        boolean result = numA != numB && numB != numC && numA != numC;
        
        System.out.println(result);
    }
}