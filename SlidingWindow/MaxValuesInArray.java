package SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;

public class MaxValuesInArray {
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
System.out.println(maxValue(arr,3).toString());
    }

    public static ArrayList<Integer> maxValue(int[] arr, int size) {

        ArrayList<Integer> maxValueArray = new ArrayList<>();
        for (int i = 0; i < arr.length + 1 - size; i++) {

            ArrayList<Integer> maxV = new ArrayList<>();
            for (int j = i; j < i + size; j++) {
                maxV.add(arr[j]);
            }
            maxValueArray.add(Collections.max(maxV));

        }
        return maxValueArray;
    }

}
