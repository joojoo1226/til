package jsp9_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test8_1DAO {

	public int insert(Test8_1DTO dto) throws Exception {
		
		int insertCount = 0;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study_jsp2";
		String user = "root";
		String pwd = "1234";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		String sql="INSERT INTO test8_1 VALUES(?, ?, ?, ?)";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, dto.getName());
		pstmt.setInt(2, dto.getAge());
		pstmt.setString(3, dto.getGender());
		pstmt.setString(4, dto.getHobby());
		
		insertCount = pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		return insertCount;
		
	}
	
	public Test8_1DTO selectInfo(String name) throws Exception {
		
		Test8_1DTO dto1 = null;
		
		System.out.println("selectInfo() 메서드 호출됨");
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study_jsp2";
		String user = "root";
		String pwd = "1234";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		String sql = "SELECT * FROM test8_1 WHERE name=?";

		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, name);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			
			dto1 = new Test8_1DTO();
			
			dto1.setName(rs.getString("name"));
			dto1.setAge(rs.getInt("age"));
			dto1.setGender(rs.getString("gender"));
			dto1.setHobby(rs.getString("hobby"));
			
		}
		
		rs.close();
		pstmt.close();
		con.close();
		
		return dto1;
	}
	
	
	
}
