/*
Wow! This problem is kind of tricky. If you're ready to put your thinking cap on, brace yourself and good luck! Otherwise, you can skip it for now and return any time later
Snail creeps up the vertical pole of height H feet. It goes A feet up per day, and B feet down per night. In which day will the snail reach the top of the pole?

Input data format

On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.

 Report a typo
Sample Input 1:

10
3
2
Sample Output 1:

8
Sample Input 2:

20
7
3
Sample Output 2:

5
*/

import java.util.Scanner;

class ProblemofTheDay02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numH = scanner.nextInt();
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int result = 0;
        int numC = 0;
        while (numC < numH) {
            numC += numA;
            result += 1;
            if (numC >= numH) {
                break;
            } else {
                numC -= numB;
            }
        }
        System.out.println(result);
    }
}