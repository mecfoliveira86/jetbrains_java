//Write a program that reads two integer numbers from the standard input and outputs them in the reverse order separated by one space.

import java.util.Scanner;

class IntegerOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        System.out.println(num2 + " " + num1);
    }
}