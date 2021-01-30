/*
You're given the method power that takes two int numbers n and m. The method should return the value of nm as a long value.

Write a body of the method.

 Report a typo
Sample Input 1:

4 3
Sample Output 1:

64
Sample Input 2:

5 0
Sample Output 2:

1
Sample Input 3:

10 10
Sample Output 3:

10000000000
*/

import java.util.Scanner;

public class Challenge5_02 {

    public static long power(int n, int m) {
        if (m == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 0; i < m; i++) {
                result *= n;
            }
            return result;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}