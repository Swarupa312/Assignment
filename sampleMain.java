import java.io.*;
class sampleclass
{ 
	double a=10;
	double b=10;
	String name="swa";
	String name1="swarupa";
	String sub=name1.substring(0,3);
	public void display()
	{
		System.out.println(a==b);
		System.out.println(name.equals(sub));
	}

}

class sampleMain
{
	public static void main(String args[])
	{
		sampleclass s=new sampleclass();//it is created as it needs to assign the default values to the variables and compilor initiates its default construcor to this operation.
		s.display();
		System.out.println(s);
	}
}