package com.bratek;

public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int counter = 1;
        int result = 0;
        for (int num : nums) {
            int x = num / 10;
            while (x >= 1) {
                x /= 10;
                counter++;
            }
            if (counter % 2 == 0) {
                result++;
            }
            counter = 1;
        }
        return result;
    }
}
