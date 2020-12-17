package learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testforother {
	public static final String URL = "jdbc:mysql://localhost/studentflat?serverTimezone=UTC&useSSL=false&user=root&password=";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement sql;
		ResultSet rs;
		try {
//			Class.forName("com.mysql.jdbc.Driver"); // 加载JDBC_MySQL驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
		}
		try {
			con = DriverManager.getConnection(URL); // 连接代码
		} catch (SQLException e) {
		}
		try {
			sql = con.createStatement();
			rs = sql.executeQuery("select * from student"); // 查询mess表
			while (rs.next()) {
				String number = rs.getString(1);
//				String name = rs.getString(2);
//				Date date = rs.getDate(3);
//				float height = rs.getFloat(4);
				System.out.printf("%s\t", number);
//				System.out.printf("%s\t", name);
//				System.out.printf("%s\t", date);
//				System.out.printf("%.2f\n", height);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
