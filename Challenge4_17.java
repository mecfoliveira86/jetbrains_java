/*
Given the number n, not greater than 100, create the matrix of size n×n and fill it using the following rule. Numbers 0 should be stored on the primary (main) diagonal. The two diagonals, adjacent to the primary one, should contain numbers 1. The next two diagonals should contain numbers 2; etc.

Note: the primary diagonal runs from the top left corner to the bottom right corner.

 Report a typo
Sample Input 1:

5
Sample Output 1:

0 1 2 3 4
1 0 1 2 3
2 1 0 1 2
3 2 1 0 1
4 3 2 1 0
*/

import java.util.*;

class Challenge4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int[][] numbers = new int[number][number];
        
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                numbers[i][j] = Math.abs(i - j);
            }
        }
        
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}