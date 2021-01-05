/*
Write a program that prints the product of all integer numbers from a to b (a < b).
Include a and exclude b from the product.

Sample Input 1: 1 2
Sample Output 1: 1
--***--
Sample Input 2: 100 105
Sample Output 2: 11035502400
*/

import java.util.Scanner;

class Challenge3_32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numA = scan.nextInt();
        int numB = scan.nextInt();
        long result = 1;
        
        for (int i = numA; i < numB; i++) {
            result *= i;    
        }
        
        System.out.println(result);
    }
}