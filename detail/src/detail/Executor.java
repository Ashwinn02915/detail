package detail;

public class Executor {

	public static void main(String[] args) {
		 
		Base b1 =new Base();
		b1.methodDefault();
		b1.methodPrivate();
		b1.methodPublic();
		b1.varDefault=11;
		b1.methodDefault();
		b1.varProtect =31;
		b1.methodProtect();
		b1.varPublic =41;
		b1.methodPublic();
		//instance of operator
		System.out.println(b1 instanceof Base);//returns true
		
	}

}
