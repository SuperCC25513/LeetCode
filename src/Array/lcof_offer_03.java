package Array;
/**
 * LeetCode 剑指 Offer 03. 数组中重复的数字
 *
 * @src https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * @author wcc
 * @date 2021/4/28 5:23 下午.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName lcof_offer_03
 * @Author wangcc
 * @Date 5:23 下午 2021/4/28
 **/
public class lcof_offer_03 {

    public static void main(String[] args) {
        int[] digits = {2, 3, 1, 0, 2, 5, 3};
        int result = findRepeatNumber(digits);
        System.out.println(result);
    }

    public static int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }

    public static int findRepeatNumberByMe(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : nums) {
            if (map.containsKey(integer)) {
                return integer;
            } else {
                map.put(integer, 1);
            }
        }
        return 1;
    }

}
