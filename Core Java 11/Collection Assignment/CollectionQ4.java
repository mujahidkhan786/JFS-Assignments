import java.util.LinkedList;
import java.util.List;

public class CollectionQ4 {

	public static void main(String[] args) {
		List<String> date = new LinkedList<>();
		date.add("23-12-2000");
		date.add("23-12-2001");
		date.add("23-12-2002");
		date.add("23-12-2003");
		date.add("23-12-2004");
		date.add("23-12-2005");
		date.add("23-12-2006");
		date.add("23-12-2007");
		date.add("23-12-2008");
		date.add("23-12-2009");
		
		for(String gp : date) 
		{
			String[] strings = gp.split("-");
			if((int)Integer.parseInt(strings[2])%4==0) 
			{
			 if((int)Integer.parseInt(strings[2])%100==0) 
				
				{
				if((int)Integer.parseInt(strings[2])%400==0)
						
						System.out.println("Your Date of Birth is "+gp+" it was a Leap Year");
					else 
					{
						System.out.println("Your Date of Birth is "+gp+" it was not a Leap Year");
					}
				}
				else 
				{
					System.out.println("Your Date of Birth is "+gp+" it was a Leap Year");
				}
				
			}
			else 
			{
				System.out.println("Your Date of Birth is "+gp+" it was not a Leap Year");
			}
		}

	}

}