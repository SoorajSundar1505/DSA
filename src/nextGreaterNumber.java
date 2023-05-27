import java.util.Arrays;

public class nextGreaterNumber {
    public static void main(String[] args) {
//        int n = 1234;
//        char[] chars = String.valueOf(n).toCharArray();
//        int i=0;
//        int len= chars.length;
//
//        for(i=len-2;i>=0;i--){
//            if(chars[i-1]<chars[i]) break;
//        }
//
//        if(i==0){
//            for(i=0;i<len;i++){
//                System.out.println(chars[i]);
//            }
//        }else{
//            int min = i;
//            for(int j=i+1;j<len;j++){
//                if(chars[j]>chars[i-1] && chars[j]<chars[min]){
//                    min = j;
//                }
//            }
//
//            //swap
//            char temp = chars[i-1];
//            chars[i-1]=chars[min];
//            chars[min]=temp;
//
//            //swap and
////            Arrays.sort(chars,i,len);
////
////            System.out.print("Next greater number: ");
//            System.out.print(chars);
//        }

        int n = 1234;
        char[] ch = String.valueOf(n).toCharArray();
        int len = ch.length, i=0, j=0;

        //1st digit smaller
        for(i=len-1;i>=0;i--){
            if(ch[i-1]<ch[i]) break;
        }

        //Find small digit from i to j
        for (j = len - 1; j>=i; j--) {
            if (ch[i] < ch[j]) break;
        }
        // swap and sort
        char temp = ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        Arrays.sort(ch,i,len);
        System.out.println(ch);
    }
}
