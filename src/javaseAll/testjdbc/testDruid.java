package javaseAll.testjdbc;

import com.alibaba.druid.pool.DruidDataSource;

public class testDruid {
    public void test(){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("1477112645");
        dataSource.setUrl("jdbc:mysql:/test?serverTimezone=GMT%2B8");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    }
}

