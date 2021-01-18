/*
Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. Elements of the sequence must go one after another. A single number is assumed to be ordered sequence with the length = 1.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Example

The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5. It includes the following elements: 1 2 3 5 7.

 Report a typo
Sample Input 1:

10
1 2 4 1 2 3 5 7 4 3
Sample Output 1:

5
*/

import java.util.*;

class Challenge4_14 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int[] numbers = new int[length];
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
    
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        while (counter < length - 1) {
            if (numbers[counter + 1] > numbers[counter]) {
                counter1++;
            } else {
                counter1 = 0;
            }
            if (counter1 > counter2) {
                counter2 = counter1;
            }
            counter++;
        }
        System.out.println(counter2 + 1);
    } 
}