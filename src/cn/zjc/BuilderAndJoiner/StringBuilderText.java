package cn.zjc.BuilderAndJoiner;

public class StringBuilderText {
    public static void main(String[] args) {
        var sb = new StringBuilder(1024);

//        StringBuilder sb = new StringBuilder(1024);
//        for (int i = 0; i < 1000; i++) {
//            sb.append(',');
//            sb.append(i);
//        }
//        String s = sb.toString();

        sb.append("Mr")
        .append("Bod")
        .append("!")
        .insert(0,"Hello");
        System.out.println(sb.toString());
    }
}
