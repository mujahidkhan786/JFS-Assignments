import java.util.*;
	class Exception1 {
	    public Exception1(String str) 
	    {}

		public static void solve() throws UnsupportedOperationException 
	    {
	        Scanner sc = new Scanner(System.in);
	        try 
	        {
	            System.out.println("Enter First number:");
	            int first_no = sc.nextInt();
	            System.out.println("Enter Second number:");
	            int second_no = sc.nextInt();
	            if (second_no == 0) 
	            {
	                throw new UnsupportedOperationException("Division by Zero is an invalid operation");
	            }
	            int res = first_no / second_no;
	            System.out.println("The result is:" + res);
	        } catch (UnsupportedOperationException e) 
	        {
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	        } 
	        
	    }
	}
	public class ExceptionHandlingQ2 
	{
	    public static void main(String[] args)  
	    {
	        Exception1.solve();
	    }

	}

