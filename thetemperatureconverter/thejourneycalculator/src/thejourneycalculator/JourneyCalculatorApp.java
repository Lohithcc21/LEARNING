package thejourneycalculator;

import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
          System.out.println(" Enter the Speed and Time to Calculate The Distance Travelled ");
          double speed=sc.nextDouble();
          double time=sc.nextDouble();
          JourneyCalculator journeyCalculator = new JourneyCalculator();
          System.out.println(journeyCalculator.calculateDistance(speed, time));
          
          
	}

}
