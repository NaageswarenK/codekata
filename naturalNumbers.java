import java.util.*;
import java.lang.*;
import java.io.*;
class naturalNumbers {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of terms");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.println("Sum of "+n+" natural numbers is "+sum);
	}
}
