/*
N squirrels found K nuts and decided to divide them equally. Find how many nuts will be left after each of the squirrels takes the equal amount of nuts.

Input data format

There are two positive integers N and K, each of them is not greater than 10000.

Sample Input 1:
3
14

Sample Output 1:
2
*/

import java.util.Scanner;

class ProblemOfTheDay01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numK = scanner.nextInt();
        int numL = scanner.nextInt();
        int result = numL % numK;
        
        System.out.println(result);
        
    }
}