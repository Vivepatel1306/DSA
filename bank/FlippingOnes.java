package bank;

import java.util.Arrays;

public class FlippingOnes {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 0, 0, 1, 1, 1, 1 };
        System.out.println(Arrays.toString(flipper(arr, 3)));
    }

    public static int[] flipper(int[] arr, int m) {
        int maxLength = 0;
        int startPoint = 0;
        int flips = m;
        for (int i = 0; i < arr.length - 1; i++) {
            int tempLength = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == 1 && flips > 0) {
                    tempLength++;
                } else if (flips > 0) {
                    tempLength++;
                    flips--;
                    System.out.println("hii5");
                }
                if (maxLength < tempLength) {
                    maxLength = tempLength;
                    startPoint = i;
                }
            }
        }
        return new int[] { startPoint, maxLength };
    }

}
