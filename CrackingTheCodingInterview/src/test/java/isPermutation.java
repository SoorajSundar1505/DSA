import java.util.Arrays;

public class isPermutation {
    public static void main(String[] args) {
        String s = "dog", t="gods";
        System.out.println(isStringPermutation(s,t));
    }

    public static boolean isStringPermutation(String s,String t){
        //Naive Approach
//        char[] arr1 = s.toCharArray();
////        Arrays.sort(arr1);
////        char[] arr2 = t.toCharArray();
////        Arrays.sort(arr2);
////        System.out.println(String.valueOf(arr1) +" "+ String.valueOf(arr2));
////        if(String.valueOf(arr1).equals(String.valueOf(arr2))){
////            return true;
////        }
////        return false;

        //Optimal - Check if two string have same char count

        char[] test = new char[128];
        char[] arr1 = s.toCharArray();
        for(char i:arr1){
            test[i]++;
        }
        System.out.println(arr1);
        for(int i=0;i<t.length();i++){
            int val = (int)t.charAt(i);
            test[val]--;
            if(test[val]<0){
                return false;
            }
        }
        return true;
    }
}
