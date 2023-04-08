import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[] args) {
        float avg = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        avg = sum/n;
        System.out.println(avg);


    }
}
