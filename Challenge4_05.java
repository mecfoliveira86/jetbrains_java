/*
Triples

Write a program that reads an array of ints and outputs the number of "triples" in the array.

A "triple" is three consecutive ints in increasing order differing by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not).

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

Only a single integer value: the number of "triples".

 Report a typo
Sample Input 1:

6
1 2 4 5 6 7
Sample Output 1:

2
*/

import java.util.Scanner;

class Challenge4_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int length = scan.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scan.nextInt();
        }
        
        int result = 0;
        
        for (int j = 0; j < (numbers.length - 2); j++) {
            if (numbers[j] == (numbers[j + 1] - 1) && numbers[j + 1] == (numbers[j + 2] - 1)) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}