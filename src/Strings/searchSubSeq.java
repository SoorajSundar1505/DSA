package Strings;

public class searchSubSeq {
    public static void main(String[] args) {
        String s = "ABCDEFGHDBAC";
        String str = "DEF";
        String actual = "";
        int i=0,j=0,count=0;
        int strlen = str.length();
        while(i<s.length()){
            while(j<s.length() && j<strlen){
                actual+= String.valueOf(s.charAt(j));
                j++;
            }
            if(str.contains(actual)){
                System.out.println("Matches from POS "+ i +" "+ j);
                break;
            }else{
                i++;
                j=i;
                strlen+=1;
                actual = "";
            }
        }
    }
}
