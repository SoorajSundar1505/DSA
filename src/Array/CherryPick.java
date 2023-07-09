package Array;

public class CherryPick {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,-1},{1,0,-1},{1,1,1}};
        int max=0;
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[0].length-1;j++) {
                if (matrix[i][j] == 1 &&
                        matrix[i][j + 1] != -1 ||
                        matrix[i + 1][j + 1] != -1 ||
                        matrix[i + 1][j] != -1) {
                    max++;
                }

            }
        }
        if(matrix[matrix.length-1][matrix.length-1]==1){
            max+=1;
        }
        System.out.println(max);
    }
}
