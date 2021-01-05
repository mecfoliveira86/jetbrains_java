/*
Write a program that reads three integer numbers and prints true if exactly one number is positive (i.e. > 0).

Otherwise, it should print false.

Sample Input 1: 1 1 1
Sample Output 1: false
---**---
Sample Input 2: 1 0 -1
Sample Output 2: true
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        
        boolean result = numA > 0 && numB <= 0 && numC <= 0 ||
                         numB > 0 && numA <= 0 && numC <= 0 ||
                         numC > 0 && numB <= 0 && numA <= 0;
                          
        System.out.println(result);
    }
}