import java.util.Scanner;
class Vowel {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char letter=sc.next().charAt(0);
		if(letter=='a'||letter=='A'||letter=='e'||letter=='E'||letter=='i'||letter=='I'||letter=='o'||letter=='O'||letter=='u'||letter=='U'){
			System.out.println("Entered Character is vowel");
		}
		else{
			System.out.println("Entered Character is not a vowel");
		}
	}

}