package Array;
/**
 * LeetCode 第75题 颜色分类
 *
 * @src https://leetcode-cn.com/problems/sort-colors/
 * @author wcc
 * @date 2021/4/28 5:16 下午.
 */

import java.util.Arrays;

/**
 * @ClassName plusOne_66
 * @Author wangcc
 * @Date 5:16 下午 2021/4/28
 **/
public class sortColors_75 {

    public static void main(String[] args) {
        int[] result = {1, 2, 0};
        sortColors(result);
        for (int i : result) {
            System.out.print(i + ",");
        }
    }

    public static void sortColors(int[] nums) {
        int pointer_0 = 0;
        int pointer_1 = 0;
        int team;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                team = nums[i];
                nums[i] = nums[pointer_0];
                nums[pointer_0] = team;
                if (pointer_0 < pointer_1) {
                    team = nums[i];
                    nums[i] = nums[pointer_1];
                    nums[pointer_1] = team;
                    ++pointer_1;
                }
                pointer_0++;
                pointer_1++;
            } else if (nums[i] == 1) {
                team = nums[i];
                nums[i] = nums[pointer_1];
                nums[pointer_1] = team;
                ++pointer_1;
            }
        }
    }

    /**
     * 单指针形式，需循环两次
     *
     * @param nums
     * @return void
     * @author wcc
     * @date 2021/5/24 6:55 下午
     */
    public static void sortColors1(int[] nums) {
        int pointer = 0;
        int team;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                team = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = team;
                pointer++;
            }
        }
        for (int i = pointer; i < nums.length; i++) {
            if (nums[i] == 1) {
                team = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = team;
                pointer++;
            }
        }
    }


    public static void sortColors_Me(int[] nums) {
        Arrays.sort(nums);
    }

}
