/*
Given a natural number, not greater than 10000. Output the even number following this number.

Sample Input 1: 7
Sample Output 1: 8

--/--

Sample Input 2: 8
Sample Output 2: 10
*/

import java.util.Scanner;

class Challenge3_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int result = 0;
        if (number % 2 == 1) {
            result = number + 1;
        } else {
            result = number + 2;
        }
        
        System.out.println(result);
    }
}