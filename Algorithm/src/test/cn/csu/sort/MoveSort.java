/*
package cn.csu.sort.impl;

import cn.csu.sort.Sort;

import java.util.Arrays;

*/
/**
 * @author yansiju
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/117:36
 *//*

public class MoveSort extends AbstractSort implements Sort {

    @Override
    public void sort(Comparable[] a) {
        int count = 0;
        while (true){
            boolean flag = false;
            for (int i = 0; i < a.length-1; i++) {
                if (!compare(a,i,i+1)) {
                    move(a,i+1);
                    count++;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
            //System.out.println(Arrays.toString(a));
        }
    }

    private  void move(Comparable[] a,int j){
        Comparable temp = a[j];
        System.arraycopy(a, 0, a, 1, j);
        a[0] = temp;
    }
}
*/
