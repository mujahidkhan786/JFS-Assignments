import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
}
class AnnotationMethod{
	@Test
     void Test() {
    	 System.out.println("Mujahid");
     }
}
public class AnnotationQ1 {
	public static void main(String[] args) {
		AnnotationMethod s = new AnnotationMethod();
		s.Test();
	}
}
