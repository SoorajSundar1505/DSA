package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newintervals = {4,8};
        System.out.println(insert(intervals,newintervals));
    }
    public static int[][] insert(int[][] intervals, int[] newintervals) {
        List<int[]> res = new ArrayList<>();
        for(int[] slot : intervals) {
            if (newintervals[1] < slot[0]) {
                res.add(newintervals);
                newintervals = slot;
            } else if (slot[1] < newintervals[0]) {
                res.add(slot);
            } else {
                newintervals[0] = Math.min(slot[0], newintervals[0]);
                newintervals[1] = Math.max(slot[1], newintervals[1]);
            }
        }
        res.add(newintervals);
        return res.toArray(new int[res.size()][]);
    }
}
