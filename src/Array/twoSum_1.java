package Array;
/**
 * leetCode 第一题 两数之和
 *
 * @src https://leetcode-cn.com/problems/two-sum/
 * @author wcc
 * @date 2021/4/24 5:00 下午.
 */

import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName twoSum_1
 * @Author wangcc
 * @Date 5:00 下午 2021/4/24
 **/
public class twoSum_1 {

    /**
     * 方法一：暴力枚举
     **/
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0, 1};
        if (nums.length == 2) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * 方法二：HashMap 哈希map
     **/
    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[]{0, 1};
        if (nums.length == 2) {
            return result;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                if (result[0] != result[1]) {
                    break;
                }
            }
        }
        return result;
    }

    /**
     * 方法三：双指针
     * 解题思路：头尾各放一个指针,通过头尾相加的形式去判断是大了还是小了再去移动指针从而达到解题
     * 这里为什么初始化的时候要设置一个-1呢 因为 如果案例是nums=[3,2,3] target=6 这里就会重复赋值就达不到我们想要的效果了 所以只需要赋值一次就好
     * 所以在初始化的时候给与了一个默认值，控制了一下
     *
     **/
    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums.length == 2) {
            return new int[]{0, 1};
        }
        int[] team = Arrays.copyOf(nums, nums.length);
        Arrays.sort(team);
        int l = 0;
        int r = nums.length - 1;
        while (true) {
            if (team[l] + team[r] > target) {
                r--;
                continue;
            }
            if (team[l] + team[r] < target) {
                l++;
                continue;
            }
            if (team[l] + team[r] == target) {
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == team[l] && result[0] == -1) {
                result[0] = i;
                continue;
            }
            if (nums[i] == team[r] && result[1] == -1) {
                result[1] = i;
            }
        }
        return result;
    }
}
