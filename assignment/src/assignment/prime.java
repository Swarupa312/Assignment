package assignment;
 class prime 
{
	 int cnt=0;
	int sum=0;
 
 	public void display()
 	{
 		for(int i=1;i<=100;i++)
 		{
 			for(int j=1;j<=i;j++)
 			{
 			if(i%j==0)
 				cnt++;
 			}
 			if(cnt==2)
 				System.out.println(i);
 		}

 	}
}
 class primemain
 {
 	public static void main(String args[])
 	{
 		prime l=new prime();
 		//l.accept();
 		l.display();
 		
 	}
 }