public class MedianArray {
    public static void main(String[] args) {
        int[] nums3 = {1,3,2,4,5,6,8,9};
        int nums3_len = nums3.length;
        double res = 0;
        if(nums3_len%2!=0){
            res = nums3[nums3_len/2];
            System.out.println(res);
        }else{
            res = (nums3[(nums3_len-1)/2] + nums3[nums3_len/2])/2.0;
            System.out.println(res);
        }
    }
}
