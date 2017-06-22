import java.util.*;
import java.lang.*;
import java.io.*;
class timedif
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		int a[]=new int[3];
		int b[]=new int[3];
		int i;double hour,min,seconds;
		Scanner sc=new Scanner(System.in);
		String ftime=sc.next();
		String ltime=sc.next();
		StringTokenizer scan=new StringTokenizer(ftime,":");
		StringTokenizer scan1=new StringTokenizer(ltime,":");
		i=0;
		while(scan.hasMoreTokens()){
			a[i]=Integer.parseInt(scan.nextToken());
			i++;
		}
		i=0;
		while(scan1.hasMoreTokens()){
			b[i]=Integer.parseInt(scan1.nextToken());
			i++;
		}
		double time1=a[0]*60+a[1]+a[2]/60;
		double time2=b[0]*60+b[1]+b[2]/60;
		if(time1>time2)
			System.out.println(time1-time2);
		else
			System.out.println(time2-time1);
	}
}
