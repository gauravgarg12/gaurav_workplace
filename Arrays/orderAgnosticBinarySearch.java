import java.util.*;
public class orderAgnosticBinarySearch {
    public static void main(String args[]){
        int[] arr={31,23,14,13,12,10,9,8};
        int target=13;
        int ans=orderAgnosticBinarySearch(arr,target);
        System.out.print(ans);
        
    }
    public static int orderAgnosticBinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        Boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else{
                if(isAsc){
                    if(target<arr[mid]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
                else{
                    if(target<arr[mid]){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
            }
        }
        
        return -1;
    } 
}
