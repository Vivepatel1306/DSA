package SlidingWindow;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {
int []arr={1,3,-1,-3,5,3,6,7};
System.out.println(Arrays.toString(MaxValueSubArray(arr,3)));
    }

    public static int[] MaxValueSubArray(int[] arr, int size) {
        int maxValuePosition = 0;
        int sum=0;
        for (int i = 0; i < arr.length - size + 1; i++) {
            int tempSum = 0;
            for (int j = i; j < i + size; j++) {
                tempSum+=arr[j];
                if(tempSum>sum){
                    sum=tempSum;
                    maxValuePosition=i;
                }

            }
        }
        return new int[] {maxValuePosition,sum};

    }
}
