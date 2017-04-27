package assignment;
import java.util.*;

public class mergearray 
{
	int a[]=new int[5];
	int b[]=new int[5];
	int c[]=new int[10];
	public void merge()
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sr.nextInt();
		}
		System.out.println("enter the elements");
		for(int i=0;i<b.length;i++)
		{
		b[i]=sr.nextInt();			
		}
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<a.length;j++)
			if(b[i]!=c[j])
			{
				for(int k=5;k<c.length;k++)
					c[k]=b[j];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
	}
}
class mergearrayMain
{
	public static void main(String args[])
	{
		mergearray a=new mergearray();
		a.merge();
	}
}