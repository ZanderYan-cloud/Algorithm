package test.cn.csu.sort.impl;

import cn.csu.sort.impl.*;
import cn.csu.util.Stopwatch;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

class SortTest {


    @BeforeEach
    void setUp() {
        a = createRandomArray(20);
        //assert new InsertionSort().isSorted(a);
        show(a);
    }

    @AfterEach
    void tearDown() {
        //assert new InsertionSort().isSorted(a);
        show(a);
    }

    private static final String INSERTION_SORT = "insertion";
    private static final String SELECTION_SORT = "selection";
    private static final String MERGE_SORT = "merge";
    private static final String SHELL_SORT = "shell";
    private static final String SHELL_SORT_Impl = "shellImpl";
    private static final String BUBBLE_SORT = "bubble";
    private static final String QUIK_SORT = "quik";
    private static final String UPGRADE_INSERTION_SORT = "UgrInsertionSort";
    private static final String MOVE_SORT = "MoveSort";


    private Comparable[] a;

    @Test
    void sort() {
        sort(a, MOVE_SORT);
    }


    private void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println("\n");
    }

    private Comparable[] createRandomArray(int len) {
        Random random = new Random(1000);
        Comparable[] a = new Comparable[len];
        for (int i = 0; i < len; i++) {
            a[i] = random.nextInt(200);
        }
        return a;
    }


    void main() {
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int N = random.nextInt(2000);
            int T = random.nextInt(100);
            String alg1 = SELECTION_SORT;
            String alg2 = BUBBLE_SORT;
            double t1 = time(alg1, N, T);
            double t2 = time(alg2, N, T);
            System.out.println("For " + N + " random doubles," + alg1 + " is " + (t2 / t1) + " faster than " + alg2);
        }
    }

    private double time(String alg, int N, int T) {
        Comparable[] a;
        double total = 0.0;
        for (int i = 0; i < T; i++) {
            a = createRandomArray(N);
            total += sort(a, alg);
        }
        return total;
    }

    private double sort(Comparable[] a, String algorithm) {
        Stopwatch timer = new Stopwatch();
        if (INSERTION_SORT.equals(algorithm)) {
            new InsertionSort().sort(a);
        } else if (SELECTION_SORT.equals(algorithm)) {
            new SelectionSort().sort(a);
        } else if (BUBBLE_SORT.equals(algorithm)) {
            new BubbleSort().sort(a);
        } else if (SHELL_SORT.equals(algorithm)) {
            new ShellSort().sort(a);
        } else if (MERGE_SORT.equals(algorithm)) {
            new MergeSort().sort(a);
        } else if (UPGRADE_INSERTION_SORT.equals(algorithm)) {
            new UgrInsertionSort().sort(a);
        } else if (QUIK_SORT.equals(algorithm)) {
            new QuikSort().sort(a);
        } else if (SHELL_SORT_Impl.equals(algorithm)) {
            new ShellSortImpl().sort(a);
        } else if(MOVE_SORT.equals(algorithm)){
            new MoveSort().sort(a);
        }
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i < 20; i++) {
            int lo = random.nextInt(100);
            int hi = random.nextInt(100);
            hi = hi > lo ? hi : lo;
            lo = lo < hi ? lo : hi;
            System.out.print(lo + (hi - lo) / 2);
            System.out.println("  " + (hi + lo) / 2);
        }
    }
}