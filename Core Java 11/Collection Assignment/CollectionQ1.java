import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Details implements Comparable<Details>{
	private String name;
	private String email;
	private String gender;
	
	public Details(String name, String email, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Name:"+name+" Email:"+email+" Gender:"+gender;
	}
	@Override
	public int compareTo(Details d) 
	{
		return this.getName().compareTo(d.getName());
	}
	
}

class phoneNumber implements Comparable<phoneNumber>{
	private long number;

	public phoneNumber(long number) {
		super();
		this.number = number;
	}
	
	public long getNumber() {
		return number;
	}

	public String toString() {
		return String.valueOf(number);
		
	}
	

	@Override
	public int compareTo(phoneNumber ph) {
		
		return this.toString().compareTo(ph.toString());
	}
	
	
}
public class CollectionQ1 {

	public static void main(String[] args) {
		Details Ds1 = new Details("Ayush", "Ay@gmail.com", "Male");
		Details Ds2 = new Details("Afridi", "ak@gmail.com", "Male");
		Details Ds3 = new Details("punit", "pl@gmail.com", "Male");
		Details Ds4 = new Details("jha", "jh@gmail.com", "Male");
		Details Ds5 = new Details("Mujahid", "mk@gmail.com", "Male");
		
		phoneNumber Pn1 = new phoneNumber(9515962631l);
		phoneNumber Pn2 = new phoneNumber(9525962632l);
		phoneNumber Pn3 = new phoneNumber(9535962633l);
		phoneNumber Pn4 = new phoneNumber(9545962634l);
		phoneNumber Pn5 = new phoneNumber(9555962635l);
		
		Map<phoneNumber, Details> map = new TreeMap<>();
		
		map.put(Pn1,Ds1);
		map.put(Pn2,Ds2);
		map.put(Pn3,Ds3);
		map.put(Pn4,Ds4);
		map.put(Pn5,Ds5);
		
	
		Set<Entry<phoneNumber, Details>> entrySet = map.entrySet();

	    int index = 0;
	    for (Entry<phoneNumber, Details> currentEntry :entrySet) {
	        System.out.println("Key at " + index + " : "+ currentEntry.getKey());
			index++;
			}
	    int index2=0;
	    for (Entry<phoneNumber, Details> currentEntry :entrySet) {
	        System.out.println("Value at " + index2 + " : "+ currentEntry.getValue());
			index2++;
			}
	    
        
        for (Entry<phoneNumber, Details> entry : map.entrySet()) {     
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
	    	
	    }
	}

}
