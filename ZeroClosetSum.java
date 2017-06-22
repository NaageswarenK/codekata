import java.util.*;
import java.lang.*;
import java.io.*;
class ZeroClosetSum
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,j;
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		int sum=Math.abs(a[0]+a[1]),min=0,min1=1;
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if((Math.abs(a[i]+a[j]))<sum){
					sum=a[i]+a[j];
					min=i;
					min1=j;
				}
				
			}
		}
		System.out.println(a[min]+"\n"+a[min1]);
	}
}
