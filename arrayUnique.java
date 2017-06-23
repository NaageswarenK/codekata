import java.util.*;
import java.lang.*;
import java.io.*;
class arrayUnique
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,j,flag=0,found=0;
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++){
			flag=0;
			for(j=0;j<n;j++){
				if(i!=j&&a[i]==a[j]){
					flag=1;
				}		
			}
			if(flag==0){
				System.out.println(a[i]);
				found=1;
			}
		}
		if(found==0){
			System.out.println("Nil");
		}
		
		
	}
}
