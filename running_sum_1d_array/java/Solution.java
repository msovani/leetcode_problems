import java.util.Arrays;
public class Solution {
    public int[] runningSum(int[] nums) {
        int[] running_sum = new int[nums.length];
        int running = 0;
        for (int loop=0; loop < nums.length; loop++){
            running = running + nums[loop];
            running_sum[loop] = running;
        }
        return running_sum;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] nums = { {0, 1, 2, 3, 4}, {987, 765, 678, 1000}, {3,1,2,10,1}};
        for (int[] num: nums){
            System.out.println(Arrays.toString(num) + " = " + Arrays.toString(solution.runningSum(num)));
        }
    }
}