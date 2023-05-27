package Strings;

public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "paypalishiring";
        int numRows = 3;
        int len = s.length();
        String str = "";
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<len-numRows;i=i+numRows){
            System.out.println(i);
            str=str+s.charAt(i);
            sb.deleteCharAt(i);
        }
        System.out.println(str);
        System.out.println(sb.toString());

    }
}
