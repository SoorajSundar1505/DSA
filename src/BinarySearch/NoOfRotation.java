package BinarySearch;

public class NoOfRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,2,2};
        int res = 0;
        int start =0, end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start = mid+1;
            }
        }
        System.out.println(arr[start]);

    }
}
