package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int s = 12;
        ArrayList<Integer> list = new ArrayList<>();
        int left=0;
        int right=0;
        int curr = 0;
        int n = arr.length;
        while(left<=n || right<=n){
            if(curr<s){
                curr+=arr[right];
                right++;
            } else if(curr>s){
                curr-=arr[left];
                left++;
            }else if(curr==s){
                list.add(left);
                list.add(right);
//                System.out.println(list);
                break;
            }
            else{
                System.out.println(-1);
            }
        }
        System.out.println(list);

    }
}
