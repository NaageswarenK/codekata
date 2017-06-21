import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=sc.nextLine();
		int num=0,alpha=0,character=0;
		int len=input.length();
		System.out.println(len);
		for(int i=0;i<len;i++){
			if(input.charAt(i)>='0'&&input.charAt(i)<='9'){
				num++;				
			}
			if((input.charAt(i)>='a'&&input.charAt(i)<='z')||(input.charAt(i)>='A'&&input.charAt(i)<='Z')||(input.charAt(i)>='0'&&input.charAt(i)<='9')){
				alpha++;
			}
			if(input.charAt(i)!=' '){
				character++;
			}
		}
		System.out.println("Number of character:"+character+"\nNumber of numbers:"+num+"\nNumber of Alphanumeric:"+alpha);
	}
}
