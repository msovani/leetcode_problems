from typing import List


class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        sum = 0
        for num in range(1, len(nums) + 1):
            sum = sum + num
        for val in nums:
            sum = sum - val
        return sum


if __name__ == '__main__':
    sol = Solution()
    nums_arr = [[0, 1, 2], [0, 2, 3, 4], [9, 6, 4, 2, 3, 5, 7, 0, 1],
[9, 6, 4, 2, 3, 5, 7, 0, 1, 10, 11, 12, 8, 14]]
    for loop in range(0, len(nums_arr)):
        print(sol.missingNumber(nums=nums_arr[loop]))