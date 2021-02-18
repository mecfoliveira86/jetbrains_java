/*
Given a program that reads one number and outputs it incremented by one.

Now the program cannot compile.

Fix all compile-time errors as well as logic-errors.
 Report a typo
Sample Input 1:

10
Sample Output 1:

11
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(number + 1);
    }
}