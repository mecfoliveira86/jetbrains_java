/*
Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times, to what it equals to). The input to the program is a positive integer n: the number of the elements of the sequence the program should print. Output the sequence of numbers, written in a single line, space-separated.

For example, if n = 7, then the program should output 1 2 2 3 3 3 4.

 Report a typo
Sample Input 1:

7
Sample Output 1:

1 2 2 3 3 3 4
*/

import java.util.Scanner;

class Challenge3_49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int counter = 0;
        int sequence = 1;
        
        while (counter < num) {
            for (int i = 0; i < sequence && counter < num; i++) {
                System.out.print(sequence + " ");
                counter++;
            }
            sequence++;
        }  
    }
}