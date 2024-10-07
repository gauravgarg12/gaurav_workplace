import java.util.Arrays;

public class LinearSearchIn2dArray {
    public static void main(String args[]){
    int[][] arr={{12,13,14},{23,56,78},{34,67},{11,10,85}};
    int target=34;
    System.out.print(Arrays.toString(search(arr,target)));
    }
    public static int[] search(int arr[][],int target){
         for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
         }

        return new int[]{-1,-1};
    }
}
