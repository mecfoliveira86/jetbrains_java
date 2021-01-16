/*
In some country, there are N companies, and the law of that country says that the taxes of each company are individual and appointed by a president. President wants to know which company pays the most taxes. But sadly, none of the president's proxies know math very well, so this work is transferred to you. Can you solve this problem?

The first line of the input contains N which is the number of companies in this country.
The second line contains the yearly incomes of each company. All numbers are non-negative integers.
The third line contains individual taxes for each company in percent of the company's income. All numbers are integers from 0 to 100 inclusive.

You should output № of the company that pays the most taxes. Keep in mind that the enumeration of the companies starts with number 1. If there are several companies with the same payment sizes, output the number of the company with the lowest number.

Note: be careful not to lose fractional parts while performing your calculations. All input and output numbers are integers, but you may have to use a different type for storing intermediate values.

 Report a typo
Sample Input 1:

1
1
1
Sample Output 1:

1
Sample Input 2:

2
50 100
10 10
Sample Output 2:

2
Sample Input 3:

3
50 100 300
100 20 0
Sample Output 3:

1
*/

import java.util.*;

public class ProblemofTheDay07 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int companies = sc.nextInt();
        double[] incomes = new double[companies];
        double[] taxes = new double[companies];
        double[] results = new double[companies];
        
        for (int i = 0; i < companies; i++) {
            incomes[i] = sc.nextInt();
        }
        
        for (int j = 0; j < companies; j++) {
            taxes[j] = sc.nextInt();
        }
        
        for (int k = 0; k < companies; k++) {
            results[k] = incomes[k] * taxes[k] / 100;
        }
        
        double bigger = 0;
        int index = 0;
        for (int l = 0; l < companies; l++) {
            if (results[l] > bigger && index <= l) {
                bigger = results[l];
                index = l;
            }
        }
        System.out.println(index + 1);
    }
}