package thetemperatureconverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("the celsius is ");
        double fahrenheit=sc.nextDouble();
        TemperatureConverter temperatureConverter = new TemperatureConverter();
       double celsius= temperatureConverter. convertFahrenheitToCelsius(fahrenheit);
       System.out.println(celsius);
	}

}
