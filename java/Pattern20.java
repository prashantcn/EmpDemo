import java.io.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;





public class Pattern20


{
	public static void main(String args[]) throws IOException

{

	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(in);

	System.out.println("Please Enter the numer");
	//System.out.println("Please Enter the age");

	String n =br.readLine();
	int n1=Integer.parseInt(n);
	//String age=br.readLine();
	//System.out.println("Your name and age is: " +name+"  "+age);

		for (int i=1; i<=n1; i++)
	{
	for (int j=1; j<=i; j++)
	{
	System.out.print(j+" ");
	}
	System.out.println();
	}


	}
}