import java.util.*;
	public class ExceptionHandlingQ1 
	{
      public static void main(String[] args) 
        {
	      Scanner sc = new Scanner(System.in);
	        try 
	        {
	            System.out.println("Enter First number:");
	            int first_no = sc.nextInt();
	            System.out.println("Enter Second number:");
	            int second_no = sc.nextInt();
	            int res = first_no/second_no;
	            System.out.println("The result is: "+res);
	        } catch (ArithmeticException ae) 
	             {
	            System.out.println(ae.getMessage());
	            ae.printStackTrace();
	             }

	    }


	}
