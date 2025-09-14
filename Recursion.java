// public class Recursion {
//     public static void main(String[] args) {
//         System.out.println(fact(3));

//         // fact(5);
//     }

//     static int fact(int i) {
//         if (i < 2) {
//             return i;
//         }
//         return i * fact(i - 1);
//         // return i;
//     }
// }

// class Recursion{
//     public static void main(String[] args) {
//         int []arr={2,3,5,66,77,8,9,7};
//         int target=66;
//         System.out.println(  Bs(arr,target,0,arr.length-1));

//     }
//     static int Bs(int[] arr,int target, int s, int e){
//             if(s>e){
//                 return -1;
//             }
//             int m=s+(e-s)/2;
//             if(arr[m]==target){
//                 return m;
//             }
//             if(target<arr[m]){
//                 return Bs(arr,target,s,m-1);
//             }
//             return Bs(arr,target,m+1,e);
//         }
// }

class Recursion {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7, 89, 99 };
        int s = 0, e = arr.length - 1, target =99;
      System.out.println( Target(arr, s, e, target)); 
    }

    static int Target(int[] arr, int s, int e, int target) {
        // s=0;
        // e=arr.length-1;

        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            return Target(arr, mid + 1, e, target);
        }
        return Target(arr, s, mid - 1, target);

    }
}