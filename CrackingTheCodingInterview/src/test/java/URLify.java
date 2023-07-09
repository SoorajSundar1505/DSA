public class URLify {
    public static void main(String[] args) {
        String s = "the dog is ";
        System.out.println(urlify(s));
    }

    public static String urlify(String s){
//        if(s==null  || s.length()==0) return s;
//        s=s.replaceAll(" ","%20");
//        return s;

        int spacecount = 0;
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') spacecount++;
        }
        int len = s.length()+spacecount*2;
        for(int i=len;i>=0;i--){

        }
        return "Ab";
    }

}
