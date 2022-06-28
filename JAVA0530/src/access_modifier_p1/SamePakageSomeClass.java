package access_modifier_p1;

public class SamePakageSomeClass {

	public void useMember() {
		
		ParentClass p = new ParentClass();
		p.publicVar = 10;
		p.protectedVar = 20;
		p.defaultVar = 30;
//		p.privateVar = 40;
		
	}
	
}
