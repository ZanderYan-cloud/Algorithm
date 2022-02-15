package cn.csu.math;

/**
 * @package:cn.csu.math
 * @ClassName: Array
 * @Description:
 * @Author: ZanderYan
 * @Date: 2022-02-15 15:21
 */
public class Array {


    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        for (int low = 0; low < len; low++) {
            int high = low + 1;
            for (; high < len; high++) {
                if (nums[low] != nums[high]) {
                    break;
                }
            }
            if (high != low + 1) {
                moveElem(nums, high, high - 1 - low);
                len -= high - 1 - low;
            }
        }
        return len;
    }


    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int low = 0; low < len; low++) {
            if (nums[low] == val) {
                int high = low + 1;
                for (; high < len; high++) {
                    if (nums[high] != val) {
                        break;
                    }
                }
                moveElem(nums, high, high - low);
                len -= high - low;
            }
        }
        return len;
    }


    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        for (int low = 0; low < len; low++) {
            if (nums[low] == 0) {
                int high;
                for (high = low + 1; high < len; high++) {
                    if (nums[high] != 0) {
                        break;
                    }
                }
                moveElem(nums, high, high - low);
                /*nums[len - 1] = 0;*/
                len -= high - low;
            }
        }
        for (int i = len; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void moveElem(int[] nums, int start, int step) {
        for (int i = start; i < nums.length; i++) {
            nums[i - step] = nums[i];
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        printArray(nums, nums.length);


        nums = new int[]{0};
        moveZeroes(nums);
        printArray(nums, nums.length);

        nums = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1};
        moveZeroes(nums);
        printArray(nums, nums.length);

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        moveZeroes(nums);
        printArray(nums, nums.length);
    }


    public static void printArray(int[] array, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
}
