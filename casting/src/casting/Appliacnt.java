package casting;

public class Appliacnt 
{

	public void display()
	{
		System.out.println("applicant start");
	}
}

 class employee extends Appliacnt
{
	public void display()
	{
		System.out.println("start");
	}
	public void salary()
	{
		System.out.println("salary is:10000");
	}
}
 class Applicant
{
public static void main(String a[])
{
	Appliacnt a1=new Appliacnt();
	employee e1=(employee) a1;
	e1.display();
	//a1.display();
	//a1.salary();
	
}
}

