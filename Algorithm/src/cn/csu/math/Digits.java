package cn.csu.math;

/**
 * @package:cn.csu.math
 * @ClassName: Digits
 * @Description:
 * @Author: ZanderYan
 * @Date: 2022-01-25 11:01
 */
public class Digits {


    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int res = separateNum(num);
        while (true) {
            if (res < 10) {
                break;
            }
            res = separateNum(res);
        }
        return res;
    }

    public static int separateNum(int n) {
        int x = n;
        int sum = 0;
        while (true) {
            sum += x % 10;
            if (x < 10) {
                break;
            }
            x = x / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        /*int n = 19;
        System.out.println(n + "  " + addDigits(n));*/
        for (int i = 0; i < 30; i++) {
            System.out.println(i + "  " + addDigits(i));
        }
    }
}
