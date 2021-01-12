/*
Write a program that reads an array of ints and an integer number n.

The program must check how many times n occurs in the array.

Input data format
The first line contains the size of the input array.

The second line contains elements of the array separated by spaces.

The third line contains n.

Output data format

The result is only a single non-negative integer number.

 Report a typo
Sample Input 1:

6
1 2 3 4 2 1
2
Sample Output 1:

2
*/

import java.util.Scanner;

class Challenge4_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int[] numbers = new int[length];
        
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();    
        }
        
        int search = sc.nextInt();
        int counter = 0;
        
        for (int num: numbers) {
            if (search == num) {
                counter++;
            }
        }
        
        System.out.println(counter);
    }
}