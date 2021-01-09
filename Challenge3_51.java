/*
A bus tour of Europe has been very successful. Due to an increase in the number of people that want to go on a tour, the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.

But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these bridges. Can you find out if this will happen?

The first line of the input contains the height of the bus and the number of bridges under which the bus passes. The second line contains the heights of these bridges.

You should output "Will not crash" if everything will be all right; otherwise, output "Will crash on bridge i" (where i is a number of a bridge) into which the bus will crash. If the height of a bridge equals the height of the bus, the bus will crash.

Sample Input 1:
234 8
465 453 981 463 1235 871 475 981
Sample Output 1:

Will not crash
Sample Input 2:

211 5
871 205 123 871 1681
Sample Output 2:

Will crash on bridge 2
*/

import java.util.*;

public class Challeenge3_51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int height = scan.nextInt();
        int bridges = scan.nextInt();
        boolean status = false;
        
        for (int i = 0; i < bridges; i++) {
            int bridgeHeight = scan.nextInt();
            
            if (bridgeHeight - height <= 0) {
                status = true;
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            } else if (i == (bridges - 1) && status == false) {
                System.out.println("Will not crash");
            }
        }
    }
}