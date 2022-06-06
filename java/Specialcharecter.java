class Specialcharecter{
	public static void main(String args[]){

		char i='/';
		int a=(int) i;

		if ((a>=65 && a<=90)  ||   (a>=97 && a<=122))
		{
		System.out.println(a + "  is a a");
}
else if((a>=33 && a<=47) || (a>=58 && a<=64) || (a>=123 && a<=127)){
		System.out.println(i + "  is a Special Character");
}

 else {
System.out.println(i + "  is not a Special charecter and Alphabet");	
}

		}

	
	}
