/*
Write a program, which reads the number of the shape (1 – square, 2 – circle, 3 – triangle, 4 – rhombus) and prints the text "You have chosen a square" (or circle, or triangle, or rhombus, depending on the number). If it is a number that doesn't correspond to any of the listed shapes, the program should output: "There is no such shape!".

Note: output text should exactly match the sample, including letters' case and location of spaces.

 Report a typo
Sample Input 1:

1
Sample Output 1:

You have chosen a square
*/

import java.util.Scanner;

class Challenge3_63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int form = scan.nextInt();
        String result = "You have chosen a ";
        
        switch (form) {
            case 1:
                result += "square";
                break;
            case 2:
                result += "circle";
                break;
            case 3:
                result += "triangle";
                break;
            case 4:
                result += "rhombus";
                break;
            default:
                result = "There is no such shape!";
                break;
        }
        System.out.println(result);
    }
}