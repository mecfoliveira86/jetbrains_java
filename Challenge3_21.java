/*
In a computer game, each gamer has an army of units.

Write a program that will classify the army of your enemies corresponding to the following rules:

Units: Category

less than 1: no army

from 1 to 19: pack

from 20 to 249: throng

from 250 to 999: zounds

1000 and more: legion

The program should read the number of units and output the corresponding category.

Sample Input 1: 5
Sample Output 1: pack
--***--
Sample Input 2: 303
Sample Output 2: zounds
*/

import java.util.Scanner;

class Challenge 3_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int player = scan.nextInt();
        
        if (player < 1) {
            System.out.println("no army");
        } else if (1 <= player && player <= 19) {
            System.out.println("pack");
        } else if (20 <= player && player <= 249) {
            System.out.println("throng");
        } else if (250 <= player && player <= 999) {
            System.out.println("zounds");
        } else if (player >= 1000) {
            System.out.println("legion");
        }
    }
}