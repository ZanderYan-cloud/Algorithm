package cn.csu.sort.impl;

import cn.csu.sort.Sort;

/**
 * @ClassName: QuikSort
 * @Description: 快速排序$
 * @Author: Mr.Wang
 * @Date: $
 */
public class QuikSort extends AbstractSort implements Sort {

    @Override
    public void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }


    private void sort(Comparable[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = partition(a, low, high);
        sort(a, low, mid - 1);
        sort(a, mid + 1, high);
    }

    private int partition(Comparable[] a, int low, int high) {
        int i = low;
        int j = high + 1;
        while (true) {
            while (compare(a, ++i, low)) {
                if (i == high) {
                    break;
                }
            }
            while (compare(a, low, --j)) {
                if (j == low) {
                    break;
                }
            }
            if (j <= i) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, low, j);
        return j;
    }
}
