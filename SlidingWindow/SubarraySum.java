package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

// public class SubarrySum {
//     public static void main(String[] args) {
//         int arr[]={9,4,20,3,10,5};
//         System.out.println(possible(arr,33));
//     }
//     public static int possible(int []arr,int target){
// int count=0;

//         for(int i=0;i<arr.length-1;i++){
//             int tempSum=0;
//             for(int j=i;j<arr.length-1;j++){
//                 tempSum+=arr[j];
//                 if(tempSum==target){
//                     count++;

//                 }
//                 else if(tempSum>target){
//                     break;
//                 }
//             }
//         }
//         return count;
//     }
// }





// public class SubarraySum {
//     public static void main(String[] args) {
//         int arr[] = { 9,  20, 3, 10, 5,33  };
//        TargetMatch(arr, 33);
//     }

//     public static void TargetMatch(int[] arr, int target) {
//         int sum = 0, start = 0, end = -1;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < arr.length - 1; i++) {
//             sum += arr[i];
//             if (sum - target == 0) {
//                 start = 0;
//                 end = i;
                
//             }
//             if (map.containsKey(sum - target)) {
//                 start = map.get(sum - target) + 1;
//                 end = i;
               
//             }
//             map.put(sum,i);
//         }
//         if(end==-1){
//             System.out.println("Elemet not found");
//         }
//         else{
//             System.out.println("Starting is :"+start +"& ending is :"+end);
//         }

//     }
// }



public class SubarraySum {
    public static void main(String[] args) {
        int arr[] = { 9,1,   3, 10, 5,31,1,1 ,33 };
       TargetMatch(arr, 33);
    }

    public static void TargetMatch(int[] arr, int target) {
        int sum = 0, start = 0, end = -1,count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
            if (sum - target == 0) {
                start = 0;
                end = i;
                
            }
            if (map.containsKey(sum - target)) {
                start = map.get(sum - target) + 1;
                end = i;
                count++;
               
            }
            map.put(sum,i);
        }
        if(end==-1){
            System.out.println("Elemet not found");
        }
        else{
            System.out.println("Starting is :"+start +"& ending is :"+end);
            System.out.println("Count is :"+count);
        }

    }
}