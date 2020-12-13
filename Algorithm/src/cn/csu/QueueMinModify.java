package cn.csu;

import java.util.Arrays;

/**
 * @ClassName: QueueMinModify
 * @Description: $
 * @Author: Mr.Wang
 * @Date: $
 */
public class QueueMinModify {


    public static int queueModify(int[] arr){
        int count = 0;
        int len = arr.length;
        if (len <= 0){
            return 0;
        }
        for (int i = 0; i < len-1; i++) {
            if (arr[i] < arr[i+1]){
                count++;
            }else{
                count = 0;
            }
        }
        return len - (count+1);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,2,4};
        System.out.println(queueModify(arr));
        arr = new int[]{2,3,5,1,4};
        System.out.println(queueModify(arr));
        arr = new int[]{4,2,3,5,1};
        System.out.println(queueModify(arr));
        arr = new int[]{1,2,3,4,5};
        System.out.println(queueModify(arr));
    }
}
