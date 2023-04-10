package DP;

public class nSums {
    public static void main(String[] args) {
        int[] arr = {1,4,6,76,7};
        System.out.println(nsum(arr));

    }
    public static int nsum(int[] arr){
//        int[] dp = new int[arr.length+1];
//        dp[0]=arr[0];
//        for(int i=1;i<arr.length;i++){
//            dp[i]=dp[i-1]+arr[i];
//        }
//        return dp[arr.length-1];
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count = count+arr[i];
        }
        return count;
    }
}


