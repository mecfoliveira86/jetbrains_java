/*
Write a program that reads an array of integers and finds the minimum value of the array.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

An integer number representing the minimum in the input array.
 Report a typo
Sample Input 1:

5
5 1 4 2 3
Sample Output 1:

1
*/

import java.util.Scanner;
class Challenge4_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        
        int[] numbers = new int[length];
        
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int min = 1000;
        
        for (int num:numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
