/*
You are given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4. As input, the program gets the number of elements in the sequence, and then the elements themselves. In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000. The program should print a single number: the maximum element of the sequence divisible by 4.

Try to solve this problem by using a while-loop.

Sample Input 1:
10
76
18
69
63
36
18
49
16
12
50

Sample Output 1:
76
*/

import java.util.Scanner;

class Challenge3_45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int elements = scan.nextInt();
        int counter = 0;
        int result = 0;
        
        while (counter != elements) {
            int num = scan.nextInt();
            
            if (num % 4 == 0 && num > result) {
                result = num;
            }
            counter++;
        }
        
        System.out.println(result);
    }
}