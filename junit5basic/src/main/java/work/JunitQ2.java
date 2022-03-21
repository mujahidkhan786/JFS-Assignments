package work;
	import java.util.*;
	  
	public class JunitQ2{
	    public static void main(String args[]) throws Exception
	    {
	  
	        // getting the array
	        Integer arr[] = { 2, 5, 1, 8, 34, 20, 4 };
	  
	       //printing the array
	        System.out.println("Array: " + Arrays.toString(arr));
	  
	        // getting minimum value using min() method
	        int minArray = Collections.min(Arrays.asList(arr));
	  
	        // getting maximum value using max() method
	        int maxArray
	            = Collections.max(Arrays.asList(arr));
	  
	        // printing the minimum value
	        System.out.println("Minimum value of Array is: "
	                           + minArray);
	  
	        // printing the maximum value
	        System.out.println("Maximum value of Array is: "
	                           + maxArray);
	    }
	        public static String findMinMax2(int[] arr) {
	            int min = (Arrays.stream(arr).min().getAsInt());
	            int max = (Arrays.stream(arr).max().getAsInt());
	            return "Min is "+ min+" Max is "+max;
	        }
	    }
