package cn.csu.sort.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName: KendallTau
 * @Description: 计算两个数列的Kendall Tau 距离$
 * @Author: Mr.Wang
 * @date
 * @Date: $
 */
public class KendallTau<T extends Comparable<? super T>> {

    public int KendallTauDistance(T[] a, T[] b) {
        //得到数组a和数组b的倒置序列
        Set<String> setA = inversionSet(a);
        Set<String> setB = inversionSet(b);
        //根据数组a和数组b的倒置序列计算Kendall Tau距离
        return distance(setA, setB);
    }

    private int distance(Set<String> a, Set<String> b) {
        Iterator<String> iteratorA = a.iterator();
        Iterator<String> iteratorB = b.iterator();
        while (iteratorA.hasNext()) {
            String str = iteratorA.next();
            while (iteratorB.hasNext()) {
                String s = iteratorB.next();
                if (null != s && s.equals(str)) {
                    iteratorA.remove();
                    iteratorB.remove();
                    break;
                }
            }
        }
        return a.size() + b.size();
    }


    private Set<String> inversionSet(T[] a) {
        Set<String> set = new HashSet<>(a.length);
        for (int i = 1; i < a.length; i++) {
            T t = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[i].compareTo(a[j]) < 0; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = t;
            set.add(a[j + 1] + "-" + t);
        }
        return set;
    }

}
