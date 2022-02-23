    import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;


	public class GenericsQ3 {
	public static final <T> void swap (T[] s, int i, int j) {
	T t = s[i];
	s[i] = s[j];
	s[j] = t;
	}

	public static final <T> void swap (List<T> l, int i, int j) {
	Collections.<T>swap(l, i, j);
	}

	private static void test() {
	String [] s = {"Hiii", "Mujahid"};
	swap(s, 0, 1);
	System.out.println("s:"+Arrays.toString(s));
	List<String> l = new ArrayList<String>(Arrays.asList(s));
	swap(l, 0, 1);
	System.out.println("l:"+l);
	}
	public static void main(String [] args)
	{
	test();
	}
}
