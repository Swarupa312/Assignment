package assignment;
import java.util.*;

public class leap
{
int y;
 	public void accept()
 	{
 		Scanner sr=new Scanner(System.in);
 		System.out.println("enetr year");
 		y=sr.nextInt();
 	}
 	public void display()
 	{
 		if (y%4==0)
 			System.out.println(y+ " is a leap year");
 		else
 			System.out.println(y+"is not a leap year");
 	}
}

class leapmain
{
	public static void main(String args[])
	{
		leap l=new leap();
		l.accept();
		l.display();
		
	}
}