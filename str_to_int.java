import java.util.*;
import java.lang.*;
import java.io.*;
class str_to_int
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		int num=0;
		for(int i=0;i<str.length();i++){
			num=num*10;
			num=num+((int)str.charAt(i)-48);
		}
		System.out.println("Integer conversion of a string:"+num);
	}
}
