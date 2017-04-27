
public class Manager extends Employee//calculate salary
{
int esal;
	Manager(int n, String Ename,int sal)
	{
		super(n, Ename);
		esal=sal;
		// TODO Auto-generated constructor stub
	}
	public void calculate()
	{
		int da=10/100*esal;
		int ta=15/100*esal;
		int total=esal+da-ta;
		System.out.println("salary of "+name1+"is"+total);
	}
}
