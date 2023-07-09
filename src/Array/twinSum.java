package Array;

public class twinSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,4,81,19};
        int max = 0;
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            max = Math.max(arr[i]+arr[n-1-i],max);
        }
        System.out.println(max);
    }
}
