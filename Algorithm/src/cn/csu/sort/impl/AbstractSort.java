package cn.csu.sort.impl;

import cn.csu.sort.Sort;

/**
 * @ClassName: AbstractSort
 * @Description: 抽象排序类，用于实现具体排序类的共有方法，以避免产生重复代码
 * @Author: Mr.Wang
 * @Date: $
 */
public abstract class AbstractSort  implements Sort {

    @Override
    public void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    @Override
    public boolean compare(Comparable[] a, int i, int j) {
        if (a[i].compareTo(a[j]) < 0){
            return true;
        }
        return  false;
    }

    @Override
    public boolean isSorted(Comparable[] a) {
        return false;
    }

    @Override
    public boolean rangeCheck(Comparable[] a, int index) {
        if(index < 0 || index >= a.length){
            return false;
        }
        return  true;
    }
}
