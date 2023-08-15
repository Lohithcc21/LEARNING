package thecalculatordilemma;

public class TheCalculatorDilemmaApp {
	public void calculator(int a, int b,String operation)
	{
		switch(operation)
		{
		case "add":
			int result=a+b;
			System.out.println(result);
			break;
			
		case "sub":
			int result1=a-b;
			System.out.println(result1);
			break;
			
		case "multi":
			int result2=a*b;
			System.out.println(result2);
			break;
			
		case "div":
			int result3=a/b;
			System.out.println(result3);
			break;
			
		default:
			System.out.println("Invalid Operation");
		
		
		
				
			
		}
	}

}
