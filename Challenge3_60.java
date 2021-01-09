/*
Write a program, which reads the number of direction (1 – up, 2 – down, 3 – left, 4 – right, 0 – do not move) and outputs the text "move up" (or "move down", or "move left", or "move right", or "do not move" depending on the entered number). If it is a number that does not belong to any of the listed directions, the program should output "error!"

Note: the output text should exactly match the sample, including the letters’ case and location of spaces.

 Report a typo
Sample Input 1:

1
Sample Output 1:

move up
*/

import java.util.Scanner;

class Challenge3_60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int movement = scan.nextInt();
        String result = "move "; 
        
        switch (movement) {
            case 1: 
                result += "up";
                break;
            
            case 2: 
                result += "down";
                break;
                
            case 3: 
                result += "left";
                break;
                
            case 4: 
                result += "right";
                break;
            case 0: 
                result = "do not move";
                break;
                
            default:
                result = "error!";
                break;
        }
        System.out.println(result);
    }
}