package Array;

public class buySellStockIII {
    public static void main(String[] args) {
        int[] prices = {1,2,4};
        int ans=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                int diff=prices[i]-prices[i-1];
                if(ans<diff){
                    ans = diff;
                }else{
                    ans+=diff;
                }
            }
        }
        System.out.println(ans);

    }

}
