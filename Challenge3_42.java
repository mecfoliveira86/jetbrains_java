/*
Read an integer number N from the input and print all the squares of natural numbers:

less than or equal to N,
in ascending order.

Sample Input 1:
50

Sample Output 1:
1
4
9
16
25
36
49

Sample Input 2:
1
Sample Output 2:
1
*/

import java.util.Scanner;

class Challenge3_42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int square = 1;
        int result = 1;
        
        while (square * square <= num) {
            result = square * square;
            System.out.println(result);
            square++;    
        }
    }
}