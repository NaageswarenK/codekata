import java.util.*;
import java.lang.*;
import java.io.*;
class userId
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String a[]=input.split(" ");
		String min,max;
		if(a[0].length()>a[1].length()){
			max=a[0];
			min=a[1];
		}
		else if(a[0].length()<a[1].length()){
			max=a[1];
			min=a[0];
		}
		else if(a[0].charAt(0)>a[1].charAt(0)){
			max=a[0];
			min=a[1];
		}
		else{
			min=a[0];
			max=a[1];
		}
		int index=Integer.parseInt(a[3]);
		String res=max.charAt(0)+min+a[2].charAt(index-1)+a[2].charAt(a[2].length()-index);
		String res1="";
		for( int i=0;i<res.length();i++){
			if(res.charAt(i)>='a'&&res.charAt(i)<='z'){
				res1=res1+Character.toUpperCase(res.charAt(i));
			}
			else if(res.charAt(i)>='A'&&res.charAt(i)<='Z'){
				res1=res1+Character.toLowerCase(res.charAt(i));
			}
			else{
				res1=res1+res.charAt(i);
			}
		}
		System.out.println(res1);
	}
}
