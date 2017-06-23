import java.util.*;
import java.lang.*;
import java.io.*;
class grandChild
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,j,k=0,count=0;
		String name;
		String[] son=new String[n];
		String[][] family=new String[n][2];
		for(i=0;i<n;i++){
			for(j=0;j<2;j++){
				family[i][j]=sc.next();
			}
		}
		name=sc.next();	
		for(i=0;i<n;i++){
			if(family[i][1].equals(name)){
				son[k]=family[i][0];
				k++;
			}
		}
		for(i=0;i<k;i++){
			for(j=0;j<n;j++){
				if(son[i].equals(family[j][1])){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
