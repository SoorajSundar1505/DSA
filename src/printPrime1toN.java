import java.util.ArrayList;
import java.util.List;

public class printPrime1toN {
    public static void main(String[] args) {
        printPrime(10);
//        printNthPrime(10,2);
    }

    public static void printPrime(int n){
        int chk=0;
        for(int i=2;i<=n;i++){
            chk=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    chk++;
                    break;
                }
            }
            if(chk==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public static void printNthPrime(int boundary, int n){
        List<Integer> al = new ArrayList();
        int count=0;
        for(int i=2;i<=boundary;i++){
            int chk=0;
            for(int j=2;j<i;j++) {
                if (i % j == 0) {
                    chk++;
                    break;
                }
            }
            if(chk==0){
                al.add(i);
            }
        }
        System.out.println(al.get(n-1));
    }
}
