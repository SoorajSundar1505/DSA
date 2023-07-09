public class fibo {
    public static void main(String[] args) {
        fiboSeries(10);
        System.out.println(findNthNumber(5));
    }

    //Print till n
    public static void fiboSeries(int n){
        int a=0,b=1,c=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
    }


    //find nth number
    public static int findNthNumber(int n){
        int a=0,b=1,c=0;
        int nth = 0;
        for(int i=2;i<=n;i++){
            c=a+b;
            if(i==n-1) nth=c;
            a=b;
            b=c;
        }
        return nth;
    }
}
