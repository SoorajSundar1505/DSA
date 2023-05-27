package Array;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectInHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int maxArea = 0;
        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<=n;i++){
            int curr = i==n?0:heights[i];
            while(!st .isEmpty() && curr<heights[st .peek()]){
                int top = st .pop();
                int width = st .isEmpty()?i:i-st .peek()-1;
                int area = heights[top]*width;
                maxArea  = Math.max(maxArea ,area);
            }
            st .push(i);
        }
        System.out.println(maxArea );
    }

}
