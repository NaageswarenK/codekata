import java.util.*;
import java.lang.*;
import java.io.*;
class numRev
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int rev=0;
		while(num>9){
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		rev=rev*10;
		rev=rev+num;
		System.out.println("Reverse of a number:"+rev);
	}
}
