public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={12,23,34,45,56,67};
        int target=23;
        System.out.print(search(arr,target));
    }
    public static int search(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
        }
    }
    return -1;
}
}

