/*
Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep. She decided to follow TV recommendations and keep track of how many hours she spends sleeping.

You are given three numbers: AA, BB and HH. According to TV, one should sleep at least AA hours per day, but no more than BB hours. HH is how many hours Ann sleeps.

Task: If Ann sleeps less then AA hours, print "Deficiency". If she sleeps more than BB hours, print "Excess". If her sleep fits the recommendations, print "Normal".

Input format: three numbers AA, BB, HH, where AA is always less than or equal to BB.

Hint

1. Keep in mind that tests are case sensitive: "excess" or "EXCESS" is not correct.
2. Think carefully about all the conditions. Pay attention to the conditional operators: distinguish between \lt< and \le≤; \gt> and \ge≥.
*/

import java.util.Scanner;

class Challenge3_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int hourA = scan.nextInt();
        int hourB = scan.nextInt();
        int hourC = scan.nextInt();
        
        if (hourC < hourA) {
            System.out.println("Deficiency");
        } else if (hourC >= hourA && hourC <= hourB) {
            System.out.println("Normal");
        } else if (hourC > hourB) {
            System.out.println("Excess");
        }
    }
}