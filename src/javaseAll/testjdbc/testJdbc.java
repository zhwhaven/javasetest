package javaseAll.testjdbc;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//jdbc事务控制
public class testJdbc {
    @Test
    public void test()  {
//        注册驱动
        Class aClass;
        Connection connection = null;
        FileInputStream stream=null;
        PreparedStatement statement=null;
        PreparedStatement statement1=null;
        try {

            aClass = Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql:/test?serverTimezone=GMT%2B8", "root", "1477112645");
//   创建sql
            String sql="insert into photo values(null,?)";
            String sql1="insert ino phot value(null,?)";
            connection.setAutoCommit(false);
//   创建命令

            statement = connection.prepareStatement(sql);
            statement1 = connection.prepareStatement(sql1);
//        找一个图片

            stream = new FileInputStream("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\下.webp");
            statement.setBlob(1,stream);
            statement1.setBlob(1,stream);
            int i = statement.executeUpdate();
            int i1 = statement1.executeUpdate();
            System.out.println(i);
            connection.commit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            System.out.println("wrong");
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                statement1.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
//        获取连接


    }
}
