package cn.csu.sort.impl;

import cn.csu.sort.Sort;

/**
 * @ClassName: MergeSort
 * @Description: 归并排序$
 * @Author: Mr.Wang
 * @Date: $
 */
public class MergeSort extends AbstractSort implements Sort {


    /**
     * 辅助数组
     */
    private Comparable[] aux;


    @Override
    public void sort(Comparable[] a) {
        sort(a, 0, a.length);
    }

    /**
     * @Author: Bill
     * @Description: 对数组a[low...high]递归地调用sort(Comparable[], int, int)方法进行归并排序
     * @Date: 12/14/2019 8:30 PM
     * @name: sort
     * @param: [a, low, high]
     * @return: void
     */
    private void sort(Comparable[] a, int low, int high) {
        //递归结束条件
        if (high >= low) {
            return;
        }
        int mid = (low + high) / 2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    /**
     * @Author: Bill
     * @Description: 对数组a进行归并
     * @Date: 12/14/2019 8:28 PM
     * @name: merge
     * @param: [a, low, mid,high]
     * @return: void
     */
    private void merge(Comparable[] a, int low, int mid, int high) {
        aux = new Comparable[high - low + 1];
        //将数组赋值到辅助数组
        for (int i = low, k = 0; i <= high; i++, k++) {
            aux[k] = a[i];
        }

        int i = low - 1;
        int j = high + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = aux[--j];
            } else if (j < mid + 1) {
                a[k] = aux[++i];
            } else if (compare(a, i, j)) {
                a[k] = aux[++i];
            } else {
                a[k] = aux[--j];
            }
        }
    }
}
