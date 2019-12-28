package cn.csu.sort.practice;

import cn.csu.sort.Sort;
import cn.csu.sort.impl.InsertionSort;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: RepeatedElem
 * @Description: 找出数组中的重复元素$
 * @Author: Mr.Wang
 * @Date: $
 */
public class RepeatedElem<T extends Comparable<? super T>> {


    private static final Sort SORT = new InsertionSort();

    /**
     * @Author: Bill
     * @Description: 返回数组a中的重复元素集合
     * @Date: 12/28/2019 3:55 PM
     * @name: repeatedElems
     * @param: [a]
     * @return: java.util.List<T>
     */
    public List<T> repeatedElems(T[] a) {
        SORT.sort(a);
        List<T> list = new ArrayList<>(a.length);
        for (int i = 0; i < a.length - 1; i++) {
            boolean flag = false;
            while (0 == a[i].compareTo(a[i + 1]) && i < a.length - 1) {
                flag = true;
                i++;
            }
            if (flag) {
                list.add(a[i]);
            }
        }
        return list;
    }

    /**
     * @Author: Bill
     * @Description: 返回数组a中的重复元素数量
     * @Date: 12/28/2019 3:56 PM
     * @name: repeatedElemSize
     * @param: [a]
     * @return: int
     */
    public int repeatedElemSize(T[] a) {
        return repeatedElems(a).size();
    }

    /**
     * @Author: Bill
     * @Description: 删除数组a中的重复元素
     * @Date: 12/28/2019 3:57 PM
     * @name: deleteRepeatedElem
     * @param: [a]
     * @return: void
     */
    public void deleteRepeatedElem(T[] a) {
        SORT.sort(a);
        for (int i = 0; i < a.length; i++) {
            int j = i + 1;
            while (0 == a[i].compareTo(a[i + 1]) && i < a.length - 1) {
                i++;
            }
            int distance = i + 1 - j;
            move(a,i+1,distance);
        }
    }

    private void move(T[] a, int start, int distance) {
        for (int i = start; i < a.length; i++) {
            a[i - distance] = a[i];
        }
    }
}
