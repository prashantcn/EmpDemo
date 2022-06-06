class Pattern3
{
	
	public static void main (String args[])

	{
	//int i,j;
		int a=1;
			for(int i=1; i<=5; i++)//outer loop//5//4//3
		{
			for(int j=1; j<=i; j++,a++)// Inner loop
			{
				System.out.print(a +" ");
			}
			System.out.println();
		}
	}
}