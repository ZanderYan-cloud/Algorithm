package cn.csu.sort.impl;

import cn.csu.sort.Sort;

/**
 * @ClassName: UgrInsertionSort
 * @Description: 改进插入排序，不再交换元素，改为移动元素$
 * @Author: Mr.Wang
 * @Date: $
 */
public class UgrInsertionSort extends AbstractSort implements Sort {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            Comparable t = a[i];
            int j = i - 1;
            for (; j >= 0 && compare(a, i, j); j--) {
            }
            move(a, j + 1, i - 1);
            a[j + 1] = t;
        }
    }

    private void move(Comparable[] a, int from, int to) {
        for (int i = to; i >= from; i--) {
            a[i + 1] = a[i];
        }
    }
}
