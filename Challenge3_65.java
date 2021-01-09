/*
Write a simple calculator that reads the three values from the line: the first number, the operation, and the second number.

The program should apply the operation to the numbers entered ("first number" "operation" "second number") and output the result to the screen. Note that the numbers are long.

The calculator should support:

addition: "+"
subtraction: "-"
integer division: "/"
multiplication: "*"
If a user performs division and the second number is 0, it is necessary to output the line "Division by 0!".

If the input operator is not one from the list, the program should output "Unknown operator".

Note: it's recommended to use the switch statement in your solution.

 Report a typo
Sample Input 1:

10000000000 + 20000000000
Sample Output 1:

30000000000
Sample Input 2:

3000 / 0
Sample Output 2:

Division by 0!
Sample Input 3:

10000 ! 300
Sample Output 3:

Unknown operato
*/

import java.util.Scanner;

class Challenge3_65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long numA = scan.nextLong();
        char op = scan.next().charAt(0);
        long numB = scan.nextLong();
        long result = 0;
        String status = "";
        
        switch (op) {
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '/':
                if (numB == 0){
                    break;
                }
                result = numA / numB;
                break;
            case '*':
                result = numA * numB;
                break;
            default:
                status += "Unknown operator";
                break;
        }
        
        if (numB == 0 && op == '/') {
            System.out.println("Division by 0!");
        } else if (!status.equals("")) {
            System.out.println(status);
        } else{
            System.out.println(result);
        }
        
    }
}