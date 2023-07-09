package mockInterview;

public class Interview1 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
        int k = 3;
        int res = maxSeq(arr,k);
        System.out.println(res);
    }

//    Given a binary array, find the maximum sequence of continuous 1’s that can be formed by replacing at most k zeroes by ones.
//    For example, consider the following binary array A:
//    Input: A[] = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 }
//    For k = 0,
//    The length of the longest sequence is 4 (from index 6 to 9)
//    For k = 1
//    The length of the longest sequence is 7 (from index 3 to 9)
//    For k = 2,
//    The length of the longest sequence is 10 (from index 0 to 9)
//    For k = 3,
//    The length of the longest sequence is 11 (fr
//    The length of the longest sequence is 11 (from index 0 to 10)


    static int maxSeq(int[] arr, int k){
        int a = 0, max = 0, zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            if(zero>k){
                if(arr[a]==0){
                    zero--;
                }
                a++;
            }
            max = Math.max(max,i-a+1);
        }
        return max;

    }
}

