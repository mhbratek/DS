package com.bratek;

public class DecompressRunLengthEncodedList {
    public static int[] decompressRLElist(int[] nums) {
        int frequences[] = new int[nums.length / 2];
        int values[] = new int[nums.length / 2];

        int f = 0;
        int v = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                frequences[f++] = nums[i];
            } else {
                values[v++] = nums[i];
            }
        }

        int numberOfElement = 0;

        for (int frequence : frequences) {
            numberOfElement += frequence;
        }

        int result[] = new int[numberOfElement];

        int r = 0;

        for (int i = 0; i < frequences.length; i++) {
            for (int j = 0; j < frequences[i]; j++) {
                result[r++] = values[i];
            }
        }

        return result;
    }
}
