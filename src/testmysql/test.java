package testmysql;

import java.sql.*;

public class test {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String pwd = "mysql";
			// 加载驱动，这一句也可写为：Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// 建立到MySQL的连接
			Connection conn=null;
			conn = DriverManager.getConnection(url, user, pwd);
			if (conn != null)
				System.out.println("ok");
			else
				System.out.println("no");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.toString());
		}
	}
}