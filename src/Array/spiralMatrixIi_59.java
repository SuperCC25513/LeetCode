package Array;
/**
 * leetCode 59题 螺旋矩阵2
 *
 * @src https://leetcode-cn.com/problems/spiral-matrix-ii/
 * @author wcc
 * @date 2021/4/24 5:07 下午.
 */

/**
 * @ClassName spiralMatrixIi_59
 * @Author wangcc
 * @Date 5:07 下午 2021/4/24
 **/
public class spiralMatrixIi_59 {

    public static void main(String[] args) {
        int[][] ints = generateMatrix(3);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i + ",");
            }
            System.out.println();
        }

    }

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int t = 0, l = 0;
        int r = n - 1, d = n - 1;
        int num = 1, tag = n * n;
        while (num <= tag) {
            for (int i = l; i <= r; i++) {
                result[t][i] = num;
                num++;
            }
            t++;
            for (int i = t; i <= d; i++) {
                result[i][r] = num;
                num++;
            }
            r--;
            for (int i = r; i >= l; i--) {
                result[d][i] = num;
                num++;
            }
            d--;
            for (int i = d; i >= t; i--) {
                result[i][l] = num;
                num++;
            }
            l++;
        }
        return result;
    }

}
