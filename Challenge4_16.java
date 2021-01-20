/*
Write a program that reads an array of ints named a and cyclically shift the elements of the array to the right: a[0] goes to the place of a[1], a[1] goes to the place of a[2], ..., and the last element goes to the place of a[0]).

Input data format

The first line of the input contains the number of elements in the array. The second line contains the elements of the array.

Output data format

The single line should contain all shifted elements of the array. Elements must be separated by the space character.

 Report a typo
Sample Input 1:

5
1 2 3 4 5
Sample Output 1:

5 1 2 3 4
*/

import java.util.*;

class Challenge 4_16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lenght = sc.nextInt();
        
        int[] numbers = new int[lenght];
        
        for (int i = 0; i < lenght; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int last = numbers[lenght - 1];
        
        for (int k = lenght - 1; k > 0; k--) {
            numbers[k] = numbers[k - 1];
        }
        
        numbers[0] = last;
        
        for (int num:numbers) {
            System.out.print(num + " ");
        }
    }
}