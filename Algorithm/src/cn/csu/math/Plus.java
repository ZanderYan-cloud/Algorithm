package cn.csu.math;

/**
 * @package:cn.csu.math
 * @ClassName: Plus
 * @Description:
 * @Author: ZanderYan
 * @Date: 2022-01-24 16:15
 */
public class Plus {


    public static int[] plusOne(int[] digits) {
        int carry = 0;
        int[] retArray;
        int lastElem = digits[digits.length - 1];
        boolean flag = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9){
                flag = false;
            }
        }
        if (flag) {
            retArray = new int[digits.length + 1];
        } else {
            retArray = new int[digits.length];
        }
        int count = retArray.length - 1;
        int elem = 0;
        int res = lastElem + 1;
        if (res >= 10) {
            elem = res % 10;
            carry = res / 10;
        } else {
            elem = res;
        }
        retArray[count--] = elem;
        if (carry > 0){
            retArray[count] = carry;
        }
        for (int i = digits.length - 2; i >= 0; i--) {
            res = digits[i] + retArray[count];
            if (res >= 10) {
                elem = res % 10;
                retArray[count-1] = res / 10;
            } else {
                elem = res;
            }
            retArray[count--] = elem;
        }
        return retArray;
    }


    public static void main(String[] args) {
        int[] array = new int[]{9,9,9};
        int[] array1 = plusOne(array);
        printArray(array1);
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
