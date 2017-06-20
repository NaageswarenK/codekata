import java.util.*;
import java.lang.*;
import java.io.*;
class alphabet {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char letter=sc.next().charAt(0);
		if((letter>='a'&&letter<='z')||(letter>='A'&&letter<='Z')){
			System.out.println("Entered Character is Alphabet");
		}
		else{
			System.out.println("Entered Character is not a Alphabet");
		}
	}

}
