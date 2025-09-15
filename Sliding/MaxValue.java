package Sliding;

import java.util.*;

public class MaxValue {
    public static void main(String[] args) {
        int arr[] = { 91, 3, -1,1000, -3, 5, 3, 6, 7 };
        System.out.println(max(arr, 3));
    }
    public static int max(int arr[], int size) {
        ArrayList<Integer> newArr=new ArrayList<>();
        int iL=0,jL=0;
        int maxSum = arr[0] + arr[1] + arr[2];
              for (int i = 0; i < arr.length - size + 1; i++) {
            int currSum = 0;int num=0;
            for (int j = i; j < i + 3; j++) {
                currSum += arr[j];
                num++;
                if (num==size) {
                   newArr.add(currSum);
                   iL=i;
                   jL=j;
                }
            }
        }
        int maxvalue=Collections.max(newArr);
        System.out.println("I and J location is :" +iL +" "+jL);
        return maxvalue;
    }
}
