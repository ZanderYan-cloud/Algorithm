package cn.csu.sort.impl;

import cn.csu.sort.Sort;

/**
 * @ClassName: ShellSortImpl
 * @Description: 改进的希尔排序$
 * @Author: Mr.Wang
 * @Date: $
 */
public class ShellSortImpl extends AbstractSort implements Sort {

    /**
     * @Author: Siju Yan
     * @Description: 改进希尔排序，将元素交换改为移动元素
     * @Date: 12/22/2019 12:53 PM
     * @name: sort
     * @param: [a]
     * @return: void
     */
    @Override
    public void sort(Comparable[] a) {
        int h = 1;
        int length = a.length;
        while (h < length / 3) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < length; i++) {
                int j;
                Comparable t = a[i];
                for (j = i - h; j >= 0 && compare(a, i, j); j -= h) {
                }
                move(a, j + h, i - h, h);
                a[j + h] = t;
            }
            h = h / 3;
        }
    }

    private void move(Comparable[] a, int low, int high, int h) {
        for (int i = high; i >= low; i -= h) {
            a[i + h] = a[i];
        }
    }
}
