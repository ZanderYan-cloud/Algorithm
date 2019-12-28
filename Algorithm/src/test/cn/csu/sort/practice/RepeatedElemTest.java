package test.cn.csu.sort.practice;

import cn.csu.sort.practice.RepeatedElem;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

class RepeatedElemTest {

    private Comparable[] a;

    @BeforeEach
    void setUp() {
        createRandomArray(a, 20);
        show(a);
    }

    @AfterEach
    void tearDown() {
        show(a);
    }

    @Test
    void repeatedElems() {
        RepeatedElem repeatedElem = new RepeatedElem();
        List<Comparable> list = repeatedElem.repeatedElems(a);
        System.out.println("\n重复元素");
        for (Comparable comparable : list) {
            System.out.print(comparable + " ");
        }
        System.out.println();
    }

    @Test
    void repeatedElemSize() {
    }

    @Test
    void deleteRepeatedElem() {
        RepeatedElem repeatedElem = new RepeatedElem();
        repeatedElem.deleteRepeatedElem(a);
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