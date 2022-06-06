class Sumevenodd
{
	
	public static void main(String args[])
	{
int evensum=0;
int oddsum=0;
int i=0;

while (i<=100)
{
	if(i%2==0){
		evensum+=i;
		
	}
	else{
		oddsum+=i;
		
	}

	i++;
	
	}

	System.out.println("Sum of Even numbers upto 100="+evensum);
	System.out.println("Sum of Odd numbers upto 100="+oddsum);
}



	}