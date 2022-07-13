import java.util.*;

//This is how you make a method

//You will only create a class

public class Wafu{

//After that you would make a method name like this one

	static void Name(){
		
//The Name() is my method name. Just make some codes that you want example i like to code a scanner with a conditional statement.
	System.out.println("Dum!Dum!Duuuuuuuuuummmmm!!!!! *insert thunder effects");
		System.out.println("Hello Faggot");
		Scanner Input=new Scanner(System.in);
		System.out.println("What's your name,Faggot!?");
		String a=input.nextLine();
		System.out.println("Are you sure about your name? You can't change it when the game starts. Type 1 to continue or type 0 to change again");
		int Z=Input.nextInt();
		if(Z==1){
		System.out.println("Hello"+""+a+"Faggot");
		} else {
			return a;
			System.out.println("Hello"+""+a+"Faggot");
		}
		
/*This is the part that you're going to call the methods you make
remember you can only place the public static void main(String[]args) at the bottom or top of the methods you made*/
	public static void main(String[]args){

//Just type the name of what you named for those methods

		MainMenu();
	}
}
}