package assignment;
import java.util.*;
public class perfect 
{
	int no;
	int sum=0;
 	public void accept()
 	{
 		Scanner sr=new Scanner(System.in);
 			System.out.println("enetr number");
 		no=sr.nextInt();
 	}
 	public void display()
 	{
 		for(int i=1;i<=no/2;i++)
 		{
 			if(no%i==0)
 			{
 				sum=sum+i;
 			}
 		}
 		if(no==sum)
 			System.out.println("perfect");
 		else
 			System.out.println("not perfect");
 		
 	}
}
class perfectmain
{
	public static void main(String args[])
	{
		perfect l=new perfect();
		l.accept();
		l.display();
		
	}
}