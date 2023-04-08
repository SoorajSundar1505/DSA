package Array;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int s = 12;

        int left = 0;
        int right = 0;
        int n = arr.length;
        int curr = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(left<=n || right<=n){
            if(curr<s){
                curr=curr+arr[right];
                right++;
            }else if(curr>s){
                curr=curr-arr[left];
                left++;
            }else if(curr==s){
//                System.out.println(left+","+(right-1));
                list.add(left);
                list.add(right);
                System.out.println(list);
                break;
            }else{
                System.out.println(-1);
            }
        }
    }
}
