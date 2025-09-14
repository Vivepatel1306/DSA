package SlidingWindow;
import java.util.*;
public class PrefixSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
System.out.println(Arrays.toString(prefSum(arr)));
    }

    public static int[] prefSum(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }
}
// import java.util.*;

// public class PrefixSum {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int[] result = prefSum(arr);

//         System.out.println(Arrays.toString(result));
//         // Output: [1, 3, 6, 10, 15]
//     }

//     public static int[] prefSum(int[] arr) {
//         int[] arr1 = arr.clone(); // copy original

//         for (int i = 1; i < arr.length; i++) { // loop till last index
//             arr1[i] = arr1[i] + arr1[i - 1];   // prefix sum
//         }

//         return arr1; // return prefix sum array
//     }
// }
