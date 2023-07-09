import java.util.HashMap;
import java.util.Map;

public class stringCompression {
    public static void main(String[] args) {
        String s = "sscssaabbn";
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String res="";
        sb.append(s.charAt(0)).append(1);
        for(int i=1;i<s.length();i++){
            for(int j=0;j<sb.length();j=j+2){
                if(sb.toString().charAt(j)==s.charAt(i)){
                    int val = Character.getNumericValue(sb.charAt(j+1));
                    sb.deleteCharAt(j+1);
                    sb.insert(j+1,val+1);
                }else{
                    count++;
                    res=res+s.charAt(i)+count;
                    count=0;
                }
            }
            sb.append(res);
        }
        System.out.println(sb.toString());
    }
}
