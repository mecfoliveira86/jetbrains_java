/*
Wow! This problem is kind of tricky. If you're ready to put your thinking cap on, brace yourself and good luck! Otherwise, you can skip it for now and return any time later
N-size Sudoku is a game with a square table of N2 width and height divided into N2 smaller squares of N width and height. In a solved state, each of these smaller squares, as well as each row and column of a full square, contains all numbers from 1 to N2 without repetition.

Given a number N on the first line and a full sudoku table on the next N2 lines. Every line contains N2 integers.

Your task is to determine whether this sudoku is solved or not. Output "YES" if this sudoku table is solved, otherwise "NO".

N can be from 1 to 10.

Hint

Here is an example of solved sudoku with squares, where the size of side N is 3.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        String text = "";
        
        while (sc.hasNext()) {
            text += sc.nextLine() + "|";
        }
        
        if (text.charAt(0) == '|') {
            text = text.substring(1,text.length()-1);
        }
        
        text = text.replace("|", " ");
        
        String[] data = text.split(" ");
        int[][] grade = new int[length * length][length * length];
        
        int element = 0;
        for (int i = 0; i < length * length; i++) {
            for (int j = 0; j < length * length; j++) {
                grade[i][j] = Integer.parseInt(data[element]);
                element++;
            }
        }

        for (int i = 0; i < length * length; i++) {
            for (int j = 0; j < length * length; j++) {
                grade[i][j] = Integer.parseInt(data[element]);
                element++;
            }
        }

    }
}