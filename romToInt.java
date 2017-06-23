import java.util.*;
import java.lang.*;
import java.io.*;
class romToInt
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner sc=new Scanner(System.in);
		int n,i,j,k=0,count=0;
		String roman=sc.nextLine();
		roman=roman.toUpperCase();
		int res=0;
		for(i=0;i<roman.length();i++){
			char a=roman.charAt(i);
			switch(a){
			case 'M':
				res+=1000;
				break;
			case 'D':
				res+=500;
				break;
			case 'C':
				res+=100;
				break;
			case 'L':
				res+=50;
				break;
			case 'X':
				res+=10;
				break;
			case 'V':
				res+=5;
				break;
			case 'I':
				res+=1;
				break;

			}
		}
		 	if(roman.contains("IV")){
		        res-=2;
		    }
		 	if(roman.contains("IX")){
		        res-=2;
		 	}
		    if(roman.contains("XL")){
		        res-=20;
		    }
		    if(roman.contains("XC")){
		        res-=20;
		    }
		    if(roman.contains("CD")){
		        res-=200;
		    }
		    if(roman.contains("CM")){
		        res-=200;
		    }	
		    System.out.println(res);
	}
}
