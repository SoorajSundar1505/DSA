public class PrimeNumber {
    public static void main(String[] args) {
        //if number is divisible by itself -  prime

        for(int i=0;i<=100;i++){
            if(i%2!=0 && i%i==0){
                System.out.println(i);
            }
        }
    }
}
