class Ifelse
{
	public static void main(String args[])
	{
int Boy=15;
int Girl=16;


if(Boy>=21 && Girl>=18){
	System.out.println("Conrgatulations! You are eligible for Marriege");
}

if(Boy<21){
	System.out.println("Sorry Boy! You are not eligible for Marriege. you have to wait for:"+(21-Boy)+"Years");
	
}
if(Girl<18){
	System.out.println("Sorry Girl! You are not eligible for Marriege. you have to wait for:"+(18-Girl)+"Years");
}

}
}

