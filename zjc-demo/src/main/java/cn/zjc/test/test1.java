package cn.zjc.test;
import java.sql.Connection;
import java.sql.DriverManager;

public class test1 {
   public static Connection getConn(){
       Connection conn = null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8&autoReconnect=true&rewriteBatchedStatements=TRUE";
           conn=DriverManager.getConnection(url,"root","root");
           System.out.println("获得数据库连接成功");
       }catch (Exception ex){
           ex.printStackTrace();
       }
       return conn;
   }

    public static void main(String[] args) {
        test1.getConn();
    }
}
