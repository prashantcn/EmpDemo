class Ifstate{

	public static void main(String a[]){
		int A=-10, B=10, C=50, Large;
//String Name = "Prashant";
//String Last = "CN";

//0
//if (Name == "Prashant" && Last =="CN1"  ){
if (A >= B){
	
	if(A>=C){
Large= A;
	}
	else{
		Large=B;
	}
}

else {
	if(B>=C){
		Large=B;
	}

	//System.out.println(" negetive");
else{
	Large=C;

System.out.println("Largest number = " + Large);
}
}
}
}