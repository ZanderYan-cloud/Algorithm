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


    public static boolean isPerfectSquare(int num) {
        if (1 == num) {
            return true;
        }
        for (int i = num / 2; i >= 2; i--) {
            if (i * i == num) {
                return true;
            }

        }
        return false;
    }


    public static int mySqrt(int x) {
        long low = 1;
        long high = x;
        long mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid * mid > x) {
                high = mid;
                continue;
            }
            if (mid * mid == x || (mid + 1) * (mid + 1) > x) {
                return (int) mid;
            }
            if (mid * mid < x) {
                low = mid;
            } else {
                high = mid;
            }

        }
        return (int) mid;
    }


    public static double myPow(double x, int n) {
        if (n < 0) {
            return 1 / (x * myPow(x, Math.abs(n) - 1));
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        } else {
            /*double a = myPow(x, n / 2);*/
            return myPow(x, n / 2) * myPow(x, n / 2);
        }
    }


    public static void main(String[] args) {
        /*for (int i = 1; i < 2000; i++) {
            System.out.println(i + "  " + myPow(i));
        }*/
        System.out.println("Math.pow(0.00001, 2147483647)  " + Math.pow(0.00001, 2147483647));
        System.out.println("myPow(0.00001, 2147483647)  " + myPow(0.00001, 2147483647));
        System.out.println("myPow(2.00000, 10)  " + myPow(2.00000, 10));
        System.out.println("myPow(2.10000, 3)  " + myPow(2.10000, 3));
        System.out.println("myPow(2.00000,-2)  " + myPow(2.00000, -2));
        /*int n = 16;
        System.out.println(n + "  " + (3/4)+"  "+ (1/4));*/
        /*for (int i = 0; i < 2000; i++) {
            System.out.println(i + "  " + isPowerOfFour(i));
        }*/
        /*for (int i = 0; i < 257; i++) {
            System.out.println(i + "  " + isPowerOfTwo(i));
        }*/
        /*for (int i = 0; i < 30; i++) {
            System.out.println(i + "  " + isPowerOfThree(i));
        }*/
    }
}
