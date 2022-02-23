import java.util.HashSet;
import java.util.Set;

public class CollectionQ2 {

	public static void main(String[] args) {
				
		Set<Integer> obj= new HashSet<>();
		obj.add(10);
		obj.add(11);
		obj.add(12);
		obj.add(13);
		obj.add(14);
		obj.add(15);
		obj.add(16);
		obj.add(17);
		obj.add(18);
		obj.add(19);
		
		System.out.println(obj);
		
		obj.add(14);
		
		System.out.println(obj);

	}

}
