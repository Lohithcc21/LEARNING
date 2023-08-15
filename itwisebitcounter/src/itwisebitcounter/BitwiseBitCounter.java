package itwisebitcounter;

import java.util.Scanner;

public class BitwiseBitCounter {

	public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter a number");
             int a=sc.nextInt();
             int count=0;
             countSetBits(a,count);
             System.out.println( countSetBits(a,count));
             
	}
	public static int countSetBits(int a,int count)
	{
		while(a>0)
		{
			count+=a&1;
			a>>=1;
		}
		return count;
	}

}
