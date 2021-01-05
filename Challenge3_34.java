/*
Find the number of D, C, B and A grades for the last test on informatics, where n students from a class have successfully passed the test.

In this task, we use a 5-point grading system and are interested only in passing grades: from 2 to 5. They correspond to the letter grades in the following way: 5 is for A, 4 is for B, 3 is for C and 2 is for D. The program gets number n as input and then gets the grades themselves: one by one.

The program should output four numbers in a single line: the number of D, C, B, and A grades respectively.

Sample Input 1:
13
2
5
5
5
5
3
2
4
3
3
3
2
3

Sample Output 1:
3 5 1 4
*/

import java.util.Scanner;

class Challenge3_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int students = scan.nextInt();
        int noteA = 0;
        int noteB = 0;
        int noteC = 0;
        int noteD = 0;
        
        for (int i = 0; i < students; i++) {
            int note = scan.nextInt();
            
            if (note == 5) {
                noteA += 1;
            } else if (note == 4) {
                noteB += 1;
            } else if (note == 3) {
                noteC += 1;
            } else if (note == 2) {
                noteD += 1;
            }
        }
        
        System.out.println(noteD + " " + noteC + " " + noteB + " " + noteA);
    }
}