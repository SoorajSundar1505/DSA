public class CountSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }
    public static String countAndSay(int n) {
        if(n==1) return "1";
        StringBuilder current = new StringBuilder();
        String prev = countAndSay(n-1);
        int count = 0;
        for(int i=0;i<prev.length();i++){
            count++;
            if(i==prev.length()-1 || prev.charAt(i)!=prev.charAt(i+1)){
                current.append(count).append(prev.charAt(i));
                count=0;
            }
        }



        return current.toString();

    }
}

