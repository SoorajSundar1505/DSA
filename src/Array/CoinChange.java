package Array;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,3,5};
        int amount = 11;
        System.out.println(coin(coins,amount));
    }
    public static int coin(int[] coin, int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int c:coin){
                if(i>=c) dp[i]=Math.min(dp[i],dp[i-c]+1);
            }
        }
        return dp[amount]>amount?-1:dp[amount];

    }
}
