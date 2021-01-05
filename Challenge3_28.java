/*
Given a four-digit number. Determine whether its decimal notation is symmetric. If the number is symmetric, output 1; otherwise output any other integer.

Sample Input 1: 2002
Sample Output 1: 1

Sample Input 2: 2008
Sample Output 2: 37
*/

import java.util.Scanner;

class Challenge 3_28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int digit1 = num / 1000;
        int digit2 = (num / 100) % 10;
        int digit3 = (num / 10) % 10;
        int digit4 = num % 10;
        
        if (digit1 == digit4 && digit2 == digit3) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}