package Strings;

import java.util.ArrayList;

public class isUnique {
    public static void main(String[] args) {
        String s = "abat";
        System.out.println(isUnique(s));
    }

    public static boolean isUnique(String s) {
//        ArrayList<Character> ch = new ArrayList<>();
//        boolean set = false;
//        for(int i=0;i<s.length();i++){
//            if(set=ch.contains(s.charAt(i))){
//                break;
//            }
//            else{
//                ch.add(s.charAt(i));
//            }
//        }
//
//        return set;
//        boolean set = false;
//        StringBuilder sb = new StringBuilder(s);
//        for(int i=0;i<s.length();i++){
//            for(int j=0;j<sb.length();j++){
//                if(s.charAt(i)==sb.charAt(j) && i!=j ){
//                    set = true;
//                    break;
//                }
//            }
//        }
//        return set;
//    }

        //Another way
        if(s.length()>128) return false;
        Boolean[] set = new Boolean[128];
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i);
            if(set[s.charAt(i)]){
                return false;
            }
            set[val]=true;
        }
        return true;
    }

}
