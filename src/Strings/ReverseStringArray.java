package Strings;

public class ReverseStringArray {
    public static void main(String[] args) {
//        String arr = "My name is Suraj";
//        String[] sp = arr.split(" ");
//        String res = "";
//        for(int i=sp.length-1;i>=0;i--){
//            res = res+" "+sp[i];
//        }
//        System.out.println(res);

//        String[] arr = {"Test","array"};
//        String rev = "";
//        for(int i=arr.length-1;i>=0;i--){
//            rev=rev+" "+arr[i];
//        }
//        System.out.println(rev);



        String arr = "My name is Suraj";
        String[] sp = arr.split(" ");
        String res = "";
        String rev="";
        for(int i=sp.length-1;i>=0;i--){
            for(int j=sp[i].length()-1;j>=0;j--){
                rev=rev+sp[i].charAt(j);
            }
            rev = rev+" ";
        }
//        rev = rev+" "+res;
        System.out.println(rev);
    }
}
