package Array;

public class OddSubArray {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length, ans = 0;
        int oddStops = n/2, evenStops = (n-1)/2+1, oddStarts = 0, evenStarts = 1;
        for(int i=0; i<n; ++i) {
            ans += (oddStops*oddStarts + evenStops*evenStarts)*arr[i];
            if((i&1) == 0) {
                ++oddStarts;
                --evenStops;
            } else {
                ++evenStarts;
                --oddStops;
            }
        }
        return ans;
    }
}
