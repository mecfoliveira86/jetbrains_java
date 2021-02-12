/*
Write a method named getFirstAndLast. The method should take an array of ints and return a new array of ints. The returned array must contain two elements: the first and the last elements of the input array.

It's guaranteed, the input array always has at least one element.

 Report a typo
Sample Input 1:

1 2 3 4
Sample Output 1:

1 4
*/

import java.util.*;

public class Main {

    // write a method here
    
    public static int[] getFirstAndLast(int[] numbers) {
        int[] data = new int[2];
        data[0] = numbers[0];
        data[1] = numbers[numbers.length - 1];
        return data;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}