import java.util.*;
import java.lang.*;
import java.io.*;
class camelCase
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int flag=0;
		String res="";
		res=res+Character.toUpperCase(str.charAt(0));
		for(int i=2;i<=str.length();i++){
			flag=0;
			if(str.charAt(i-1)==' '){
				flag=1;
			}
			if(flag==1){
				res=res+Character.toUpperCase(str.charAt(i));
				i++;
			}
			else{
				res=res+str.charAt(i-1);
			}
		}
		System.out.println(res);
		
	}
}
