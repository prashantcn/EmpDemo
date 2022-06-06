class Dmm{

	static int a=10; //static variable
	int b=30; //instatnce variable

	public static void main(String a[])
{
	Dmm.add();
	new Dmm().sub();
	
}
		
static void add(){ //static method
int b=50;
	 a = a+b;
	System.out.println(a);

}

public void sub(){ //non static method
	int a=10;
	int b=50;
	b= a-b;
	System.out.println(b);
}
}