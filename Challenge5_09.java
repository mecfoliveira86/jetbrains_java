/*
Given a program that reads two lines and outputs them in another order.

Now the program cannot compile.

Fix all compile-time errors as well as logic-errors.
Sample Input 1:

Hello,
Java!
Sample Output 1:

Java!
Hello,
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        System.out.println(line2);
        System.out.println(line1);
    }
}
