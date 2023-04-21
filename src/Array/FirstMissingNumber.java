package Array;

import java.util.*;

public class FirstMissingNumber {
    public static void main(String[] args) {
//        int[] test = {1, 3, 6, 4, 1, 2};
        int[] test = {1,2,0};
        //1,1,2,3,4,6
        System.out.println(solution(test));
    }

    public static int solution(int[] A) {
        // Implement your solution here
//        int n = A.length;
//        int i = 0;
//        int missing = 1;
//        Arrays.sort(A);
//        //1,1,2,3,4,6
//        while(i<n){
//            if(A[i]==missing){
//                i++;
//                missing++;
//            }else if(A[i]>missing){
//                return missing;
//            }else{
//                i++;
//            }
//        }
//        return missing;

//        Arrays.sort(A);
        Set<Integer> set = new HashSet<>();
        int test = 0;
        for(int i:A){
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        for(int i=0;i< set.size();i++){
            if(i+1<list.get(i)){
                System.out.println(i+1);
            }else{
                test=i+1;
            }
        }
        return test;
    }
}
