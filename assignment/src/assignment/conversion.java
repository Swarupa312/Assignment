package assignment;
import java.util.*;

public class conversion
{
int f,c;
 	public void accept()
 	{
 		Scanner sr=new Scanner(System.in);
 		System.out.println("enetr temperature in celcius");
 		f=sr.nextInt();
 	}
 	public void display()
 	{
 		f=c+32*9/5;
 			System.out.println(f+ " in fahrenheit");
 	}
}

class conversionmain
{
	public static void main(String args[])
	{
		conversion l=new conversion();
		l.accept();
		l.display();
		
	}
}