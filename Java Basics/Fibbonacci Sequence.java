import java.util.*;
public class Shing{
	public static void main(String[]args){

		int c=0;
		int d=0;
		Scanner input= new Scanner(System.in);
		System.out.print("Input a first number:");
		int a=input.nextInt();
		System.out.print("Input a second number:");
		int b=input.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int x=0 ; x<=5 ; x++){
			d=a+b;
			System.out.println(d);
			c=d;
			a=b;
			b=c;
		}
		System.out.println("Ako po si Cenn Justine Maghacot ng BSCOS302-C gumamit ng Fibbonacci Sequence sa JAVA");
	}
}

