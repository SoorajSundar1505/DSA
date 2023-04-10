package DP;

public class MinCostClimbinStair {
    public static void main(String[] args) {
        int[] arr = {10,15,20};
        System.out.println(mincost(arr));
    }
    public static int mincost(int[] arr){
        int n=arr.length;
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=n;i++){
            dp[i] = Math.min(dp[i-1]+arr[i-1],dp[i-2]+arr[i-2]);
        }
        return dp[n];
    }
}
