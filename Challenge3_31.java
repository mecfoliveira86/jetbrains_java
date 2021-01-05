/*
Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.

Note: it is possible to write this program more efficiently without any loops.

Sample Input 1: 10 20 10
Sample Output 1: 2
--***--
Sample Input 2: 15 25 5
Sample Output 2: 3
*/

import java.util.Scanner;

class Challenge3_31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numA = scan.nextInt();
        int numB = scan.nextInt();
        int numC = scan.nextInt();
        int counter = 0;
        
        for (int i = numA; i <= numB; i++) {
            if(i % numC == 0) {
                counter += 1;
            }    
        }
        
        System.out.println(counter);
    }
}