package assignment;
import java.util.*;
public class biggest
{
int a,b,c;
	public void accept()
	{
		Scanner sr=new Scanner(System.in);
 		System.out.println("enetr nos");
 		a=sr.nextInt();
 		b=sr.nextInt();
 		c=sr.nextInt();
	}
	
	public void display()
	{
		if(a>b &&  a<c)
	
			System.out.println("greater"+a);
		else if(b>c &&  b<c)
			
			System.out.println("greater"+b);
		else
			
			System.out.println("greater"+c);
		
	}
}
class biggestmain
{
	public static void main(String args[])
	{
		biggest l=new biggest();
		l.accept();
		l.display();
		
	}
}