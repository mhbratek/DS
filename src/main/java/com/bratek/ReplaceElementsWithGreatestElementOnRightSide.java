package com.bratek;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = findMax(i, arr);
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    private static int findMax(int begin, int[] arr) {
        int max = 0;
        for (int i = begin; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
