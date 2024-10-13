public class ceiling {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7};
        int target=8;
        int result=ceilingNumber(arr,target);
        System.out.println(result);
    }
    public static int ceilingNumber(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[arr.length-1]){
                return -1;
            }
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                 end=mid-1;
            }
            else{
                 start=mid+1;
            }
        }
        return arr[start];
    }
}
