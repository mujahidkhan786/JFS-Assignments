import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface  Execute{
 	public int Sequence() default 1;
}


class MyClass{
	@Execute(Sequence=2)
	public void myMethod1(){
		System.out.println("Method 1");
	}
	
	@Execute(Sequence=1)
	public void myMethod2(){
		System.out.println("Method 2");
	}
	@Execute(Sequence=3)
	public void myMethod3(){
		System.out.println("Method 3");
	}
	
}
public class AnnotationQ3 {

	public static void main(String[] args) {
		MyClass objClass =new MyClass();
		try {
            Class<MyClass> annotatedClass = MyClass.class;
            Method[] methods = annotatedClass.getDeclaredMethods();
            for(int i=1;i<=3;i++) {
	            for (Method method : methods) {
	               if (method.isAnnotationPresent(Execute.class)) {
	                  Execute sequence = method.getAnnotation(Execute.class);
	                  int num = sequence.Sequence();
	                  if (num==i) {
	                	  method.invoke(objClass);
	                     }
	               }
	            }
            }
         } catch (Exception e) {
            
         }
	}

}