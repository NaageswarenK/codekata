import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();double sum=0;
		System.out.println("Enter the elements");
		ArrayList<Double> obj=new ArrayList<Double>(n);
		for(int i=0;i<n;i++)
			obj.add(sc.nextDouble());
		for(double i:obj){
			sum=sum+i;
		}
		double avg=sum/n;
		System.out.println("Average of array elements:"+avg);
	}
}
