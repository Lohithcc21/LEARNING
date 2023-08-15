package bitwiseswapper;

import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the First Integer");
             int a=sc.nextInt();
             System.out.println("Enter the second Integer");
             int b=sc.nextInt();
             swapUsingBitwise(a,b);
	}
public static void swapUsingBitwise(int a,int b)
{
	a=a^b;
	b=b^a;
	a=a^b;
	System.out.println("After swapping: First="+a+",Second= "+b);
}
}
