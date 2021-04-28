package Array;
/**
 * leetCode 第39题 组合总和
 *
 * @author wcc
 * @date 2021/4/24 5:17 下午.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName combinationSum_39
 * @Author wangcc
 * @Date 5:17 下午 2021/4/24
 **/
public class combinationSum_39 {


    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> listList = combinationSum(candidates, target);
        for (List<Integer> integers : listList) {
            integers.forEach(x -> System.out.print(x + ","));
            System.out.println();
        }

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resule = new ArrayList<>();
        Arrays.sort(candidates);
        for (int i = 0; i < candidates.length; i++) {
            int targetcopy = target;
            List<Integer> item = new ArrayList<>();
            int j = i;
            while (true) {
                if (targetcopy >= candidates[j]) {
                    targetcopy -= candidates[j];
                    item.add(candidates[j]);
                }
                if (targetcopy < candidates[j]) {
                    if (j == candidates.length) {
                        break;
                    } else {
                        j++;
                    }

                }
                if (targetcopy == 0) {
                    break;
                }
            }
            if (item.size() > 0) {
                resule.add(item);
            }
        }
        return resule;
    }

}
