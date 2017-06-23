import java.util.*;
import java.lang.*;
import java.io.*;
class firstRepeat
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
			for(j=i+1;j<n;j++){
				if(a[i]==a[j]){
					flag=1;
					break;
				}		
			}
			if(flag==1){
				System.out.println(a[i]);
				found=1;
				break;
			}
		}
		if(found==0){
			System.out.println("Nil");
		}
		
		
	}
}
