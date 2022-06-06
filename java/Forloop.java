class Forloop{//class name
	public static void main(String a[]){//menthod 
		int[] MyArry={22,44,55,66,77};//array

		for (int i=0; i<6; i++)//for loop
		{
			System.out.println(MyArry[i]);//forloop body
			
		}
		for (int newvar : MyArry)//for each loop
		{
			System.out.println(newvar);
		}
		}
	
}