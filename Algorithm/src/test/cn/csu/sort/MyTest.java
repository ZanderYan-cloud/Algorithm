package test.cn.csu.sort;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @package:test.cn.csu.sort
 * @ClassName: MyTest
 * @Description: 验证语法
 * @Author: ZanderYan
 * @Date: 2021-12-28 17:29
 */
public class MyTest {


    public String concactString(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }

    public static void main(String[] args) {
        //10-3
            /*Object[] array = new String[10];
            array[0] = 10;
            System.out.println(array[0]);*/


        //JDK的详细版本号，例如：1.8.0_91 ， 1.7.0_79，1.6.0
            /*System.out.println(System.getProperty("java.version"));
            //JDK的标准版本 ，例如：1.8 , 1.7 , 1.6
            System.out.println(System.getProperty("java.specification.version"));

            // 获取JDK的位数

            // 包含 "64",即可64位 JDK , 否则 32位
            System.out.println("JDK的位数:"+System.getProperty("java.vm.name"));

            // 64位JDK：amd64 ，32位JDK：x86
            System.out.println("JDK的位数:"+System.getProperty("os.arch"));

            // 64位JDK：64 ，32位JDK：32
            System.out.println("JDK的位数:"+System.getProperty("sun.arch.data.model"));*/

        //10-15
            /*while (false){
                  System.out.println("");
            }*/


        System.out.println(Runtime.getRuntime().availableProcessors());

        //10-13
        /*Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        // false   11
        System.out.println(c == d);
        // false
        System.out.println(e == f);
        // false  11
        System.out.println(c == (a + b));
        // true
        System.out.println(c.equals(a + b));
        // false  11
        System.out.println(g == (a + b));
        // true  11
        System.out.println(g.equals(a + b));*/

        //类型转换
        long a = 3L;
        float b = a;

        /*ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "]" + threadInfo.getThreadName());
        }*/
        Runnable target;
        Thread thread = new Thread(new DaemonRunner(),"DaemonRunner" );
        thread.setDaemon(true);
        thread.start();
        try {
            System.out.println(Thread.currentThread().isDaemon());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    static class DaemonRunner implements Runnable {
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("DaemonThread finally run");
            }
        }
    }

    //10-10
      /*public  static String method(List<String> list){
            System.out.println("invoke  method(List<String> list)");
            return "";
      }*/


    public static int method(List<Integer> list) {
        System.out.println("invoke method(List<Integer> list)");
        return 1;
    }
}
