package Recursion;

public class Print1toN {
    public static void main(String[] args) {
        print1ToN(10,1);
    }

    public static void print1ToN(int i, int n){
        if(i<n) return;
        else {
            System.out.println(i);
            print1ToN(i-1,n);
        }

    }
}
