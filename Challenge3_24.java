/*
Write a program that reads the number and prints YES if it is positive. Otherwise, the program should print NO.

Do not forget that zero is not a positive number.

Sample Input 1: 7
Sample Output 1: YES
*/

import java.util.Scanner;

class Challenge3_24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        if (num > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}