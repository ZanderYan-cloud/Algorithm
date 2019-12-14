package cn.csu.sort;

/**
 * @author Bill
 */
public interface Sort{



        /**
        * @Author: Bill
        * @Description: 对数组a进行排序
        * @Date: 12/14/2019 4:04 PM
        * @name:
        * @param: [a] 待排序的数组
        * @return: void
        **/
        void sort(Comparable[] a);


        /**
        * @Author: Bill
        * @Description: 交换数组中索引为i和索引为j的元素
        * @Date: 12/14/2019 4:06 PM
        * @name:  exch
        * @param:
        * @return:void
        **/
        void exch(Comparable[] a,int i,int j);

        /**
        * @Author: Bill
        * @Description: TODO
        * @Date: 12/14/2019 4:49 PM
        * @name: compare
        * @param: [a, i, j]
        * @return: boolean
        */
        boolean compare(Comparable[] a,int i,int j);

        /**
        * @Author: Bill
        * @Description: 结合compare(Comparable[],int,int)检查数组是否有序。若数组已有序则返回true，否则返回false
        * @Date: 12/14/2019 4:50 PM
        * @name: isSorted
        * @param: [a]
        * @return: boolean
        */
        boolean  isSorted(Comparable[] a);


        /**
        * @Author: Bill
        * @Description: 检查数组索引是否越界。若越界则返回false，否则返回true。
        * @Date: 12/14/2019 4:17 PM
        * @name: rangeCheck
        * @param: [a, index]
         * @param a
         * @param index
        * @return: boolean
        */
        boolean rangeCheck(Comparable[] a,int index);
}