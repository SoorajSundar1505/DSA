import java.util.ArrayList;
import java.util.List;

public class isUnique {
    public static void main(String[] args) {
        String s = "surs";
        System.out.println(isStringUnique(s));
    }

    public static boolean isStringUnique(String s){
        //Naive Approach
        // 1.  Insert String to the list and iterate the string and verify if the char is present
//        boolean set = false;
//        List<Character> list = new ArrayList<>();
//        for(int i=0;i<s.length();i++){
//            if(list.contains(s.charAt(i))){
//                set=true;
//                break;
//            }else{
//                list.add(s.charAt(i));
//            }
//        }
//        return set;


        //Better
        //Use String builder withoutusing any other DS

//        boolean set = false;
//        StringBuilder sb = new StringBuilder(s);
//        for(int i=0;i<s.length();i++){
//            for(int j=0;j<sb.length();j++){
//                if(sb.charAt(j)==s.charAt(i) && i!=j)
//                    set = true;
//                    break;
//            }
//        }
//        return set;


        //Optimal
        //ASCII - Create a bool arr and check the value
        Boolean[] charSet = new Boolean[128];  //ASCII
        for(int i=0;i<s.length();i++){
            int val = (int) s.charAt(i);
            if(charSet[val]) {
                return false;
            }
            charSet[val]=true;
        }
        return true;
    }
}
