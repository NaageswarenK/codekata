import java.util.*;
import java.lang.*;
import java.io.*;
class Factorial 
{
	public static void main (String[] args) throws java.lang.Exception
	{	
    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
			fact=fact*i;
		System.out.println("Factorial :"+fact);
	}
}
