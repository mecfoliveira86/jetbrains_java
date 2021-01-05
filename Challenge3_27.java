/*
You are given coordinates of two queens on a chess board. Find out whether or not they hit each other.

Input data format

Four integer numbers x_1, y_1, x_2, y_2x 
1 ,y 1,x 2	,y 2.

Output data format
Type "YES" (uppercase) if they hit each other or "NO" if they don't.

You may need a method that calculates the absolute value of the number, so here it is:

Math.abs(n)

Queen is the most powerful and valuable attacking piece in the game of chess. 
It combines the powers of the bishop and the rook. It is able to move any number of unoccupied squares in a straight line: 
vertically, horizontally or diagonally.

These are all legal moves of the queen 1. Its coordinates are x_1 = 4, y_1 = 4x 1=4,y1=4. 

The coordinates of the queen 2 are x_2 = 7, y_2 = 5x 2	=7,y 2=5.
In this case, queen 1 can't hit queen 2.
*/

import java.util.Scanner;

class Challenge3_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numX1 = scan.nextInt();
        int numY1 = scan.nextInt();
        int numX2 = scan.nextInt();
        int numY2 = scan.nextInt();
        int difX = Math.abs(numX1 - numX2);
        int difY = Math.abs(numY1 - numY2);
        
        if (numX1 == numX2 || numY1 == numY2 || difX == difY) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}