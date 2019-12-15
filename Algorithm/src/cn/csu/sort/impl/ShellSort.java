package cn.csu.sort.impl;

import cn.csu.sort.Sort;

/**
 * @ClassName: ShellSort
 * @Description: 希尔排序$
 * @Author: Mr.Wang
 * @Date: $
 */
public class ShellSort extends AbstractSort implements Sort {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = h * 3 + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && compare(a, j, j - h); j -= h) {
                    exch(a, j - h, j);
                }
            }
            h = h / 3;
        }
    }
}
