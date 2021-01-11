/*
Create an array of longs named longNumbers with three elements 100000000001, 100000000002, 100000000003.

Then output the array.

Use the provided code template.

long type is used to store big integer values. To indicate long value use L or l literal. Otherwise, it is considered as int.

long twentyTwo = 22L; // L or l is a literal for longs

*/

import java.util.Arrays;

public class Challenge4_01 {

    public static void main(String[] args) {

        long[] longNumbers = new long[3];
        longNumbers[0] = 100_000_000_001L;
        longNumbers[1] = 100_000_000_002L;
        longNumbers[2] = 100_000_000_003L;

        System.out.println(Arrays.toString(longNumbers));
    }
}