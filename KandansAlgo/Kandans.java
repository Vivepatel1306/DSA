package KandansAlgo;

import java.util.*;

public class Kandans {
    public static void main(String[] args) {
        int arr[] = { -1, -2, -3, -4,0 };
        System.out.println(brutful(arr));

    }

    public static int brutful(int[] arr) {
        int maxSum = arr[0];
        
        for (int values : arr) {
            if (maxSum < values) {
                maxSum = values;
            }
        }
        int currSum = 0;
        for (int values : arr) {
            currSum += values;
            // maxSum=MAX(currSum,maxSum);
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;

            }
        }
        return maxSum;

    }
}
