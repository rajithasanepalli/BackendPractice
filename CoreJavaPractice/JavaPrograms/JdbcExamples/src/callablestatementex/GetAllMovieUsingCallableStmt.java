package callablestatementex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import jdbcexample.DBConnection;

public class GetAllMovieUsingCallableStmt {
	static Connection conn = null;
	static String sql = "{call GetMovieList()}";

	public static void main(String[] args) {
		conn = DBConnection.getDBConnection();
		if(conn != null) {
			try {
				CallableStatement cstmt = conn.prepareCall(sql);
				ResultSet rs = cstmt.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1) + rs.getString(2));
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
	}

	}

}
