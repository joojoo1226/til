package access_modifier_p2;

import access_modifier_p1.ParentClass;

public class OtherPackageChildClass extends ParentClass{

	public void useMember() {
		
		this.publicVar = 10;
		this.protectedVar = 20;
//		this.defaultVar = 30;
//		this.privateVar = 40;
		
		ParentClass p = new ParentClass();
		
		p.publicVar = 10;
//		p.protectedVar = 20;
//		p.defaultVar = 30;
//		p.privateVar = 40;
		
	}
	
}
