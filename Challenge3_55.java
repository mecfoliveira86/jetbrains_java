/*
Write a program that reads the name of a city and checks if the name ends with "burg".

Keep in mind, a city can have a short name.

The program should output true or false.

 Report a typo
Sample Input 1:

Augsburg
Sample Output 1:

true
Sample Input 2:

Saint Petersburg
Sample Output 2:

true
Sample Input 3:

Tu
Sample Output 3:

false
*/

import java.util.Scanner;

class Challenge3_55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String city = scan.nextLine();
        
        System.out.println(city.endsWith("burg"));      
        
    }
}