package Array;
/**
 * leedCode 54题 螺旋矩阵
 *
 * @src https://leetcode-cn.com/problems/spiral-matrix/
 * @author wcc
 * @date 2021/4/24 5:04 下午.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName spiralOrder_54
 * @Author wangcc
 * @Date 5:04 下午 2021/4/24
 **/
public class spiralMatrix_54 {


    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int l = 0, t = 0;
        int r = matrix[0].length - 1;
        int d = matrix.length - 1;
        while (true) {
            for (int i = l; i <= r; i++) {
                result.add(matrix[t][i]);
            }
            t++;
            if (t > d) break;
            for (int i = t; i <= d; i++) {
                result.add(matrix[i][r]);
            }
            r--;
            if (r < l) break;
            for (int i = r; i >= l; i--) {
                result.add(matrix[d][i]);
            }
            d--;
            if (d < t) break;
            for (int i = d; i >= t; i--) {
                result.add(matrix[i][l]);
            }
            l++;
            if (l > r) break;
        }
        return result;
    }


}
