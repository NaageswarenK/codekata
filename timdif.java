import java.util.*;
import java.lang.*;
import java.io.*;
class timdif
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		float a[]=new float[3];
		float b[]=new float[3];
		int i;
		Scanner sc=new Scanner(System.in);
		String ftime=sc.next();
		String ltime=sc.next();
		StringTokenizer scan=new StringTokenizer(ftime,":");
		StringTokenizer scan1=new StringTokenizer(ltime,":");
		i=0;
		while(scan.hasMoreTokens()){
			a[i]=Float.parseFloat(scan.nextToken());
			i++;
		}
		i=0;
		while(scan1.hasMoreTokens()){
			b[i]=Float.parseFloat(scan1.nextToken());
			i++;
		}
		float time1=a[0]*60.0f+a[1]+a[2]/60.0f;
		float time2=b[0]*60.0f+b[1]+b[2]/60.0f;
		System.out.println(Math.abs(time1-time2));
	}
}
