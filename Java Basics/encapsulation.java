/*Take note: Private datas are only accessible by getters and setters.
Setters contain parameters
Getters contain return types*/

public class A{
	private int x=10;
	//start of setter
	public void set X(int a){
		y=a;
	}
	//end of setter
	
	//start of getter
	public int getX(){
		return x;
	}
	//end of getter
}

public class Main{
	A obj=new A();
	public static void main (String[]args){
		obj.set X=20;
		System.out.println(obj.getX());
	}
}