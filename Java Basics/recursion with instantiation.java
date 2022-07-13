// This type of recursion have starting point and ending point

class Recursion{
	public int count(int a, int b){
		System.out.println(a);
		if (a==b){
			return 0;
		}
		a++;
		count (a,b);
		return 0;
	}
}
class Main{
	public static void main (String[] args){
		Recursion r= new Recursion();
		r.count(10,20);
	}
}
/*output
10
11
12
13
14
15
16
17
18
19
20