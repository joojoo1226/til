package access_modifier_p1;

public class ParentClass {

	public int publicVar;
	protected int protectedVar;
	int defaultVar;
	private int privateVar;
	
	public void useMember() {
		
		this.publicVar = 10;
		this.protectedVar = 20;
		this.defaultVar = 30;
		this.privateVar = 40;
		
	}
	
}
