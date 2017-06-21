import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		int i=2,flag=1;
		do{
			if(i%num1==0&&i%num2==0){
				flag=0;
				break;
			}
			i++;
		}while(flag==1);
		System.out.println("LCM of two numbers is "+i);
		
		
	}
}
