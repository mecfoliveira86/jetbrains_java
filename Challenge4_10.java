/*
Write a program that reads an array of ints and finds the index of the first maximum in an array.

Input data format

The first line contains the number of elements in the array.

The second line contains the array elements separated by spaces.

An array always has at least one element.

Output data format

Only a single integer value: the index of the first maximum.

 Report a typo
Sample Input 1:

5
2 5 3 4 5
Sample Output 1:

1
Sample Input 2:

6
1000 10 1000 10 10 1001
Sample Output 2:

5
*/

import java.util.Scanner;

class Challenge4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int[] numbers = new int[length];
        
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int counter = 0;
        int max = 0;
        
        for (int num:numbers) {
            if (num > max) {
                max = num;
            }
        }
        
        for (int num:numbers) {
            if (num != max) {
                counter ++;
                continue;
            } else {
                counter++;
                break;
            }
        }
        System.out.println(counter-1);
    }
}