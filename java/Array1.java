class Array1
{
 public static void main(String[] args)
 {
 	int [] marks= {65,44,55,66,66}	;
 	String[] sub = {"English", "Mathematics", "Science", "Coding","Social Science"};
 	int sum=0;
 	int j=0;
 	 for(int i=0;i<marks.length && j<5 ;i++,j++)
 {
 	sum=sum+marks[i];

 	System.out.println("Total Marks Obtained in Subject "+ sub[j] +" : "+ marks[i]);

 	 	

 }
 	System.out.println("Total Marks Obtained : "+ sum);
 	float b = sum/5;
 	System.out.println("Average Percentage= "+b);



 if(b>=0 && b<35){
			System.out.println("Student passing Grade is : F");

		}

		else if(b>=35 && b<50){
			System.out.println("Student passing  Grade is : C");
		}
		else if(b>=50 && b<75){
			System.out.println("Student passing  Grade is : B");

		}
		else if(b>=75 && b<90){
			System.out.println("Student passing  Grade is : A");
		}
		else if(b>=90 && b<=100){
			System.out.println("Student passing  Grade is : A++");
		}

		//else{
	//System.out.println("Student passing Grade is : F");
}

	}
 
