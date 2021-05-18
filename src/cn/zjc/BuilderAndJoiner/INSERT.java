package cn.zjc.BuilderAndJoiner;

public class INSERT {
    public static void main(String[] args){
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String insert = buildInsertSpl(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary,) VALUSE(?，?，? )";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    private static String buildInsertSpl(String table, String[] fields) {
        return " ";
    }
}
