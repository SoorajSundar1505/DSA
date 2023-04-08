import java.util.Arrays;

public class MatrixBinarySearch {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{10,11,16,20},{23,25,26,28}};
        int target = 1;
        boolean result = search(nums,target);
        System.out.println(result);
    }

    public static boolean search(int[][] nums, int target){
        int row = 0;
        int col = nums[0].length-1;
        while(row<nums.length && col>=0){
            System.out.println(nums[row][col]);
            if(nums[row][col]==target){
                return true;
            }
            else if(nums[row][col]<target){
                row++;
            }else{
                col--;
            }
        }

        return false;
    }
}
