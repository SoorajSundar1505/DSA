package DP;

public class ClimbingStairsKSteps {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(climbK(arr,2));
    }
    public static int climbK(int[] arr, int k){
        int n = arr.length;
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(i-j<0) continue;
                dp[i]=dp[i]+dp[i-j];
            }
        }
        return dp[n];
    }
}



