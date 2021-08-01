package cn.zjc.mysql;

import java.sql.*;

public class MYsqlTest {


        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost:3306/strutsHibernatemysql";


        static final String USER = "root";
        static final String PASS = "root";

        public static void main(String[] args) {
            Connection conn = null;
            Statement stmt = null;
            try{
                Class.forName(JDBC_DRIVER);

                System.out.println("连接数据库...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);

                System.out.println(" 实例化Statement对象...");
                stmt = conn.createStatement();
                String sql;
                sql = "describe mib.class";
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    int id  = rs.getInt("id");
                    String name = rs.getString("name");
                    String sex = rs.getString("sex");

                    System.out.print("ID: " + id);
                    System.out.print(", 站点名称: " + name);
                    System.out.print(", 站点 sex: " + sex);
                    System.out.print("\n");
                }
                rs.close();
                stmt.close();
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
                System.out.println("error");
                //throw new class ("1002", "sql error");
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                try{
                    if(stmt!=null) stmt.close();
                }catch(SQLException se2){
                }
                try{
                    if(conn!=null) conn.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }
            }
            System.out.println("Goodbye!");
        }
    }




