/*
Write a program that calculates the sum of the elements of an array of ints.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

The sum of the input array elements.
 Report a typo
Sample Input 1:

3
1 2 3
Sample Output 1:

6
*/

import java.util.Scanner;

class Challenge4_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int[] numbers = new int[length];
        
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();    
        }
        
        int sum = 0;
        
        for (int num:numbers) {
            sum += num;
        }
        
        System.out.println(sum);
    }
}