package cn.csu.math;

import java.util.LinkedList;
import java.util.List;

/**
 * @package:cn.csu.math
 * @ClassName: PerfectNumber
 * @Description:
 * @Author: ZanderYan
 * @Date: 2022-02-14 14:54
 */
public class PerfectNumber {


    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }


    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                list.add(i);
            }
        }
        return list;
    }


    public static boolean isSelfDividingNumber(int num) {
        int n = num;
        int remainder;
        while (n > 0) {
            remainder = n % 10;
            if (0 == remainder || num % remainder != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("isSelfDividingNumber(51)  " + isSelfDividingNumber(51));
        System.out.println("selfDividingNumbers(1,22)  " + selfDividingNumbers(1, 22));
        System.out.println("selfDividingNumbers(47, 85)  " + selfDividingNumbers(47, 85));
        /*System.out.println(8128 + "  " + checkPerfectNumber(8128));
        for (int i = 0; i < 2000; i++) {
            System.out.println(i + "  " + checkPerfectNumber(i));
        }*/
    }
}
