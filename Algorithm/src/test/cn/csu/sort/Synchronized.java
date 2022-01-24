package test.cn.csu.sort;

/**
 * @package:test.cn.csu.sort
 * @ClassName: Synchronized
 * @Description:
 * @Author: ZanderYan
 * @Date: 2022-01-21 11:02
 */
public class Synchronized {


    public static void main(String[] args) {
        //10-13

        /*Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;*/

        Integer a = 100;
        Integer b = 200;
        Long g = 300L;
        System.out.println(g == (a + b));
        // false   11
        /*System.out.println(c == d);*/
        // false
        /*System.out.println(e == f);*/


        // false  11
        /*System.out.println(g == (a + b));
        // false  11
        System.out.println(c == (a + b));



        // true
        System.out.println(c.equals(a + b));
        // true  11
        System.out.println(g.equals(a + b));
        synchronized (Synchronized.class){}
        m();*/
    }

    public static  synchronized void m() {

    }
}
