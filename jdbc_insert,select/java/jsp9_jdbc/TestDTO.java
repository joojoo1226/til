package jsp9_jdbc;

// testForm.jsp 페이지에서 입력받은 폼 데이터 저장.
// TestDAO 객체에서 조회된 데이터 저장.
public class TestDTO {

	private int idx;
	private String name;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
