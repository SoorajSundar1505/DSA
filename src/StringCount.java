public class StringCount {
    public static void main(String[] args) {
        String str = "love live! mu'sic";
        int count = 0;
        String[] sp = str.split(" ");
        for(String a : sp ){
            if(a.length()!=0) count++;
        }
        System.out.println(count);
    }
}
