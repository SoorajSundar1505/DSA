package Array;

import java.util.Arrays;

public class kRadiusSubArray {
    public static void main(String[] args) {
        int[] input = {7,4,3,9,1,8,5,2,6};
        int[] output = new int[input.length];
        int k = 3;
        int avg = 0;

        for(int i=0;i<input.length;i++){
            for(int j=i;j<k;j++){
                avg+=input[j];
            }
//            System.out.print("K is "+ k);
//            System.out.println();
            k=k+1;
            if(i>input.length) break;
            System.out.print(avg +" ");
            avg=0;

        }
    }
}
