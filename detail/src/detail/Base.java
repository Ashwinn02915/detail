package detail;

public class Base {
	int varDefault =10;
	public int varPublic =20;
	private int varPrivate = 56;
	protected int varProtect = 78;
	
	void methodDefault() {
		System.out.println("Default access Base Class");
		System.out.println("Default Variable: "+varDefault);
	}
	void methodPublic() {
		System.out.println("Public access Base Class");
		System.out.println("Public Variable: "+varPublic);
	}
	void methodPrivate() {
		System.out.println("Private access Base Class");
		System.out.println("Private Variable: "+varPrivate);
	}
	void methodProtect() {
		System.out.println("Protect access Base Class");
		System.out.println("Protect Variable: "+varProtect);
	}

}
