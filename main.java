import java.util.*;

public class main {

  public static int[] RowColMatrix(int[][] arr, int target) {
    int row = 0;
    int col = arr.length - 1;
    while (row >= 0 && col < arr.length ) {
      if (arr[row][col] == target) {
        return new int[] { row, col };
      }
      if(arr[row][col]>target){
        row--;
      }
      else{
        col++;
      }
    }
return new int []{-1,-1};
  }

  public static void main(String[] args) {
    int [][]arr={{2,3,4},{4,5,6},{7,8,9}};
    System.out.println(Arrays.toString(RowColMatrix(arr,0)));
  }

}