// public class TwoPointer {
//     public static void main(String[] args) {
//         int[] arr = { 1, 4, 4, 5, 5, 5, 6, 6, 11 };
//         System.out.println(solve(arr));
//         // System.out.println(factorial(4));
//     }

//     public static int factorial(int n) {
//         if (n == 1) {
//             return 1;
//         } else {
//             return n * factorial(n - 1);
//         }
//     }

//     public static int solve(int[] arr) {
//         // int []arr={1,4,4,5,5,5,6,6,11};
//         int start = 0;
//         int end = arr.length - 1;
//         int sum = 10;
//         int PossibleSet = 0;
//         while (start < end) {
//             if (arr[start] + arr[end] < sum) {
//                 start += 1;
//                 System.out.println("start :" + start);
//             }
//             if (arr[start] + arr[end] > sum) {
//                 end -= 1;
//                 System.out.println("end :" + end);
//             } else {
//                 int temp1 = arr[start];
//                 int Ntemp1 = 0;
//                 int temp2 = arr[end];
//                 int Ntemp2 = 0;
//                 if (temp1 != temp2) {
//                     while (temp1 == arr[start]) {
//                         Ntemp1++;
//                         start++;
//                         System.out.println(Ntemp1 + "start :" + start);
//                     }
//                     while (temp2 == arr[end]) {
//                         Ntemp2++;
//                         end--;
//                         System.out.println(Ntemp2 + "start :" + end);
//                     }
//                     PossibleSet += Ntemp1 * Ntemp2;
//                 } else {
//                     while (temp1 == arr[start]) {
//                         Ntemp1++;
//                         start++;
//                         System.out.println(Ntemp1 + "start ::" + start);
//                     }
//                     PossibleSet += factorial(Ntemp1) / (2 * factorial(Ntemp1 - 2));

//                 }
//             }
//         }
//         return PossibleSet;
//     }

// }

// public class TwoPointer {
//     public static void main(String[] args) {
//         int arr[] = { 1, 4, 4, 5, 5, 6, 6, 7, 7, 11 };
//     System.out.println(    diffrence(arr, 2));
//     }

//     // int []arr;
//     public static int diffrence(int[] arr, int k) {
//         int s = 0, e = 1;
//         int totalNum = 0;
//         while (e < arr.length ) {
//             if (e == s) {
//                 e++;
// // continue;
//             }
//            else if (arr[e] - arr[s] == k) {
//                 totalNum++;
//                 // num

//                 // System.out.println(e);
//                 int tempEnd = arr[e];
//                 int tempStart = arr[e];
//                 while (s < arr.length && tempStart == arr[s]) {
//                     s++;
//                     // System.out.println(s);
//                 }

//                 while (e < arr.length && tempEnd == arr[e]) {
//                     e++;
//                 }
//                 // totalNum += numEnd * numStart;
//             } else if (arr[e] - arr[s] < k) {
//                 e++;
//             } else { // arr[e] - arr[s] > k
//                 s++;
//             }
//         }
//         return totalNum;
//     }
// }

// import java.util.ArrayList;

// public class TwoPointer {
//     public static void main(String[] args) {
//         int []arr1={3,4,6,7,15};
//         int arr2[]={5,6,7,90};
//         int arr3[]={4,8,9,180};
//         System.out.println(minMax(arr1, arr2, arr3));  
//       }

//     static int minMax(int[] arr1, int[] arr2, int[] arr3) {
//         ArrayList<Integer> minList = new ArrayList<>();
//         ArrayList<Integer> maxList = new ArrayList<>();
//         int result=0;
//         minList.add(arr1[0]);
//         minList.add(arr2[0]);
//         minList.add(arr3[0]);
//         maxList.add(arr1[arr1.length - 1]);
//         maxList.add(arr2[arr2.length - 1]);
//         maxList.add(arr3[arr3.length - 1]);
//         int max = minList.get(0);
//         for (int i = 1; i < 3; i++) {
//             // int min=maxList.get(0);
//             if (max < minList.get(i)) {
//                 max = minList.get(i);
//             }

//         }

//         int min = maxList.get(0);
//         for (int i = 1; i < 3; i++) {
//             if (min > maxList.get(i)) {
//                 min = maxList.get(i);
//             }
//         }
//         result+=min-max;
//         return result; 
//     }
// }

public class TwoPointer {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 44,9, 7, 8 };
        System.out.println(maxWater(arr));
    }

    static int maxWater(int arr[]) {
        int end = 1, start = 0, i = 1, result;
        while (i < arr.length) {
            if (arr[end] <= arr[i]) {
                // System.out.println(start);
                start = end;
                end = i;
                i++;
            } else
                i++;
        }
        result = arr[start] * arr[start];
        return result;
    }

}