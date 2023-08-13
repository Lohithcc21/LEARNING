package thestringjoiner;

import java.util.Scanner;

public class StringJoinerApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Name and the Last Name");
		String firstname=sc.next();
		String lastname=sc.next();
		System.out.println(joinStrings(firstname,lastname));
		

	}
	public static String joinStrings(String str1, String str2)
	{
		return(str1+str2);
	}
}
