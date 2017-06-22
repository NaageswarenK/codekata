import java.util.*;
import java.lang.*;
import java.io.*;
class primeRange
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		int a[]=new int[2];int flag=0,count=0,i=0;
		Scanner sc=new Scanner(System.in);
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		for(i=a[0];i<=a[1];i++){
			flag=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=1;
				}
			}
			if(flag==0)
				count++;
		}
		System.out.println(count);
		
	}
}
