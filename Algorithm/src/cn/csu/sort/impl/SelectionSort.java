package cn.csu.sort.impl;

import cn.csu.sort.Sort;

/**
 * @ClassName: SelectionSort
 * @Description: 选择排序$
 * @Author: Mr.Wang
 * @Date: $
 */
public class SelectionSort extends AbstractSort implements Sort {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N-1; i++) {
            int min=i;
            for (int j = i+1; j < N; j++) {
                if(compare(a,j,min)){
                    min = j;
                }
            }
            if(min != i){
                exch(a,min,i);
            }
        }
    }
}
