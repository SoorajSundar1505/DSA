package Strings;

public class repeatedChar {
    public static void main(String[] args) {
        repeated("abcdeer");
    }
    public static void repeated(String s){
        boolean set = false;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                set=true;
            }
        }
        if(set==true){
            System.out.println("repeated");
        }else{
            System.out.println("not repeated");
        }
    }
}
