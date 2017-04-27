import java.io.*;
class fib
{
int a,b,c,no;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void calc()throws IOException
{
System.out.println("enter a no");
no=Integer.parseInt(br.readLine());
a=0;
b=1;
System.out.println(a);
System.out.println(b);
for(int i=1;i<=no;i++)
{
c=a+b;
a=b;
b=c;
System.out.println(c);
}
}
}
class fibonacci
{
public static void main(String args[])throws IOException
{
fib f1=new fib();
f1.calc();
}
}