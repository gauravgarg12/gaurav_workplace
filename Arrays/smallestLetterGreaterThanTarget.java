public class smallestLetterGreaterThanTarget {
    public static void main(String args[]){
        char[] letters={'c','f','g'};
        char target='d';
        System.out.print(smallestElementGreaterThanTarget(letters,target));
        
    }
    public static char smallestElementGreaterThanTarget(char[] letters,char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
