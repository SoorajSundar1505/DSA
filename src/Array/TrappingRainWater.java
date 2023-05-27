package Array;

public class TrappingRainWater {
    public static void main(String[] args) {
       int a[] = { 0 , 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
       int n = a.length;
       int res=0;
       for(int l=0;l<n;l++){
           int left_max=a[l];
           int right_max=a[l];
           for(int i=l-1;i>=0;i--){
               left_max = Math.max(left_max,a[i]);
           }
           for(int j=l+1;j<n;j++){
               right_max = Math.max(right_max,a[j]);
           }
           int min = Math.min(left_max,right_max);
           res+=min-a[l];
       }
       System.out.println(res);
    }
}
