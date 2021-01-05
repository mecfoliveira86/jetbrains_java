/*
Given three natural numbers A, B, C. Determine if a triangle with these sides can exist.

If the triangle exists, output the YES string, and otherwise, output NO.

A triangle is valid if the sum of its two sides is greater than the third side. If three sides are A, B and C, then three conditions should be met.

1. A + B > C
2. A + C > B
3. B + C > A

Sample Input 1:
3
4
5

Sample Output 1: YES
*/

import java.util.Scanner;

class Challenge3_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numA = scan.nextInt();
        int numB = scan.nextInt();
        int numC = scan.nextInt();
        
        if (numA + numB > numC && numB + numC > numA && numC + numA > numB) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
}