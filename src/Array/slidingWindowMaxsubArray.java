package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class slidingWindowMaxsubArray {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3};
        int k = 3;
        maxsubArray(nums,k);
    }

    public static int[] maxsubArray(int[] nums, int k){
        List<Integer> al = new ArrayList<>();
        boolean set = false;
        int n = nums.length;
        int i=0,j=0;
        int max = Integer.MIN_VALUE;
        while(i<n){
            while(j<k && k<=n){
                max=Math.max(max,nums[j]);
                j++;
                set=true;
            }
            if(set==true) al.add(max);
            set=false;
            i++;
            j=i;
            k+=1;
//            max=Integer.MIN_VALUE;
        }
        int[] res = new int[al.size()];
        for(int m=0;m<al.size();m++){
            res[m]=al.get(m);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
