package com.bratek;

import java.util.Arrays;

public class ArrayPartitionI {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int result = 0;

        for (int i = 0; i < nums.length - 1; i = i + 2) {
            result += nums[i];
        }
        return result;
    }
}
