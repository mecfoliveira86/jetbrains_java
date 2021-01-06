/*
Your task is to find the roots of a cubic equation.

The input contains four numbers: a, b, c, da,b,c,d.

Output all the integer roots between 0 and 1000 (inclusive) for the equation 
ax^3+bx^2+cx+d=0ax3+bx2+cx+d=0 in ascending order.

If the specified interval does not contain the roots of the equation, do not output anything.

Remember, that cubic equation always has 3 roots, meaning it can't have more than 3 integer roots. Keep this in mind in order to optimize the code.

Sample Input 1:
-1
1
-1
1
Sample Output 1:
1

Sample Input 2:
0
1
-6
5
Sample Output 2:
1
5

Sample Input 3:
1
1
1
1
Sample Output 3:
*/

import java.util.Scanner;

class Challenge3_38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numA = scan.nextInt();
        int numB = scan.nextInt();
        int numC = scan.nextInt();
        int numD = scan.nextInt();
        int var1 = -1;
        int var2 = -1; 
        int var3 = -1;
        
        for (int i = 0; i <= 1000; i++) {
            var1 = numA * (i * i * i) + numB * (i * i) + numC * i + numD;
            if (var1 == 0) {
                var1 = i;
                System.out.println(var1);
                break;
            }
        }
        
        for (int j = var1 + 1; j <= 1000; j++) {
            var2 = numA * (j * j * j) + numB * (j * j) + numC * j + numD;
            if (var2 == 0 && j != var1) {
                var2 = j;
                System.out.println(var2);
                break;
            }
        }
        
        for (int k = var3 + 1; k <= 1000; k++) {
            var3 = numA * (k * k * k) + numB * (k * k) + numC * k + numD;
            if (var3 == 0 && k != var1 && k != var2) {
                var3 = k;
                System.out.println(var3);
                break;
            }
        }   
    }
}