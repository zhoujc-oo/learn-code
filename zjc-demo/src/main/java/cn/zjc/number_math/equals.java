package cn.zjc.number_math;

/**如 Number 对象不为 Null，且与方法的参数类型与数值都相等返回 True，否则返回 False。

 Double 和 Float 对象还有一些额外的条件
 * @Author zhoujc
 * @Date 2021/9/17
 */
public class equals {
    public static void main(String[] args) {

        Integer x = 5;
        Integer y = 10;
        Integer z = 5;
        Short a  = 5;

        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));

    }
}
