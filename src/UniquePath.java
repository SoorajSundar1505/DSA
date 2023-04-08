import java.util.Arrays;

public class UniquePath {
    public static void main(String[] args) {
        System.out.println(unique(3,3));
    }

    public static int unique(int m, int n){
        int[][] dp = new int[m][n];

        for(int i=0;i<m;i++){
            System.out.println(Arrays.toString(dp));
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    System.out.println(Arrays.toString(dp));
                }
            }
        }

        return dp[m-1][n-1];
    }
}
