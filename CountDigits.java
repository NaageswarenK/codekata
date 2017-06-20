import java.util.*;
import java.lang.*;
import java.io.*;
class CountDigits{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i=0;
		while(num>9){
			num=num/10;
			i++;
		}
		i++;
		System.out.println("Number of digits is "+i);
	}
}
