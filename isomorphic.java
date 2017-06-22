import java.util.*;
import java.lang.*;
import java.io.*;
class isomorphic
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int flag;
		int k=0;
		int l=0;
		if(str.length()==str1.length()){
			char[] a=new char[str.length()];
			char[] a1=new char[str1.length()];
			for(int i=0;i<str.length();i++){
				flag=0;
				for(int j=0;j<k;j++){
					if(str.charAt(i)==a[j]){
						flag=1;
						break;
					}
				}
				if(flag==0){
					a[k]=str.charAt(i);
					k++;
				}
			}
			for(int i=0;i<str1.length();i++){
				flag=0;
				for(int j=0;j<l;j++){
					if(str1.charAt(i)==a1[j]){
						flag=1;
						break;
					}
				}
				if(flag==0){
					a1[l]=str1.charAt(i);
					l++;
				}
			}
			if(l==k){
				for(int i=0;i<k;i++){
					str=str.replace(a[i], a1[i]);
				}
				if(str.equals(str1)){
					System.out.println("true");
				}
				else
					System.out.println("false");
			}
			else
				System.out.println("false");
		}
		else
			System.out.println("false");
	}
}
