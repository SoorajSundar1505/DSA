package Array;

import java.util.HashMap;

public class MinConsecutiveCard {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,1,1};
        System.out.println(minimumCardPickup(arr));
    }
    public static int minimumCardPickup(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                min = Math.min(min, i - map.get(arr[i]));
            }
            map.put(arr[i], i);
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min + 1;
    }
}
