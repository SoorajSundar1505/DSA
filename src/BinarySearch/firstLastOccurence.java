package BinarySearch;

public class firstLastOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        int firstindex = 0, lastindex=0, count=0;
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]==target){
                firstindex = mid;
                end=mid-1;
                count++;
            }
        }
        System.out.println(count);
    }
}
