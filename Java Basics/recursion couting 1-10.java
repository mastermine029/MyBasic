class Recursion{
	int x=1;
	public int count(int a){
		if (a==0){
			return 0;
		}
		System.out.println(x);
		a--;
		x++;
		count (a);
		return 0;
	}
}
class Main{
	public static void main (String [] args){
		Recursion r=new Recursion();
		r.count(10);
	}
}
/*output
1
2
3
4
5
6
7
8
9
10*/