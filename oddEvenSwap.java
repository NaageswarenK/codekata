import java.util.*;
import java.lang.*;
import java.io.*;
class oddEvenSwap
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		int i;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String res=new String();
		String even=new String();
		String odd=new String();
		for(i=0;i<str.length();i++){
			if(i%2==0)
				even=even+str.charAt(i);
			else
				odd=odd+str.charAt(i);
		}
		int k=0,l=0;
		if(str.length()%2==0){
		for(i=0;i<str.length();i++){
			if(i%2==0){
				res=res+odd.charAt(k);
				k++;
			}
			else{
				res=res+even.charAt(l);
				l++;
			}
			
		}
		}
		else{
			for(i=0;i<str.length()-1;i++){
				if(i%2==0){
					res=res+odd.charAt(k);
					k++;
				}
				else{
					res=res+even.charAt(l);
					l++;
				}
				
			}
			if(odd.length()>even.length())
				res=res+odd.charAt(k);
			else
				res=res+even.charAt(l);
		}
		System.out.println(res);
		
		
	}
}
