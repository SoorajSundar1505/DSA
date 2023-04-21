package Array;

public class MissingNumber {
    public static void main(String[] args) {
//        int nums[] = new int[]{0};
//        int sumArr = 0;
//        for(int i:nums){
//            sumArr+=i;
//        }
//        int n = nums.length;
////        System.out.println(n);
//        int sumAll = n*(n+1)/2;
//        System.out.println("SumArr--> "+ sumArr);
//        System.out.println("sumAll--> "+ sumAll);
//        System.out.println(sumAll-sumArr);


        int[] nums = {0,1,3};
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int n = nums.length;
        int sumall = n*(n+1)/2;
        System.out.println(sumall-sum);
    }
}
