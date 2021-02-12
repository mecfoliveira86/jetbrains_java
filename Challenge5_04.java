/*
Write a method named addValueByIndex.

The method should take an array of longs and add value to the specified element by its index.

Here is a description of the parameters:

an array of longs;
the index of an element (int);
a value for adding (long).
The method must return nothing.

The following invocation should work correctly:

addValueByIndex(array, index, value);
Where array is an array of longs, index is an integer variable, value is a long value for adding.

 Report a typo
Sample Input 1:

1 1 1 1 1
2 100
Sample Output 1:

1 1 101 1 1
*/

import java.util.*;

public class Main {

    // write a method here
    public static void addValueByIndex(long[] array, int ind, long value) {
        array[ind] += value;
    }


    // don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
