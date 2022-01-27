package cn.csu.math;

/**
 * @package:cn.csu.math
 * @ClassName: MissingNumber
 * @Description:
 * @Author: ZanderYan
 * @Date: 2022-01-26 10:25
 */
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int count = 0;
        int res = -1;
        int max = nums.length;
        for (int i = 0; i < len - 1; i++) {
            int min = nums[i];
            int index = -1;
            for (int j = i + 1; j < len; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    index = j;
                }
            }
            if (min != count) {
                res = count;
                break;
            }
            //nums[i] nums[j]
            if (-1 != index) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            count++;
        }
        if (res != -1) {
            return res;
        }
        if (nums[len - 1] < max) {
            return max;
        } else if (nums[len - 1] == max) {
            return max - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        /*int[] nums = new int[]{8, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums));*/

        int[] nums = new int[]{1, 2};
        System.out.println(missingNumber(nums));


        /*nums = new int[]{3, 0, 1};
        System.out.println(missingNumber(nums));

        nums = new int[]{0};
        System.out.println(missingNumber(nums));*/

    }
}
