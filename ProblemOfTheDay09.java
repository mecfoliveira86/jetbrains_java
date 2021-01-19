/*
There are two boxes on the table. The first box has a size of X1 x Y1 x Z1, and the second box has a size of X2 x Y2 x Z2.
You need to determine whether one of the boxes can be put inside the other. It should go in without sticking out.
You can rotate both boxes as you want.

Important: two equally sized boxes cannot be placed inside one another. See the third test case as an example of how the borderline case should be treated.

Input consists of two lines:

the first line contains numbers X1, Y1, Z1;
the second line contains numbers X2, Y2, Z2.
All numbers are integers and greater than 0.

Output:

"Box 1 < Box 2", if the first box can be put inside the second box ;
"Box 1 > Box 2", if the second box can be put inside the first box;
otherwise, output "Incompatible".
Hint

One box can be placed inside the other only if it is strictly smaller by all three dimensions. It does not necessarily mean that boxes cannot have one equal side, as you can rotate them.

*/

import java.util.*;

public class ProblemOfTheDay09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] box1 = new int[3];
        int[] box2 = new int[3];
        
        for (int i = 0; i < 3; i++) {
            box1[i] = sc.nextInt();
        }
        
        for (int j = 0; j < 3; j++) {
            box2[j] = sc.nextInt();
        }
        
        Arrays.sort(box1);
        Arrays.sort(box2);
        
        if (box1[0] > box2[0] && box1[1] > box2[1] && box1[2] > box2[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (box1[0] < box2[0] && box1[1] < box2[1] && box1[2] < box2[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }   
    }
