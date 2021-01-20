/*
Wow! This problem is kind of tricky. If you're ready to put your thinking cap on, brace yourself and good luck! Otherwise, you can skip it for now and return any time later
Write a program, that takes the rectangular matrix from a sequence of lines as an input. The last line should contain the word end, indicating the end of the input.

The program should output the matrix of the same size, where each element in the position (i, j) is equal to the sum of the elements from the first matrix on the positions of their neighbors: (i-1, j)(i+1, j)(i, j-1), (i, j+1). Boundary elements have neighbors on the opposite side of the matrix.

In the case of one row or column, the element itself can be its neighbor.

 Report a typo
Sample Input 1:

9 5 3
0 7 -1
-5 2 9
end
Sample Output 1:

3 21 22
10 6 19
20 16 -1
Sample Input 2:

1
end
Sample Output 2:

4
*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean flag = true;
        int counter = 0;
        int spaces = 0;
        String data = "";
        
        while (flag) {
            String text = sc.nextLine();
            for (int i = 0; i < text.length(); i++) {
                if(text.charAt(i) == ' ') {
                    spaces++;
                }
            }
            if (text.equals("end")) {
                flag = false;
            } else {
                counter++;
                data += text + " ";
            }    
        }
        
        spaces /= counter;
        spaces++;
        
        String[] values = data.split(" ");
        int[][] numbers = new int[counter][spaces];
        
        int element = 0;
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < spaces; j++) {
                numbers[i][j] = Integer.parseInt(values[element]);
                element++;
            }
        }
        
        int[][] newNumbers = new int[counter][spaces];
        
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < spaces; j++) {
                int val = 0;
                
                //cima (i-1, j)
                if (i == 0) {
                    val += numbers[counter - 1][j];
                } else {
                    val += numbers[i - 1][j];
                }
                
                //baixo (i+1, j)
                if (i == counter - 1) {
                    val += numbers[0][j];
                } else {
                    val += numbers[i + 1][j];
                }
                
                //esquerda (i, j-1)
                if (j == 0) {
                    val += numbers[i][spaces - 1];
                } else {
                    val += numbers[i][j - 1];
                }
                
                //direita (i, j+1)
                
                if (j == spaces - 1) {
                    val += numbers[i][0];
                } else {
                    val += numbers[i][j + 1];
                }
                
                newNumbers[i][j] = val;
            }
        }
        
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(newNumbers[i][j] + " ");
            }
            System.out.println();
        }   
    }
}