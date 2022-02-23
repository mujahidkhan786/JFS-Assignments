class Generic<K,V>{
	K keyK;
	V value;
	public K getKey() {
		return keyK;
	}
	public void setKey(K keyK) {
		this.keyK = keyK;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}
public class GenericsQ4 {
	public static void main(String[] args) {
		Generic<String, String> obj1 = new Generic<>();
		obj1.setKey("1");
		obj1.setValue("Hello"); 
		Generic<String,java.util.Date> obj2 = new Generic<>();
		obj2.setKey("Today is");
		obj2.setValue(new java.util.Date()); 
		System.out.println(obj1.getKey());
		System.out.println(obj1.getValue());
		System.out.println(obj2.getKey()+ obj2.getValue());

	}

}
