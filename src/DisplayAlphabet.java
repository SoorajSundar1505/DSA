public class DisplayAlphabet {
    public static void main(String[] args) {
//        char c ;
//        for(c='a';c<='z';++c){
//            System.out.println(c);
//        }

        //No.of digit
        int digit = 99000876;
        int count=0;
        while(digit!=0){
            digit/=10;
            count++;
        }
        System.out.println(count);

        int num = 12345;
        String res="";
        while(num!=0){
            int digits = num%10;
//            res=res*10+digits;
            res=res+digits;
            num=num/10;
        }
        System.out.println(Integer.parseInt(res));

    }
}
