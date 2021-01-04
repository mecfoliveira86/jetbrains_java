/*
Write a program that reads a value and checks if it is less than 10. 
Sample Input 1: 5
Sample Output 1: true
*/

import java.util.Scanner;

class Challenge3_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        boolean result = num < 10;
        
        System.out.println(result);
    }
}