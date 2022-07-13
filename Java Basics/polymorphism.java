class program{
	public void x(){
		System.out.println("qwertyuiop");
	}
}
class A extends program{
	public void x(){
		System.out.println("QWERTYUIOp");
	}
}
class B extends program{
	public void x(){
		System.out.println("ASDFGHJKL");
	}
}
class C extends program{
	public void x(){
		System.out.println("ZXCVBNM");
	}
}

class Begin{
	public static void main (String[]args){
		program a= new A();
		program b= new B();
		program c= new C();

		a.x();
		b.x();
		c.x();
	}
}