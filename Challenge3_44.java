/*
For its input, the program gets a sequence of non-negative integers; each integer is written in a separate line. The sequence ends with an integer 0; when the program reads 0, it should end its work and output the length of the sequence (not counting the final 0).

Don’t read numbers following the number 0.

Sample Input 1:
1
7
9
0
5

Sample Output 1:
3
*/

import java.util.Scanner;

class Challenge3_44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int counter = 0;
        
        while (scan.hasNext()) {
            int num = scan.nextInt();
            
            if (num == 0) {
                break;
            } else {
                counter++;
            }
        }
        
        System.out.println(counter);
    }
}