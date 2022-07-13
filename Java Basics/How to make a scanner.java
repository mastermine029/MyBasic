/*if you're gonna make a scanner make sure you'll replace the * with a Scanner
at the very top when you use an import java*/

import java.util.Scanner;
class Multiplication{
public static void main(String[]args){
System.out.println("Hello");

//this is how you make a scanner

Scanner input= new Scanner(System.in);

//input is a variable. You can replace it and rename it with other like x,y,z,a,b,c,panga,shing,shang,fu etc.

System.out.println("Enter your first number");

//use a string inside the System method to inform the users what to do

double x=input.nextDouble();

/*after that,you have to make a data type(double) to call your scanner variable(input)
then type ".next" then the data type you used starting with a big letter without space*/

System.out.println("Enter the second number");
double y=input.nextDouble();

//then make the condition
double product=x*y;

System.out.println(area);
}
}