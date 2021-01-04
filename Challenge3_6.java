/*Write a program that reads an integer value n from the standard input and outputs the result of the following arithmetic expression:
    ((n + 1) * n + 2) * n + 3

    Sample Input 1: 3
    
    Sample Output 1: 45
 */

 import java.util.Scanner;

class Challenge3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        System.out.println(((n + 1) * n + 2) * n + 3);
    }
}

