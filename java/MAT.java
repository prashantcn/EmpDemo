class MAT1{
public static void main(String argh []){
//classname objectname = new classname();
//objectname.methodname();


float a = 10, b = 10;
a+=b;
//System.out.println("a + b = " + (a+b));
//System.out.println("a - b = " + (a - b));
System.out.println("a * b = " + (a * b) );
System.out.println("a / b = " + (a / b));
System.out.println("a % b = " + (a % b));

MAT2 test = new MAT2();
test.xx();
MAT3 test2 = new MAT3();
test2.yy();
}
}
class MAT2{
//public void methodname(){statement}
public void xx(){
float x = 10, y = 10;
{
System.out.println("x + y = " + (x+y));
System.out.println("x - y = " + (x - y));
}
}
}
class MAT3{
public void yy(){
float p=11,q=22;
{	
System.out.println("p + q=" + (p + q));
System.out.println("p / q=" + (p / q));
}
}
}