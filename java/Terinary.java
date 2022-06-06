

public class Terinary{
	public static void main(String args[]){

	int a=04;//instance variables
	int b=10;//instance variables
	int x=20;
	int c,d;//instance variables

	c=a>>2;  //A right shift by 2 position
	d=b<<2;	//B left shift by 2 position

	//Terinary Operation

	String Result=(a>=b)?"Using Terinary :A is greater than B":"Using Terinary :B is greater than A";
	System.out.println(Result);

	System.out.println("left shift: "+a);
	System.out.println("Right Shift : "+d);

	
if(a>=b && a>=x && b>=x){

	System.out.println("with && operator : A is greater than B");
}
else{
	System.out.println("with && operator : X is greater than A");
}
int y= a & b; //bitwise operator
System.out.println("bitwise operator: "+y);



	}
}