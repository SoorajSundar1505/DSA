package Array;

import java.util.Arrays;

public class listRotation {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = new int[]{1,2,3,4,5};
        leftRotation(arr,k);
    }
    public static void leftRotation(int[] arr, int d){
        if(d<0 || arr==null){
            return;
        }else{
            leftrotationbyone(arr);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void leftrotationbyone(int[] arr){
        int first = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
    }
}
