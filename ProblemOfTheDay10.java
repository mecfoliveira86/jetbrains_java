/*
Write a program that reads four integer numbers from one line and prints them each in a new line. In the input line numbers are separated by one or more spaces.

 Report a typo
Sample Input 1:

101    102 103  104
Sample Output 1:

101
102
103
104
*/

import java.util.*;

class ProblemOfTheDay10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String data = sc.nextLine();
        
        String[] text = data.split(" ");
        
        for (int i = 0; i < text.length; i++) {
            if (text[i].equals("")) {
                continue;
            } else {
                System.out.println(text[i]);
            }
        }
    }
}