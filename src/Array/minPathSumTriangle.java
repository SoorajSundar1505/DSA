package Array;

import java.util.ArrayList;
import java.util.List;

public class minPathSumTriangle {
    public static void main(String[] args) {
        int[][] tri = {{-1,0},{-11}};
        int len = tri.length;
        int min = Integer.MAX_VALUE;
        int add = 0;
        for(int i=0;i<len;i++){
            for(int j=0;j<tri[i].length;j++){
                min=Math.min(min,tri[i][j]);
            }
            add+=min;
            min=Integer.MAX_VALUE;
        }
    System.out.println(add);
    }
}
