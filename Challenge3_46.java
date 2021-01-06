/*
A user inputs a long positive number m. You need to find out what is the smallest int number n such that n! > m.

Just in case: wiki on factorials.

Sample Input 1:
6188989133

Sample Output 1:
13

Sample Input 2:
6

Sample Output 2:
4
*/

import java.util.Scanner;

class Challenge3_46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long num = scan.nextLong();
        long result = 1;
        int fact = 1;
        int counter = 0;
        
        while (result <= num) {
            result *= fact;
            counter++;
            fact++;    
        }
        
        System.out.println(counter);
        
    }
}
