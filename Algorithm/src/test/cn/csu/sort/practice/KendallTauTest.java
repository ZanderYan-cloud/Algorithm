package test.cn.csu.sort.practice;

import cn.csu.sort.practice.KendallTau;
import org.junit.jupiter.api.Test;

import java.util.Random;

class KendallTauTest {


    @Test
    void kendallTauDistance() {
        //创建数组a和数组b
        Comparable[] a = null;
        Comparable[] b = null;
        createRandomArray(a, 20);
        createRandomArray(b, 20);

        //打印数组
        show(a);
        show(b);

        //计算Kendall Tau距离
        KendallTau kendallTau = new KendallTau();
        System.out.println(kendallTau.KendallTauDistance(a, b));
    }


    private void createRandomArray(Comparable[] a, int len) {
        a = new Comparable[len];
        Random random = new Random(100);
        for (int i = 0; i < len; i++) {
            a[i] = random.nextInt(100);
        }
    }


    private void show(Comparable[] a) {
        for (Comparable comparable : a) {
            System.out.print(comparable + "  ");
        }
        System.out.println("\n");
    }

}