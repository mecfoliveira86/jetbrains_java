/*
Write a program that reads four numbers and decrements each of them.
The program must output the results in the same order separated by spaces.

Sample Input 1: 10 11 -2 -3
Sample Output 1: 9 10 -3 -4
*/

import java.util.Scanner;

class Challenge3_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        int numD = scanner.nextInt();
        
        System.out.println(--numA + " " + --numB + " " + --numC + " " + --numD);
    }
}