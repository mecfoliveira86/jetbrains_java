/*
Ann put MM money in the bank. The bank increases Ann's deposit by PP percent every year. Ann wants to know how many years should pass until her deposit in the bank reaches KK money. Can you help her to answer this question?

The input contains three integers M, P, KM,P,K. It is guaranteed that all numbers are positive and K \geq MK≥M.
Output the answer to Ann's question.

Sample Input 1:
1 100 8

Sample Output 1:
3

Sample Input 2:
100 15 120

Sample Output 2:
2
*/

import java.util.*;

public class Challenge3_41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double numM = scan.nextInt();
        double numP = scan.nextInt();
        double numK = scan.nextInt();
        int time = 0;
        
        while (numM < numK) {
            numM += numM * numP / 100;
            time += 1;
        }
        
        System.out.println(time);
    }
}