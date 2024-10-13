import java.util.*;
import java.util.Arrays;
public class rotateArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int k=3;
        System.out.print(Arrays.toString(rotatedArray(arr,k)));
        
    }
    public static int[] rotatedArray(int[] arr,int k){
        for(int i=0;i<k;i++){
            int temp=arr[arr.length-1];
            for(int j=0;j<arr.length-1;j++){
                arr[arr.length-1-j]=arr[arr.length-2-j];
            }
            arr[0]=temp;
        }
        return arr;
    }
}
