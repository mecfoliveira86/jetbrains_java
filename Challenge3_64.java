/*
We need your help to improve an adaptive system. There's a program that asks learners what programming language they are learning. There are four options, one of them is correct:

Java
Kotlin
Scala
Python
Your task: read the answer’s number from the standard input and output the result of the test: "Yes!", "No!" or "Unknown number". We hope you know which answer is correct. You don't need to print the question itself.

 Report a typo
Sample Input 1:

1
Sample Output 1:

Yes!
Sample Input 2:

6
Sample Output 2:

Unknown number
*/

import java.util.Scanner;

class Challenge3_64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int option = scan.nextInt();
        
        switch (option) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
                System.out.println("No!");
                break;
            case 3:
                System.out.println("No!");
                break;
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }
}