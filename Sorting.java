// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
// int arr[]={1,8,5,799,8,9,1};
// // int []answer=LotWater(arr);
// // for(int i=0;i<2;i++){
// //     System.out.println(answer[i]);
// // }
// System.out.println(Arrays.toString(LotWater(arr)));

//     }

//     public static int[] LotWater(int []arr){
//         int i=0;
//         int s1=arr[0];
//         int s2=arr[1];
//         while(i<arr.length-1){
//             if(s1<=arr[i]){
//                 s1=s2;
//                 s2=arr[i];
//                 i++;
//             }
//             else{
//                 i++;
//             }
//         }
//          return new int[]{s1,s2};
//     }
// }

// import java.util.Arrays;

// public class Sorting {

//     public static void main(String[] args) {
//         int arr[] = { 0, 1, 2, 2, 1, 0 };
//         System.out.println(Arrays.toString(ColorSorting(arr)));
//     }

//     public static int[] ColorSorting(int[] arr) {
//         int low = 0;
//         int mid = 0;
//         int high = arr.length - 1;
//         while (mid <= high) {
//             if (arr[mid] == 0) {
//                 int temp = arr[low];
//                 arr[low] = arr[mid];
//                 arr[mid] = temp;
//                 low++;
//                 mid++;
//             } else if (arr[mid] == 1) {
//                 mid++;
//             } else {
//                 int temp = arr[mid];
//                 arr[mid] = arr[high];
//                 arr[high] = temp;
//                 high--;

//             }
//         }
//         return arr;
//     }
// }
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = { 1, 7, 4, 6, 8, 3, 5, 9, 3, 7 };
        System.out.println(Arrays.toString(LotWater(arr)));
    }

    public static int[] LotWater(int[] arr) {

        int start = 0, end = arr.length - 1, finalStart = start, finalEnd = end;

        while (start < end) {
            if ((arr[finalStart] * (finalEnd - finalStart)) < (arr[start] * (end - start))) {
                finalStart = arr[start];
                finalEnd = arr[end];
                System.out.println("Start:" + start);
                System.out.println("finalStart:" + finalStart +"  & finalend :" +finalEnd);
                start++;
            } else if ((arr[finalStart] * (finalEnd - finalStart)) < (arr[end] * (end - start))) {
                finalStart = arr[start];
                System.out.println("end:" + end);
                finalEnd = arr[end];
                end--;
            } else if (start < end) {
                start++;
            } else {
                end--;
            }
        }

        return new int[] { finalStart, finalEnd };
    }
}