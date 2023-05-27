package Array;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class slidingWindowMedian {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1,2,3,4,2,3,1,4,2};
        List<Double> list = new ArrayList<>();
        double[] ans = new double[nums.length-1];
        int i=0;
        int j=k-1;
        int median=0;
        while(i< nums.length && j< nums.length){
            for(int m=i;m<=j;m++){
                median+=nums[m];
            }
            double div = k*1.0000;
            double res = Math.round(median/div);
////            DecimalFormat df = new DecimalFormat("#.####");
////            String test = df.format(res);
//            double d = Double.parseDouble(res);
//            list.add((double)res);
            ans[i] = (double)res;
            i++;
            j++;
            median=0;
        }
        System.out.println(Arrays.toString(ans));
    }
}
