public class MinimumElement {
    public static void main(String[] args) {
        int arr[]={12,23,34,10,18,45};
        System.out.print(minimum(arr));
    }
    public static int minimum(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
             if(arr[i]<min){
                min=arr[i];
             }
        }
        return min;
    }

}
