/*
Find the sum of all elements of a sequence, ending with the number 0.

The number 0 itself is not included into the sequence and serves as a sign of cessation.

Sample Input 1:
3
6
8
0

Sample Output 1:
17
*/

import java.util.Scanner;

class Challenge3_47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        
        while (scan.hasNext()) {
            int num = scan.nextInt();
            
            if (num == 0) {
                break;
            } else {
                sum += num;
            }
        }
        
        System.out.println(sum);
    }
}