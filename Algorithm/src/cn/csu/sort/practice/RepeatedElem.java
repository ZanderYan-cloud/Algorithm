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
            while (i < a.length - 1 && 0 == a[i].compareTo(a[i + 1])) {
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
    public int deleteRepeatedElem(T[] a) {
        SORT.sort(a);
        int len = a.length;
        for (int i = 0; i < len; ) {
            int j = i + 1;
            //记录是否有相同元素
            boolean flag = false;
            //i一直往前移动，直到0 != a[i].compareTo(a[i + 1]
            while (i < len - 1 && 0 == a[i].compareTo(a[i + 1])) {
                flag = true;
                i++;
            }
            if (flag) {
                //元素往前移动的距离
                int distance = i + 1 - j;
                move(a, i + 1, distance, len);
                //新的数组长度 = 原数组长度 - 元素往前移动的距离
                len -= distance;
                //i从开始移动的第一个元素重新开始进行循环
                i = i + 1 - distance;
            } else {
                i++;
            }
        }
        return len;
    }

    /**
    * @Author: Bill
    * @Description: 将从start索引开始的元素往前移动distance个距离
    * @Date: 12/29/2019 3:16 PM
    * @name: move
    * @param: [a, start, distance, len]
    * @return: void
    */
    private void move(T[] a, int start, int distance, int len) {
        for (int i = start; i < len; i++) {
            a[i - distance] = a[i];
        }
    }

}
