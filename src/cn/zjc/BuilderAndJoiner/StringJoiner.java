package cn.zjc.BuilderAndJoiner;

public class StringJoiner {

    public StringJoiner(String s) {

    }

    public static void main(String[] args) {

            String[] names = {"Bob", "Alice", "Grace"};
            var sj = new StringJoiner(", ");
            for (String name : names) {
                sj.add(name);
            }
            System.out.println(sj.toString());

    }

    private void add(String name) {

    }

}
