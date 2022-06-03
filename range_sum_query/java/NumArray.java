package range_sum_query_2d_immutable.java;

import java.util.Arrays;

public class NumArray {
    int[] mNums;
    public NumArray(int[] nums) {
        mNums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        if (mNums != null){
            for(int index=left; index <= right; index++){
                sum = sum + mNums[index];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int [] data = { -2, 0, 3, -5, 2, -1};
        int[][] params = {{0, 2}, {2, 5}, {0, 5}};
        NumArray numArray = new NumArray(data);
        for (int[] param : params){
            System.out.println(Arrays.toString(param) + " = " + numArray.sumRange(param[0], param[1]));
        }
    }

}
