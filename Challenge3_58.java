/*
Harry Potter needs help identifying what each house means.

Read a string representing a house and output the following:

if it is "gryffindor", output "bravery";
if it is "hufflepuff", output "loyalty";
if it is "slytherin", output "cunning";
if it is "ravenclaw", output "intellect";
otherwise, output "not a valid house".
The problem was taken from the course Introduction to JavaScript and React by Ken McGrady and adapted for our educational platform.

 Report a typo
Sample Input 1:

gryffindor
Sample Output 1:

bravery
*/

import java.util.Scanner;

public class Challenge3_58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String house = scan.nextLine();
        
        switch (house) {
            case "gryffindor":
                System.out.println("bravery");
                break;
                
            case "hufflepuff":
                System.out.println("loyalty");
                break;
                
            case "slytherin":
                System.out.println("cunning");
                break;
                
            case "ravenclaw":
                System.out.println("intellect");
                break;
                
            default:
                System.out.println("not a valid house");
                break;
        }
    }
}