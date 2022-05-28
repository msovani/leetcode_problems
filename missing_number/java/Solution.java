
import java.util.List;

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int val =1; val <= nums.length; val++){
            sum = sum + val;
        }
        for(int num: nums){
            sum = sum - num;
        }
        return sum;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] nums = {{0,1,2}, {0,2,3,4}, {9,6,4,2,3,5,7,0,1}, {6}};
        for (int[] numarr : nums){
            System.out.println(List.of(numarr) + " missing value =" + solution.missingNumber(numarr));
        }
    }
}