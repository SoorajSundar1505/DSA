public class Mock01 {
    public static void main(String[] args) {
        int[] days = {1,4,6,7,17,20};
        int[] cost = {2,7,15};
        System.out.println(minCost(days,cost));
    }

    static int  minCost(int [] days, int costs[]){


        return 1;
    }

//    A cab service offers three types of passes. 1D, 7D, 30D. A T days pass can be used for a continuous
//    duration only. Consider the days of the year being labeled sequentially from 1 to 365. Travelling is
//    required only on some selected days of the year(input). Given the cost of different passes and the
//    days on which travel is required, Calculate the minimum amount using which we can travel on all these days.
//    Input: days = [1,4,6,7,8,20], costs = [2,7,15]
//    Output: 11(2 + 7 + 2)
}


// int[] dp = new int[days.length]
//dp[0] = 2 which is a 1D
//iterate from dp[2]
//    i = 2
//       val =  f(i)-f(i-1)
//            if(val>7){
//                val = val-f(i);
//            }
//
//  4 6 7 8 20 ... 365
//  0 0 0 0 0
//
//2
//
//7

//15