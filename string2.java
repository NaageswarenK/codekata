import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the string");
		int i,j;
		String[][] array=new String[4][7];
		String[] address=new String[4];
		address[0]="Mr.Jack,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
		address[1]="Ms Jill,Door No 53,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
		address[2]="Mr Holmes,Door No 13,Valmiki Street,32d Main Road,Saidapet,Chennai,Pin-600115";
		address[3]="Mr.Davinci,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
		for(i=0;i<4;i++){
			StringTokenizer scan=new StringTokenizer(address[i],",");
			j=0;
			while(scan.hasMoreTokens()){
					array[i][j]=scan.nextToken();
					j++;
			}
		}
		System.out.println("Names in all addresses");
		for(i=0;i<4;i++){
				System.out.println(array[i][0]);
		}
		System.out.println("Duplicate entry");
		for(i=0;i<4;i++){
			for(j=i+1;j<4;j++){
				int k=1;
				int flag=0;
				while(k<7){
					if(array[i][k].equals(array[j][k])){
						k++;
					}
					else{
						flag=1;
						break;
					}
				}
				if(flag==0){
					//System.out.println("Duplicate Entry");
					System.out.println(array[i][0]+"\n"+array[j][0]);
				}
			}
		}
		System.out.println("Address at Mason street");
		for(i=0;i<4;i++){
			if(array[i][2].equals("Mason Street")){
				for(j=0;j<7;j++){
				  if(array[i][j]!=null)
					System.out.print(array[i][j]+",");
				}
				System.out.println("\n");
			}
		}
		int flag=0;
		for(i=0;i<4;i++){
			flag=0;
			if(array[i][6]==null){
				System.out.print("address");
				System.out.print(i+1);
				System.out.print(" Don't have pincode");
				flag=1;
			}
		}
		if(flag==0)
			System.out.print("All addresses have pincode");
	}
}
