import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to be in a array");
		int n=sc.nextInt(),i;
		int myArray[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++){
			myArray[i]=sc.nextInt();
		}
		int max=myArray[0];
		int min=myArray[0];
		for(i=1;i<n;i++){
			if(max<myArray[i]){
				max=myArray[i];
			}
			if(min>myArray[i]){
				min=myArray[i];
			}
		}
		System.out.println("Highest Number in array:"+max+"\nLowest Number in array:"+min);
		
	}
}
