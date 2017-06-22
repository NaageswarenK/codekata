import java.util.*;
import java.lang.*;
import java.io.*;
class StringRev
{
	public static void main (String[] args) throws java.lang.Exception
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		int len=str.length();
		StringBuilder rev=new StringBuilder();
		for(int i=len-1;i>=0;i--)
			rev.append(str.charAt(i));
		System.out.println("Reversed String is :"+rev);
	}
}
