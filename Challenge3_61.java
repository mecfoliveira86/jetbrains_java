/*
Residents of the country of Malevia often experiment with the plan of their rooms. Rooms can be triangular, rectangular, and round.

Write a program that calculates the floorage of the rooms.

Input data format

The type of the room shape and the relevant parameters.

Output data format

The area of the resulting room.

Note that the value of 3.14 is used instead of the number π in Malevia.

Hint

Math library may help you to solve this task.
Input format used by the Malevians:

triangle
a
b
c
where a, b and c — lengths of the triangle sides.

rectangle
a
b
where a and b — lengths of the rectangle sides.

circle
r
where r — circle radius.

Note, the input values (a, b, c, r) are doubles and your answer should be, too.

 Report a typo
Sample Input 1:

rectangle
4
10
Sample Output 1:

40.0
Sample Input 2:

circle
5
Sample Output 2:

78.5
Sample Input 3:

triangle
3
4
5
Sample Output 3:

6.0
*/

import java.util.Scanner;

class Challenge3_61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String form = scan.nextLine();
        double result = 0;
        
        switch (form) {
            case "circle":
                double r = scan.nextInt();
                result = 3.14 * r * r;
                break;
            case "rectangle":
                double h = scan.nextInt();
                double l = scan.nextInt();
                result = h * l;
                break;
            case "triangle":
                double a = scan.nextInt();
                double b = scan.nextInt();
                double c = scan.nextInt();
                double perimeter = (a + b + c)/2;
                result = Math.pow(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c),0.5);
                break;
            default:
                System.out.println("Form was not recognized!");
                break;
        }
        System.out.println(result);
    }
}