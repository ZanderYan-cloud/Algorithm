package cn.csu.sort.impl;

import cn.csu.sort.Sort;

/**
 * @ClassName: InsertionSort
 * @Description: 选择排序$
 * @Author: Mr.Wang
 * @Date: $
 */
public class InsertionSort extends AbstractSort implements Sort{

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i-1; j>=0&&compare(a,i,j) ; j--) {
                exch(a,i,j);
            }
        }
    }
}