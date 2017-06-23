import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,k=0,sum1=0,sum2=0;
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int a[]=new int[input.length()];
		for(i=0;i<input.length();i++){
			if(input.charAt(i)>='0'&&input.charAt(i)<='9'){
				a[k]=(int)input.charAt(i)-48;
				k++;
			}
		}
		int max=a[0];
		int min=a[0];
		for(i=1;i<k;i++){
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
		}
		for(i=0;i<k;i++)
			sum1+=a[i]*max;
		do{
			int temp=sum1;
			sum1=0;
			while(temp>0){
				sum1+=temp%10;
				temp/=10;
			}
		}while(sum1>9);
		for(i=0;i<k;i++)
			sum2+=a[i]*min;
		do{
			int temp=sum2;
			sum2=0;
			while(temp>0){
				sum2+=temp%10;
				temp/=10;
			}
		}while(sum2>9);
		if(sum1<sum2){
			System.out.println(sum1*sum1);
		}
		else
			System.out.println(sum2*sum2);
	}
}
