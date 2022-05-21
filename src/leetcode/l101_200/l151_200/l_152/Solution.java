package leetcode.l101_200.l151_200.l_152;

import java.util.Arrays;

/***********************************************************                                          *
 * Time: 2022/5/21
 * Author: HuHong
 * Desc: 乘积最大子数组
 ***********************************************************/
class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int n = nums.length;
        int[] fmax = Arrays.copyOf(nums, n);
        int[] fmin = Arrays.copyOf(nums, n);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {

            }
            else if (nums[i] > 0) {
                if (i > 0) {

                }
            } else {
                if (i > 0 && nums[i - 1] <= 0) nums[i] *= nums[i - 1];
            }
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}