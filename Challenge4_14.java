/*
Write a program that reads an unsorted array of integers and two numbers n and m. The program must check if n and m occur next to each other in the array (in any order).

Input data format

The first line contains the size of an array.
The second line contains elements of the array.
The third line contains two integer numbers n and m.
All numbers in the same line are separated by the space character.

Output data format

Only a single value: true or false.
 Report a typo
Sample Input 1:

3
1 3 2
2 3
Sample Output 1:

true
Sample Input 2:

3
2 1 2
2 3
Sample Output 2:

false
*/

import java.util.*;

class Challenge4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int[] numbers = new int[length];
        int[] search = new int[2];
        
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        for (int j = 0; j < 2; j++) {
            search[j] = sc.nextInt();
        }
        
        int[] position = new int[2];
        
        for (int k = 0; k < length; k++) {
            for (int l = 0; l < 2; l++) {
                if (numbers[k] == search[l]) {
                    position[l] = k;
                }
            }
        }
        
        boolean result = false;
        
        if (Math.abs(position[0] - position[1]) == 1) {
            result = true;
        }
        System.out.println(result);
    }
}