/*A university has decided to open math courses and equip classrooms for 3 groups with special new desks. 
The faculty agreed that in the sake of productivity only two students may share one table. 
The enrollment has ended, and now the task is to count the number of desks to order the correct amount from the shop. 
Of course, the university is short of money, so you need to calculate the minimum of desks. 
But don't forget that each group will sit in its own classroom!*/

/*
Input data format

The program receives the input of the three non-negative integers: 
the number of students in each of the three groups (the numbers is not bigger than 1000).

*/

import java.util.Scanner;

class Challenge3_5 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
        int class1 = scanner.nextInt();
        if (class1 % 2 == 1) {
            class1 += 1;
        }
        int class2 = scanner.nextInt();
        if (class2 % 2 == 1) {
            class2 += 1;
        }
        int class3 = scanner.nextInt();
        if (class3 % 2 == 1) {
            class3 += 1;
        }
        
        int result = class1 / 2 + class2 / 2 + class3 / 2;
        
        System.out.println(result);
    }
}