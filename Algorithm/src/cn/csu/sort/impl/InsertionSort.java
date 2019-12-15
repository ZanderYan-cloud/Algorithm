package cn.csu.sort.impl;

import cn.csu.sort.Sort;

/**
 * @ClassName: InsertionSort
 * @Description: 选择排序$
 * @Author: Mr.Wang
 * @Date: $
 */
public class InsertionSort extends AbstractSort implements Sort {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && compare(a, j, j - 1); j--) {
                exch(a, j - 1, j);
            }
        }
    }
}