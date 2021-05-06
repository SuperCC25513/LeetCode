package Array;
/**
 * LeetCode 第66题 加一
 *
 * @src https://leetcode-cn.com/problems/plus-one/
 * @author wcc
 * @date 2021/4/28 5:16 下午.
 */

/**
 * @ClassName plusOne_66
 * @Author wangcc
 * @Date 5:16 下午 2021/4/28
 **/
public class plusOne_66 {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] plusOne = plusOne(digits);
        for (int i : plusOne) {
            System.out.print(i + ",");
        }
    }

    //网友的
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //跳出for循环，说明数字全部是9
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }


    public static int[] plusOneByMe(int[] digits) {
        int targ = digits.length - 1;
        while (true) {
            digits[targ] += 1;
            if (targ == 0 && digits[targ] == 10) {
                return addArr(digits);
            }
            if (digits[targ] < 10) {
                break;
            } else {
                digits[targ] = digits[targ] - 10;
                targ--;
            }

        }
        return digits;
    }

    public static int[] addArr(int[] digits) {
        int[] resule = new int[digits.length + 1];
        resule[0] = 1;
        for (int i = 1; i < resule.length - 1; i++) {
            resule[i] = digits[i];
        }
        return resule;
    }

}
