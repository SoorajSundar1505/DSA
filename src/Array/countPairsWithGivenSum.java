package Array;

public class countPairsWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1}, sum = 11;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]+arr[j])==sum){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
