package logicaloperatorvalidator;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             System.out.println("Is Input vaild(true/false)");
             boolean a=sc.nextBoolean();
             System.out.println("Does input meet a certain condition(true/false)");
             boolean b=sc.nextBoolean();
             
             boolean result =isValidInput(a,b);
             
             if(result)
             {
            	 System.out.println("Input is valid");
            	 
             }
             else
             {
            	 System.out.println("Input is Invalid");
          
             }
            	 
             
             
	}
	public static boolean isValidInput(boolean a,boolean b)
	{
		boolean result=a&&b;
		return result;
	}

}
