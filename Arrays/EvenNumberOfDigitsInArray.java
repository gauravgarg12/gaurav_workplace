public class EvenNumberOfDigitsInArray {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int arr[]){
        int count=0;
        for(int nums:arr){
            if(even(nums)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int nums){
        int NumberOfDigits=digits(nums);
        if(NumberOfDigits%2==0){
            return true;
        }
        return false;
    }
    public static int digits(int nums){
        if(nums<0){
            nums=nums*-1;
        }
        if(nums==0){
            return 1;
        }
        int count=0;
        while(nums>0){
            count++;
            nums=nums/10;
        }
        return count;
    }
}
