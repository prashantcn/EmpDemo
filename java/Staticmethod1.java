class Staticmethod1{


	{
System.out.println("non Static");
	}

	static{
System.out.println("static block");

	}
	Staticmethod1(){

System.out.println("constructor");
	}

	public static void main(String[] args) {
		System.out.println("main");
		//Staticmethod1.obj = new Staticmethod1();
obj.Staticmethod1();
	}

}