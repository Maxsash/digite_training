import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.digite.util.JdbcFactory;

public class ResultDemo {
	
	public static void main(String[] args) {
		String sql = "SELECT * FROM customer";
		Connection conn = null;
		
		try {
			conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			ResultSetMetaData meta = rs.getMetaData();
			for (int i=1; i<=meta.getColumnCount(); i++)
				System.out.println(meta.getColumnLabel(i) + "\t");
			System.out.println();
			
			while(rs.next()) {
				for (int i=1; i<=meta.getColumnCount(); i++)
					System.out.print(rs.getString(i) + "\t");
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
