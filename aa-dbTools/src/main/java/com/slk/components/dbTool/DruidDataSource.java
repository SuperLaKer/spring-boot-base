package com.slk.components.dbTool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDataSource {
  public static DataSource getDataSource() throws Exception {
    // 1.导入jar包
    // 2.定义配置文件
    // 3.加载配置文件
    Properties pro = new Properties();
    InputStream is = DruidDataSource.class.getClassLoader().getResourceAsStream("druid.properties");
    pro.load(is);
    DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
    Connection connection = dataSource.getConnection();
    System.out.println(connection);
    connection.close();
    // 4.获取连接池对象
    return dataSource;
    // 5.获取连接
    // Connection conn = ds.getConnection();
  }
}
