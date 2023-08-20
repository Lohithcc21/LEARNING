package www.kodnest.dowhileassignment;

public class Demo {

	public static void main(String[] args) {
           int i=1;
           Lohi:do
           {   
        	   int j=1;
        	  Rock: do
        	   {
        		   System.out.print("****");
            	   j++;
            	   break Lohi;
        	   }while(j<=5);
        
	}while(i<=5);

}
}