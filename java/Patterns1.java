import java.io.*;

class Patterns1
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(in);

		System.out.println("Please enter the Pattern number: ");
		String a1= br.readLine();
		int a= Integer.parseInt(a1);

		System.out.println("Enter the Number of Rows/Column: ");
		String n1=br.readLine();
		int n= Integer.parseInt(n1);

	}
}