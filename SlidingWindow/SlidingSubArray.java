package SlidingWindow;

import java.util.*;

public class SlidingSubArray {
    public static void main(String[] args) {
int[]arr={2,3,4,5,2,1,1};
System.out.println(arr.length);
threeSizedSubArray(arr,3);
    }

    public static void threeSizedSubArray(int[] arr, int size) {
        for (int i = 0; i < arr.length+1 - size; i++) {
            System.out.println();
            for (int j = i; j < i+size; j++) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
