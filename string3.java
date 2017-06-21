import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=sc.nextLine();
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
		if(str1.equals(str2)){
			System.out.println("Two strings are equal");
		}
		else{
			int sum1=0,sum2=0,len1,len2;
		    len1=str1.length();
			for(int i=0;i<len1;i++){
				sum1=sum1+Character.getNumericValue(str1.charAt(i));
			}
			len2=str2.length();
			for(int i=0;i<len2;i++){
				sum2=sum2+Character.getNumericValue(str2.charAt(i));
			}
			if(sum1>sum2)
				System.out.println("1st String is greater");
			else
				System.out.println("2nd String is greater");
		}
	}
}
