//This is how you make an array

import java.util.*;
public class Shing{
	public static void main (String[]args){

//this is how you can limit an array. For example i want to limit it for 10

		int[] shang =new int[10];
	
// Take note: Data type [] variable = [value];
// Dont forget the semi colon. Also take note that the square bracket [] is the symbol of an array.

// After doing that thing you can declare of what are the values of the array
	
		shang[0]=23;
		shang[1]=42;
		shang[2]=26; // and so on till....
		shang[9]=2016;
		System.out.println("shang");
		for(int x=0;x<10;x++){
			System.out.println(shang[x]);
		}
		System.out.println();
		System.out.println("Fu");
		System.out.println();
// You cant make int[10]shang because your limit is only up to 10 number and the array starts with number 0 remember that

// You can also simplify it using curly braces{}

		int [] fu = { 13 , 26 , 1 , 27 , 19 , 29, 13 };
/*This count as   	  0    1    2   3    4    5   6
did you get it? Sure you do right?*/
		for(int x=0;x!=10;x++){
			System.out.println(fu[x]);
		}
	}
}