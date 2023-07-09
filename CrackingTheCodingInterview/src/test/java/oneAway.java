public class oneAway {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ac";
        char[] miss = new char[s.length()];
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=t.charAt(i)) miss[i] = t.charAt(i);

        }
        if(miss.length>1){
            System.out.println("Not OneAway");
        }else if(miss.length==1){
            System.out.println("One Away");
        }
    }

}
