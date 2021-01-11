/*
Write a program that reads an array of ints and an integer number n. The program must sum all the array elements greater than n.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.
The third line contains the number n.

Output data format

Only a single number representing the sum.
 Report a typo
Sample Input 1:

5
5 8 11 2 10
8
Sample Output 1:

21
Sample Input 2:

4
-5 -4 -6 -11
-10
Sample Output 2:

-15
*/

import java.util.Scanner;

class Challenge4_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int length = scan.nextInt();
        
        int[] numbers = new int[length];
        
        for (int i = 0; i < length; i++) {
            numbers[i] = scan.nextInt();
        }
        
        int max = scan.nextInt();
        int sum = 0;
        for (int num: numbers) {
            if (num > max) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}