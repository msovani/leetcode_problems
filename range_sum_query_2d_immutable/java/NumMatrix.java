import java.util.Arrays;

public class NumMatrix {
    int[][] mMatrix;
    public NumMatrix(int[][] matrix) {
        mMatrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        if (mMatrix != null){
            for(int row = row1; row <= row2; row++){
                for(int col = col1; col <= col2; col++){
                    sum = sum + mMatrix[row][col];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int [][] data =                    {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        int[][] params =
                {
                {2, 1, 4, 3},
                {1, 1, 2, 2},
                {1, 2, 2, 4}
            };
        NumMatrix numMatrix = new NumMatrix(data);
        for(int[] param: params){
            System.out.println(Arrays.toString(param) + " = " +
                    numMatrix.sumRegion(param[0], param[1], param[2], param[3]));
        }

    }
}
