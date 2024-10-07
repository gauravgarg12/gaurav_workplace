public class RichestWealth {
    public static void main(String[] args) {
        int account[][]={{1,5,8},{7,3},{3,5}};
        System.out.println(maxWealth(account));
    }
    public static int maxWealth(int[][] account){
        int maxWealth=0;
        for(int i=0;i<account.length;i++){
            int sum=0;
            for(int j=0;j<account[i].length;j++){
                sum+=account[i][j];
            }
            if(sum>maxWealth){
               maxWealth=sum;
            }
        }
        return maxWealth;

    }
}
