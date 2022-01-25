package cn.csu.math;

/**
 * @package:cn.csu.math
 * @ClassName: Binary
 * @Description:
 * @Author: ZanderYan
 * @Date: 2022-01-25 14:46
 */
public class Binary {

    public static String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        char carry = '0';
        int i = a.length() - 1;
        int j = b.length() - 1;
        for (; i >= 0 && j >= 0; i--, j--) {
            char x = a.charAt(i);
            char y = b.charAt(j);
            String s = plus(x, y, carry);
            if (2 == s.length()) {
                stringBuilder.append(s.charAt(1));
                carry = s.charAt(0);
            } else {
                stringBuilder.append(s.charAt(0));
                carry = '0';
            }
        }
        if (i >= 0) {
            for (; i >= 0; i--) {
                char x = a.charAt(i);
                String s = plus(x, '0', carry);
                if (2 == s.length()) {
                    stringBuilder.append(s.charAt(1));
                    carry = s.charAt(0);
                } else {
                    stringBuilder.append(s.charAt(0));
                    carry = '0';
                }
            }
        }
        if (j >= 0) {
            for (; j >= 0; j--) {
                char y = b.charAt(j);
                String s = plus('0', y, carry);
                if (2 == s.length()) {
                    stringBuilder.append(s.charAt(1));
                    carry = s.charAt(0);
                } else {
                    stringBuilder.append(s.charAt(0));
                    carry = '0';
                }
            }
        }
        if (carry != '0') {
            stringBuilder.append(carry);
        }
        return stringBuilder.reverse().toString();
    }


    public static String plus(char a, char b, char carry) {
        StringBuilder stringBuilder = new StringBuilder();
        if (a == '1' && b == '1') {
            if (carry == '1') {
                stringBuilder.append("11");
            } else {
                stringBuilder.append("10");
            }
        } else if (a == '0' && b == '1') {
            if (carry == '1') {
                stringBuilder.append("10");
            } else {
                stringBuilder.append("1");
            }
        } else if (a == '1' && b == '0') {
            if (carry == '1') {
                stringBuilder.append("10");
            } else {
                stringBuilder.append("1");
            }
        } else {
            if (carry == '1') {
                stringBuilder.append("1");
            } else {
                stringBuilder.append("0");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        /*System.out.println(addBinary("10", "10"));
        System.out.println(addBinary("10", "0"));
        System.out.println(addBinary("11", "10"));*/
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("101111", "10"));
        System.out.println(addBinary("1010", "1011"));


        /*System.out.println(plus('1','0','1'));
        System.out.println(plus('1','0','0'));
        System.out.println(plus('0','1','1'));
        System.out.println(plus('0','1','0'));*/

        /*System.out.println(plus('1','1','1'));
        System.out.println(plus('1','1','0'));*/

        /*System.out.println(plus('0', '0', '1'));
        System.out.println(plus('0', '0', '0'));*/

    }
}
