
class Pattern{
	
	public static void main(String args[]) 
	{


		for(int i=5; i>=1; i--)//outer loop//5//4//3
		{
			for(int j=1; j<=i; j++)// Inner loop
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}