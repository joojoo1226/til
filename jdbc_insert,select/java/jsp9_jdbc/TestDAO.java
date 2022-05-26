package jsp9_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDAO {

	public int insert(TestDTO dto) throws Exception {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study_jsp2";
		String user = "root";
		String pwd = "1234";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		String sql = "INSERT INTO test3 VALUES (?, ?)";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1, dto.getIdx());
		pstmt.setString(2, dto.getName());
		
		int insertCount = pstmt.executeUpdate();
		
		System.out.println("INSERT 작업 성공! - " + insertCount + "개 레코드");
		
		pstmt.close();
		con.close();
		
		//성공 여부 알려주기
		return insertCount;
	}
	
	public TestDTO selectInfo(int idx) throws Exception {
		
		TestDTO dto = null;
		
		System.out.println("selectInfo() 메서드 호출됨");
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study_jsp2";
		String user = "root";
		String pwd = "1234";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		String sql = "SELECT * FROM test3 WHERE idx=?";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1, idx);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			
//			int id = rs.getInt(1);
//			String name = rs.getString(2);
			
//			System.out.println("번호 : " + rs.getInt("idx"));
//			System.out.println("이름 : " + rs.getString("name"));
//			System.out.println("번호 : " + id);
//			System.out.println("이름 : " + name);
			
			dto = new TestDTO();
			
			dto.setIdx(rs.getInt("idx"));
			dto.setName(rs.getString("name"));
			
		}
		
		rs.close();
		pstmt.close();
		con.close();
		
		return dto;
	}
}
