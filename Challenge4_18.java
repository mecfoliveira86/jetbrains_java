/*
Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by recording the result into the new array m×n in size.

Input data format

Input the two numbers n and m, not exceeding 100, and then an array n×m in size.

Output data format

Output the resulting array. Separate numbers by a single space in the output.

 Report a typo
Sample Input 1:

3 4
11 12 13 14
21 22 23 24
31 32 33 34
Sample Output 1:

31 21 11 
32 22 12 
33 23 13 
34 24 14
*/

import java.util.*;

class Challenge4_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lines = sc.nextInt();
        int columns = sc.nextInt();
        
        int[][] numbers = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        
        int[][] newNumbers = new int[columns][lines];
        
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < lines; j++) {
                newNumbers[i][j] = numbers[lines - 1 - j][i];
            }
        }
        
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < lines; j++) {
                System.out.print(newNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}