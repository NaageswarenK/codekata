import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of 1st number");
		int n=sc.nextInt(),i,j;
		int myArray[]=new int[n];
		System.out.println("Enter the number");
		for(i=0;i<n;i++){
			myArray[i]=sc.nextInt();
		}
		System.out.println("Enter the length of 2nd number");
		int n1=sc.nextInt();
		int myArray1[]=new int[n1];
		System.out.println("Enter the number");
		for(i=0;i<n1;i++){
			myArray1[i]=sc.nextInt();
		}
		int sumArray[];
		int temp1,carry=0;
		int index,dif,temp[];
		if(n>n1){
			index=n;
			dif=n-n1;
			temp=new int[index];
			sumArray=new int[index+1];
			for(i=0;i<dif;i++){
				temp[i]=0;
			}
			for(j=0,i=dif;i<index;i++,j++){
				temp[i]=myArray1[j];
			}

			for(i=index-1;i>=0;i--){
				temp1=carry+myArray[i]+temp[i];
				if(i==0){
					if(temp1>9){
						sumArray[i+1]=temp1%10;
						sumArray[i]=temp1/10;
					}
					else
					{
						sumArray[i+1]=temp1;
						sumArray[i]=0;
					}
				}
				else{
					if(temp1>9){
						sumArray[i+1]=temp1%10;
						carry=temp1/10;
					}
					else{
						sumArray[i+1]=temp1;
						carry=0;
					}
					
				}
			}
		}
		else{
			index=n1;
			dif=n1-n;
			temp=new int[index];
			sumArray=new int[index+1];
			for(i=0;i<dif;i++){
				temp[i]=0;
			}
			for(j=0,i=dif;i<index;i++,j++){
				temp[i]=myArray[j];
			}
			for(i=index-1;i>=0;i--){
				temp1=carry+myArray1[i]+temp[i];
				if(i==0){
					if(temp1>9){
						sumArray[i+1]=temp1%10;
						sumArray[i]=temp1/10;
					}
					else
					{
						sumArray[i+1]=temp1;
						sumArray[i]=0;
					}
				}
				else{
					if(temp1>9){
						sumArray[i+1]=temp1%10;
						carry=temp1/10;
					}
					else{
						sumArray[i+1]=temp1;
						carry=0;
					}
					
				}
			}
		}
		for(i=0;i<index+1;i++)
			System.out.print(sumArray[i]);
	}
}
