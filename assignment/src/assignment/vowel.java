package assignment;
import java.util.Scanner;
public class vowel
{
	 String c;
 	public void accept()
 	{
 		Scanner sr=new Scanner(System.in);
 		System.out.println("enetr character");
 		c=sr.next();
 	}
 	public void display()
 	{
 		switch(c)
 		{
 		case "a":
 		case "A":		
 				System.out.println("vowel");break;
 		case "e":
 		case "E":		
 				System.out.println("vowel");break;
 		case "i":
 		case "I":		
 				System.out.println("vowel");break;
 		case "o":
 		case "O":		
 				System.out.println("vowel");break;
 		case "U":
 		case "u":		
 				System.out.println("vowel");break;
 		default:		
 				System.out.println("Consosnent");break;
 		}
 	}
}
class vowelmain
{
	public static void main(String args[])
	{
		vowel l=new vowel();
		l.accept();
		l.display();
		
	}
}