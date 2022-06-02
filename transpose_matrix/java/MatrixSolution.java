import java.util.Arrays;
class MatrixSolution {
    public int[][] transpose(int[][] matrix) {
        int[][] response = new int[matrix[0].length][matrix.length];
        for (int row=0; row < matrix.length; row++){
            for(int col=0; col < matrix[row].length; col++){
                response[col][row] = matrix[row][col];
            }
        }
        return response;
    }
    public static void main(String[] args){
        MatrixSolution matrixSolution = new MatrixSolution();
        int[][][] matrices = {
                {{9,8,7},{6,5,4}},
                {{1,2,3},{4,5,6},{7,8,9}},
                {{1,2,3},{4,5,6}}
        };
        for(int[][] matrix : matrices){
            System.out.println(Arrays.toString(matrixSolution.transpose(matrix)));
        }
    }
}