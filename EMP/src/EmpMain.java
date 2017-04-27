import java.util.*;
public class EmpMain
{
	
	public static void main(String args[])
	{
		int a = 0,salary = 0;
		String name = null;
	Scanner scr=new Scanner(System.in);
	//System.out.println("Enetr the employee details ");
	//System.out.println("Enetr the employee no ");
	//a=scr.nextInt();
	//System.out.println("Enetr the employee name ");
	//name=scr.next();
	//Employee e=new Employee(a,name);
	//e.display();
	//System.out.println("Enetr the employee salary ");
	//salary=scr.nextInt();
	Manager m=new Manager(a,name,salary);
	m.calculate();
   
	
	
	}
}
