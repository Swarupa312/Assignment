package assignment;
 class even100 
{
	int sum=0;
 
 	public void display()
 	{
 		for(int i=1;i<=100;i++)
 		{
 			if(i%2==0)
 				System.out.println(i);
 			
 		}

 	}
}
 class even100main
 {
 	public static void main(String args[])
 	{
 		even100 l=new even100();
 		//l.accept();
 		l.display();
 		
 	}
 }