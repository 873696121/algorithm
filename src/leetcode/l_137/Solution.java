package leetcode.l_137;

import java.util.BitSet;

/***********************************************************                                          *
 * Time: 2022/5/10
 * Author: HuHong
 * Desc: 只出现一次的数字 II
 ***********************************************************/
class Solution {
    public int singleNumber(int[] nums) {
        int[] cnt = new int[32];
        for(int i = 0; i < 32; i ++){
            for(int j = 0; j < nums.length; j ++){
                cnt[i] += (nums[j] >> i) & 1;
            }
        }
        int res = 0;
        for(int i = 0; i < 32; i ++){
            if(cnt[i] % 3 == 1) res += 1 << i;
        }
        return res;
    }
}