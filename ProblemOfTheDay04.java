/*
Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.

Sample Input 1:

476
Sample Output 1:

17
*/

import java.util.Scanner;

class ProblemOfTheDay04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        int cent = num / 100;
        int dec = (num / 10) % 10;
        int unit = num % 10;
        
        int result = cent + dec + unit;
        
        System.out.println(result);
    }
}