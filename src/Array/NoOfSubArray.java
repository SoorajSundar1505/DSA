package Array;

public class NoOfSubArray {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int t = 4;
        System.out.println(numOfSubarrays(arr,k,t));
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int t = k*threshold;
        int s=0;
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
            if(i<k-1) continue;
            if(i>k-1) s=s-arr[i-k];
            if(s>=t) count++;
        }
        return count;

    }
}
