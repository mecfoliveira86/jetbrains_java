/*
Write a program that reads an array of ints and outputs the maximum product of two adjacent elements in the given array of non-negative numbers.

Input data format

The first line of the input contains the number of elements in the array.

The second line contains the elements of the array separated by spaces.

The array always has at least two elements.

 Report a typo
Sample Input 1:

2
5 3
Sample Output 1:

15
Sample Input 2:

3
10 8 4
Sample Output 2:

80
*/

import java.util.Scanner;

class Challenge4_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int[] numbers = new int[length];
        
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int max = 0;
        
        for (int j = 0; j < length - 1; j++) {
            if (numbers[j] * numbers[j + 1] > max) {
                max = numbers[j] * numbers[j + 1];
            }
        }
        
        System.out.println(max);
    }
}