package thecalculatordilemma;

import java.util.Scanner;

public class TheCalculatorDilemma {

	public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the two Numbers");
             int a=sc.nextInt();
             int b=sc.nextInt();
             
             System.out.println("Enter the operation");
             String operation=sc.next();
             
             
             TheCalculatorDilemmaApp d=new  TheCalculatorDilemmaApp();
                 d.calculator(a, b, operation);
                 
          
	}

}
