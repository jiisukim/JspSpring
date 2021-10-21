package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDriver;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class DBCPInit extends HttpServlet{
	@Override
	public void init() throws ServletException{
		loadJDBCDriver();
		initConnectionPool();
	}
	
	private void loadJDBCDriver() {
		//Connection Pool�� ���ο��� ����� JDBC Driver�� Loading ��
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (ClassNotFoundException e) {
			throw new RuntimeException("JDBC Driver �ε� ����", e);
		}
	}
	
	private void initConnectionPool() {
		try {
			
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521/xe";
		String userId = "board";
		String pw = "java";
		
		//Connection Pool�� ���ο� Connection�� ���� �� ����� Connection Factory�� ����
		//Connection Pool�� Connection ��ü�� ���� ��
		ConnectionFactory connFactory = new DriverManagerConnectionFactory(jdbcUrl,userId,pw);
		//PoolableConnection�� �����.
		//Connection Pool�� Connection ��ü�� ������ PoolableConnection�� �����
		PoolableConnectionFactory poolableConnFactory = new PoolableConnectionFactory(connFactory,null);
		//Connection�� ��밡������ ���� �˻� �� ����� query�� ������
		poolableConnFactory.setValidationQuery("select 1");
		//connection pool�� ���� ���� ����
		GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
		
		//����ִ� connection ��ü�� pool���� ���� �ϴ� �ð� ����(1��/1000��)
		poolConfig.setTimeBetweenEvictionRunsMillis(1000L*60L*5L);
		//Ǯ(�۾���)�� �������� Ŀ�ؼ�(����)�� ��ȿ���� �˻����� ����
		poolConfig.setTestWhileIdle(true);
		//Ŀ�ؼ�(����) �ּ� ����
		poolConfig.setMinIdle(4);
		//Ŀ�ؼ�(����) �ִ� ����
		poolConfig.setMaxTotal(50);
		//Ŀ�ؼ� Ǯ�� ���� ���� ����
		GenericObjectPool<PoolableConnection> connectionPool = new GenericObjectPool<>(poolableConnFactory,poolConfig); //poolableConnFactory�μ��̸� ,poolConfig��
		//PoolableConnectionFactory���� ������ Ŀ�ؼ� Ǯ�� ������
		poolableConnFactory.setPool(connectionPool);	// �μ��� �۾������
		
		//Ŀ�ؼ� Ǯ�� �����ϴ� JDBC����̹� ���
		Class.forName("org.apache.commons.dbcp2.PoolingDriver");
		PoolingDriver driver = (PoolingDriver)DriverManager.getDriver("jdbc:apache:commons:dbcp:");
		
		//Ŀ�ؼ� Ǯ ����̹��� ������ Ŀ�ؼ� Ǯ�� ���
		driver.registerPool("board", connectionPool);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
