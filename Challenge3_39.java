/*
Print the sum of all integers from a to b including both.

It is guaranteed that a < b in all test cases.

Sample Input 1:
3
22
Sample Output 1:
250
*/

import java.util.Scanner;

class Challenge3_39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numA = scan.nextInt();
        int numB = scan.nextInt();
        int result = 0;
        
        for (int i = numA; i <= numB; i++) {
            result += i;
        }
        
        System.out.println(result);
    }
}