package cn.csu.sort.impl;

import cn.csu.sort.Sort;

/**
 * @ClassName: BubbleSort
 * @Description: 冒泡排序$
 * @Author: Mr.Wang
 * @Date: $
 */
public class BubbleSort extends AbstractSort implements Sort {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        boolean exchange = true;
        for (int i = 0; exchange && i < N - 1; i++) {
            exchange = false;
            for (int j = 0; j < N - i - 1; j++) {
                if (compare(a, j + 1, j)) {
                    exch(a, j, j + 1);
                    exchange = true;
                }
            }
        }
    }
}
