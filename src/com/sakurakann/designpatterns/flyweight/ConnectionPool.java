package com.sakurakann.designpatterns.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.flyweight.
 * User: Administrator.
 * Date: 2017-10-17 15:46.
 * Author: Haiyangp.
 */
public class ConnectionPool {

  private Vector<Connection> pool;

  /*
  可以改为配置文件形式 这里只是示例 可提供修改入口.
   */
  private String url = "jdbc:oracle:thin:@localhost:tnitsora";
  private String username = "scott";
  private String password = "tiger";
  private String driverClassName = "oracle.jdbc.driver.OracleDriver";

  private int poolSize = 100;
  private static ConnectionPool instance = new ConnectionPool();
  /**
   * The Conn.
   */
  Connection conn = null;

  /**
   * Gets instance.
   *
   * @return the instance
   */
  public static ConnectionPool getInstance() {
    return instance;
  }

  private ConnectionPool() {
    super();
    pool = new Vector<Connection>(poolSize);
    for (int i = 0; i < poolSize; i++) {
      try {
        Class.forName(driverClassName);
        conn = DriverManager.getConnection(url, username, password);
        pool.add(conn);
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * 将数据库连接返回到pool中,而不是真的关闭它.
   * @param conn 要返回的数据库连接.
   */
  private synchronized void closeConn(Connection conn) {
    pool.add(conn);
  }

  /**
   * 从数据库连接池中获取数据库连接.
   * @return 数据库连接.
   */
  private synchronized Connection getConnection() {
    if (pool.size() > 0) {
      Connection conn = pool.get(0);
      pool.remove(conn);
      return conn;
    } else {
      return null;
    }
  }

  /**
   * flyweight负责创建和管理享元单元,当一个客户端请求时,flyweight/其实现类需要检查当前对象池中是否有符合条件的对象.
   * 如果有,就返回已经存在的对象,如果没有,则创建一个新对象,flyweight是超类.
   *
   * jdbc连接池是其实现的一种模型.url/driverClassName/username/password/dbname...这些属性对于每个连接来说
   * 都是一样的,所以就适合用享元模式来处理,建立一个flyweightFactory,将上述类似属性作为内部数据,其他作为外部数据.
   * 在方法调用时,当做参数传进来,这样就节省了空间,减少了实例的数量.
   *
   * 同时,对于数据库连接来说也是共同使用的资源,通过享元模式,实现了数据库连接的共享,不需要每一次都重新创建连接,节省了
   * 数据库连接重新创建的开销,提升了系统的性能.
   */

}
