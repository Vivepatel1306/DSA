import java.util.Arrays;

public class MoreWater {

    public static void main(String[] args) {
        int arr[] = {1, 7, 4, 6, 8, 1,1,1,1};
        System.out.println(Arrays.toString(waterStore(arr)));
    }

    public static int[] waterStore(int[] arr) {
        int maxWater = 0;
        int left = 0, right = arr.length - 1;
        int finalLeft = 0, finalRight = arr.length - 1;

        while (left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;

            if (area > maxWater) {
                maxWater = area;
                finalLeft = left;
                finalRight = right;
            }

            // Move the pointer that's shorter
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{finalLeft, finalRight};
    }
}
