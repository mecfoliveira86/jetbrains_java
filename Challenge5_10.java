/*
You are given a program that should read three numbers and output their sum.

For some reason, the program doesn't compile.

Fix all compile-time errors as well as logic-errors.
Sample Input 1:

8 11 20
Sample Output 1:

39
*/

import java.util.Scanner;

public class Challenge5_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a + b + c;

        System.out.println(sum); 
    }
}