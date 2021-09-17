package cn.zjc.number_math;

/**
 *   如果指定的数小于参数返回 -1
 *   如果指定的数与参数相等返回0。
 *   如果指定的数大于参数返回 1
 * @Author zhoujc
 * @Date 2021/9/17
 */
public class CompareTo {
    public static void main(String[] args) {
        Integer x = 5;
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));

        System.out.println(x.compareTo(8));
    }
}
