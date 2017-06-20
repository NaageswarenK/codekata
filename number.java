import java.util.*;
import java.lang.*;
import java.io.*;
class Number{
	public static void main(String[] args)throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the variable");
		int var=sc.nextInt();
		if(var>0){
			System.out.println("Postive Number");
		}
		else if(var<0){
			System.out.println("Negative Number");
		}
		else if(var==0){
			System.out.println("Zero");
		}
	}
}
