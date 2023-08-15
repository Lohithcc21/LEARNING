package temperatureconversion;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Wellcome to the Temperature Conversation");
              System.out.println("Select a option ");
              System.out.println("1. Convert Celsius to Fahrenheit");
              System.out.println("2. Convert Fahrenheit to Celsius");
              
              System.out.println("Enter the Choice");
              int n=sc.nextInt();
              
              if(n==1)
              {
            	  System.out.println("Enter the Temperature ");
            	  double c=sc.nextDouble();
            	  System.out.println("Enter the temperature is celsius"+c);
            	  double celsius= celsiusToFahrenheit(c);
            	  System.out.println(c+" is equivalent to "+celsius+"");
              }
            	  else {
            		  System.out.println("Enter the temperature");
            		  double f=sc.nextDouble();
            		  System.out.println("Enter the temperature in Fahrenheit"+f);
            		  double fahrenheit=FahrenheitTocelsius(f);
            		  System.out.println(f+"is equivalent to" +fahrenheit+"");
            		  
            	  }       
              
	}

	         public static double celsiusToFahrenheit(double c) {
	                 	double celsius=((c*9/5)+32);
		                       return celsius;
	}
	
	         
	              public static double FahrenheitTocelsius(double f) {
		               double Fahrenheit=(f-32)*5/9;
		                  return Fahrenheit;
	}

}
