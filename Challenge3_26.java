/*
Given an integer as input. Output True if its value is within the interval (−15,12]∪(14,17)∪[19,+∞), and False otherwise (case sensitive).

Here are two types of brackets in the intervals:

parenthesis () exclude the border number;
and square brackets [] include the border number.

Sample Input 1: 20
Sample Output 1: True
--***--
Sample Input 2: -20
Sample Output 2: False
*/

import java.util.Scanner;

class Challenge3_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        if (-15 < num && num <= 12 || 14 < num && num < 17 || num >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}