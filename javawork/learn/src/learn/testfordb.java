package learn;

import java.sql.DriverManager;
import java.sql.SQLException;

// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!

public class testfordb {

	public static final String URL = "jdbc:mysql://localhost/studentflat?serverTimezone=UTC&useSSL=false&user=root&password=";

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection(URL);
			System.out.println("成功加载MYSQL驱动");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
