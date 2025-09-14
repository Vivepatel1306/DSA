
import java.util.*;
// find the number which is not getting repeated

// public class BitwiseOperator {

//     public static void main(String[] args) {
//         int arr[]={2,3,4,3,5};
//         System.out.println("Num is :"+ checkNum(arr));
//     }

//    static int checkNum(int arr[]) {
//         int a=0;
//         for (int i = 0; i < arr.length ; i++) {
//             a ^= arr[i];
//         }
//         return a;
//     }
// }

// find ith bit of a number

// public class BitwiseOperator {

//     public static void main(String[] args) {
//         int num=8;
//         int position=3;
//         System.out.println("Num is :"+ check(num,position));
//     }
// static int  check(int num, int position){
//     return (num&(1<<position-1));
// }
//     }

// find the 1st right most set bit

// public class BitwiseOperator {
//         public static void main(String[] args) {
//         System.out.println(FirstSet(68));

//     }
//     static int FirstSet(int n) {
//         int i = 0;
//         while (i < 100) {
//             if ((n & (1 << i)) == 0) {
//                i++;
//             } 
//             else{
//                 return i+1;
//             }

//         }
//         return 0;
//     }

// }

// to find the number which appears once meawhile other occurs thrice

// public class BitwiseOperator {
//     public static void main(String[] args) {
//         System.out.println((3 + 3 + 1 + 3 + 3) % 4);

//     }

// }

//find the nth magic number

public class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println(magic(3
        ));

    }

    static int magic(int x) {

        // ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            int tempSum = 1;
            if ((x & (1 << i)) != 0) {
                for (int j = 0; j <=i; j++) {
                    System.out.println(j);
                    tempSum *= 5;
                }
                sum += tempSum;
                // arr[a]=i;

            }

        }

        return sum;
    }

}