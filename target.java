import java.util.Arrays;
import java.util.HashMap;

public class target {
    public static void main(String[] args) {
        
        int arr[] = { -1, -2, -3, -4,0 };
        System.out.println(Arrays.toString(findTarget(arr,-8)));

    }

    public static int[] findTarget(int[] arr, int target) {
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
            if (currSum - target == 0) {
                start = 0;
                end = 0;
            }
            if(map.containsKey(currSum-target)){
                start=map.get(currSum-target)+1;
                end=i;
            }
            map.put(currSum,i);

        }

        if(end==-1)
        {
           return new int[] {-1,-1};
        }
        else{
            return new int[] {start,end};
        }
    }
}
