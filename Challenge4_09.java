/*
Write a program that reads an array of integers and an integer. The program must check if the array contains that number.

Input data format

The first line: the size of an array.

The second line: all the elements of the array separated by the space.

The third line: one integer.

Output data format

Only a single value: true or false.

 Report a typo
Sample Input 1:

3
1 3 2
3
Sample Output 1:

true
Sample Input 2:

5
1 3 2 5 4
7
Sample Output 2:

false
*/

import java.util.Scanner;

class Challenge4_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int[] numbers = new int[length];
        
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int search = sc.nextInt();
        boolean result = false;
        
        for (int num:numbers) {
            if (num == search) {
                result = true;
            }
        }
        System.out.println(result);
    }
}