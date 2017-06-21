import java.util.*;
import java.lang.*;
import java.io.*;
class person{
	private String name;
	private int age;
	private String gender;
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getGender(){
		return gender;
	}
}
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{	Scanner sc=new Scanner(System.in);
		person a=new person();
		System.out.println("Enter name,age,gender of a person");
		a.setName(sc.next());
		a.setAge(sc.nextInt());
		a.setGender(sc.next());
		System.out.println("Person Name:"+a.getName()+"\nPerson Age"+a.getAge()+"\nPerson Gender:"+a.getGender());
		
	}
}
