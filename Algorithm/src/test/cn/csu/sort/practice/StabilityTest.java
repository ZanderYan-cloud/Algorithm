package test.cn.csu.sort.practice;

import cn.csu.sort.Sort;
import cn.csu.sort.impl.SelectionSort;
import org.junit.jupiter.api.Test;

/**
 * @ClassName: StabilityTest
 * @Description: 测试排序算法的稳定性$
 * @Author: Mr.Wang
 * @Date: $
 */
public class StabilityTest {

    /**
    *   测试排序算法的稳定性
    *   稳定的排序算法：插入排序    归并排序    冒泡排序
    *   不稳定的排序算法：快速排序   选择排序    希尔排序
    * @Author: Bill
    * @Description: TODO
    * @Date: 12/28/2019 8:05 PM
    * @name: test
    * @param: []
    * @return: void
    */
    @Test
    void test() {
        Tuple[] tuple = new Tuple[18];
        createArray(tuple);
        show(tuple);
        Sort sort = new SelectionSort();
        sort.sort(tuple);
        show(tuple);
    }

    void createArray(Tuple[] a) {
        a[0] = new Tuple("Chicago", "09:00:00");
        a[1] = new Tuple("Phoenix", "09:00:03");
        a[2] = new Tuple("Houston", "09:00:13");
        a[3] = new Tuple("Chicago", "09:00:59");
        a[4] = new Tuple("Houston", "09:01:10");
        a[5] = new Tuple("Chicago", "09:03:13");
        a[6] = new Tuple("Seattle", "09:10:11");
        a[7] = new Tuple("Seattle", "09:10:25");
        a[8] = new Tuple("Phoenix", "09:14:25");
        a[9] = new Tuple("Chicago", "09:19:32");
        a[10] = new Tuple("Chicago", "09:19:46");
        a[11] = new Tuple("Chicago", "09:21:05");
        a[12] = new Tuple("Seattle", "09:22:43");
        a[13] = new Tuple("Seattle", "09:22:54");
        a[14] = new Tuple("Chicago", "09:25:52");
        a[15] = new Tuple("Chicago", "09:35:21");
        a[16] = new Tuple("Seattle", "09:36:14");
        a[17] = new Tuple("Phoenix", "09:37:44");

    }

    private void show(Comparable<Tuple>[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "  ");
        }
        System.out.println("\n");
    }
}


class Tuple implements Comparable<Tuple> {
    @Override
    public String toString() {
        return "Tuple{" +
                "location='" + location + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Tuple() {
    }

    public Tuple(String location, String time) {
        this.location = location;
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String location;
    private String time;

    @Override
    public int compareTo(Tuple o) {
        if (null != o) {
            return this.location.compareTo(o.location);
        }
        throw new NullPointerException();
    }
}
