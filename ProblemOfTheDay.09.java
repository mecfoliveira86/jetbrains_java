/*
Write a program that reads an array of int's and checks the array is sorted ascending (from smallest to largest number).

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

Only a single value: true or false.
 Report a typo
Sample Input 1:

4
1 2 3 4
Sample Output 1:

true
Sample Input 2:

4
1 2 3 0
Sample Output 2:

false
*/

import java.util.*;

class ProblemOfTheDay09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int[] numbers = new int[length];
        boolean result = true;
        
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        for (int j = 0; j < length - 1; j++) {
            if (numbers[j + 1] > numbers[j]) {
                continue;
            } else {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}