package generic;

/**
 * @description
 * @Author zhoujc
 * @Date 2021/7/31
 */
public class Main {
    public static void main(String[] args) {
      Pair1<Integer> p = new Pair1<Integer>(123,456);
      int n = add(p);
        System.out.println(n);
    }
    static int add(Pair1<? extends Number> p){
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }
}
class Pair1<T> {
    private T first;
    private T last;
    public Pair1(T first, T last) {
        this.first = first;
        this.last = last;
    }
    public T getFirst() {
        return first;
    }
    public T getLast() {
        return last;
    }
}

