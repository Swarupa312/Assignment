import java.util.*;
public class arrayex 
{
	int[] arr =new int[10];
	public void accept()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println("enetr no");
		Scanner sr=new Scanner(System.in);
		arr[i]=sr.nextInt();
	}
	
	}
	
	public void displayt()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println(arr[i]);
		;
	}
	
	}

}

