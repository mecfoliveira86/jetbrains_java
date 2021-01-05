/*
Find the sum of numbers divisible by 6 in the given sequence of natural numbers.

The first line of the input is the number of elements in the sequence; the next lines are the elements themselves.

It is guaranteed, that there is always a number divisible by 6 in the sequence.

Sample Input 1:
8
11
12
68
6
98
81
36
86

Sample Output 1:
54
*/

import java.util.Scanner;

class Challenge3_36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int elements = scan.nextInt();
        int sum = 0;
        
        for (int i = 0; i < elements; i++) {
            int element = scan.nextInt();
            
            if (element % 6 == 0) {
                sum += element;
            }
        }
        
        System.out.println(sum);
    }
}