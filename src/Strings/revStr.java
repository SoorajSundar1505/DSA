package Strings;

public class revStr {
    public static void main(String[] args) {
        System.out.println(rev("suraj"));
    }

    public static String rev(String s){
        int i=0;
        int j=s.length()-1;
        char res = ' ';
        if(i>=j) return "";
        while(i<j){
            char pos1 = s.charAt(i);
            char pos2 = s.charAt(j);
            char temp = pos1;
            pos1=pos2;
            pos2=temp;
            i++;
            j--;
        }
        return s;
    }
}
