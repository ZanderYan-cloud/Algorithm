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
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
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
        if (high <= low) {
            return;
        }
        //int mid = (low + high) / 2;
        int mid = low + (high - low) / 2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    /**
     * @Author: Bill
     * @Description: 对数组a[low...mid...high]进行归并
     * @Date: 12/14/2019 8:28 PM
     * @name: merge
     * @param: [a, low, mid,high]
     * @return: void
     */
    private void merge(Comparable[] a, int low, int mid, int high) {
        //将数组赋值到辅助数组
        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > high) {
                a[k] = aux[i++];
            } else if (compare(aux, j, i)) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }
}
