package cn.csu.math;

/**
 * @package:cn.csu.math
 * @ClassName: PowerOfThree
 * @Description:
 * @Author: ZanderYan
 * @Date: 2022-01-24 19:55
 */
public class Power {

    public static boolean isPowerOfThree(int n) {
        if (0 == n) {
            return false;
        }
        if (1 == n) {
            return true;
        }
        int x = n;
        while (true) {
            int a = x % 3;
            if (a != 0) {
                return false;
            }
            x = x / 3;
            if (x == 1) {
                break;
            }
        }
        return true;
    }


    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (1 == n) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        int x = n;
        while (true) {
            x = x / 2;
            if (x < 2) {
                break;
            }
            if (x % 2 != 0) {
                return false;
            }

        }
        return true;
    }


    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if (1 == n) {
            return true;
        }
        if (n % 4 != 0) {
            return false;
        }
        int x = n;
        while (true) {
            x = x / 4;
            if (x < 4) {
                return x % 4 == 1;
            }
            if (x % 4 != 0) {
                return false;
            }
        }
    }


    public static void main(String[] args) {
        /*int n = 16;
        System.out.println(n + "  " + (3/4)+"  "+ (1/4));*/
        for (int i = 0; i < 2000; i++) {
            System.out.println(i + "  " + isPowerOfFour(i));
        }
        /*for (int i = 0; i < 257; i++) {
            System.out.println(i + "  " + isPowerOfTwo(i));
        }*/
        /*for (int i = 0; i < 30; i++) {
            System.out.println(i + "  " + isPowerOfThree(i));
        }*/
    }
}
