import java.util.*;

public class Wafu{
	static void MainMenu(){

		System.out.println("Bushing!Press 1 to start");
		Scanner qwertyuiop=new Scanner (System.in);
		int QWERTY=qwertyuiop.nextInt();
		if(QWERTY==1){
			Confirmation();
		}else{
			System.out.println("Enter 1 faggot");
			int wafu=qwertyuiop.nextInt();
			if(wafu==1){
				System.out.println("Welcome faggot");
			}else{
				System.out.println("No! You cant get out from this game faggot");
				Confirmation();
		}
	}
	static void Confirmation(){
		System.out.println("How old are you faggot");
		Scanner input=new Scanner (System.in);
		int b=input.nextInt();
		boolean X=true;
		boolean Y=false;
		if(b<=13){
			System.out.println("You're too young too play this game. Are you sure you are able to take the scenario of this game? just type 1 if yes or 0 if no");
			int B=input.nextInt();
			if(B==1){
				System.out.println("Well if you insist");
				Name();
			}else if (B>1){
				System.out.println("So what if you type something greater than 1? Fuck off bro! You're playing the game!");
				Name();
			}else{
				System.out.println("Thank you for answering yes.You may now play the game");
				Name();
		}else{
			System.out.println("Wecome in the Depths Of Hell");
			Name();
		}
	}
	static void Name(){
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
			return;
			System.out.println("Hello"+""+a+"Faggot");
		}
		
	public static void main(String[]args){

		MainMenu();
	}
}
}