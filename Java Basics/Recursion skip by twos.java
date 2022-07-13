class Recursion{
	public int count(int a, int b){
		if (b==0){
			return 0;
		}
		System.out.println(a);
		a+=2;
		b--;
		count(a,b);
		return 0;
	}
}
class Main{
	public static void main (String[]args){
		Recursion r=new Recursion();
		r.count(10,20);
	}
}