package Strings;

public class slidingWindow {
    public static void main(String[] args) {
        String s = "ABCDEFGHDBAC";
        String str = "DAC";
        int t = 4;
        int i = 0, j=0;
        String op = "";
        int c = 0;
        while(i<s.length()){
            while(j<t && t<=s.length()){
                op+=s.charAt(j);
                j++;
            }
            System.out.print(op);
            op="";
            System.out.println();
            i++;
            t=t+1;
            j=i;
        }


    }
}

