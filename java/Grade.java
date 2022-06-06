
class Grade
{
	public static void main(String[] args) {
		

		int sub1=30;
		int sub2=50;
		int sub3=70;
		int sub4=50;

		System.out.println("		Name : Prashant CN.		Class: TCE 	Sem:I"		);
		System.out.println("-----------------------------------------------------");
		System.out.println("Marks Obtained in English		: "+sub1);
		System.out.println("Marks Obtained in Mathematics		: "+sub2);
		System.out.println("Marks Obtained in Science		: "+sub3);
		System.out.println("Marks Obtained in Coding		: "+sub4);

		int total2= (sub1+sub2+sub3+sub4);

		System.out.println("Total Marks Obtained 			: " + total2);

		float total=(float)(sub1+sub2+sub3+sub4)/400;
		
		float grade1=total*100;

		System.out.println("Student Grade Obtained  	:" + grade1);

		if(sub1<35 && sub2<35 && sub3<35 && sub4<35){

		

		 if(grade1>=0 && grade1<35){
			System.out.println("Student passing Grade is : F");

		}

		else if(grade1>=35 && grade1<50){
			System.out.println("Student passing  Grade is : C");
		}
		else if(grade1>=50 && grade1<75){
			System.out.println("Student passing  Grade is : B");

		}
		else if(grade1>=75 && grade1<90){
			System.out.println("Student passing  Grade is : A");
		}
		else if(grade1>=90 && grade1<=100){
			System.out.println("Student passing  Grade is : A++");
		}
	}

else{
	System.out.println("Student passing Grade is : F");
}

if (sub1<35 ){
	System.out.println("You have failed in English");
}
else if(sub2<35){
	System.out.println("You have failed in Mathematics");
	}
	else if(sub3<35){
		System.out.println("You have failed in Science");
	}
	else if(sub4<35){
		System.out.println("You have failed in Coding");
	}


		}




		}


