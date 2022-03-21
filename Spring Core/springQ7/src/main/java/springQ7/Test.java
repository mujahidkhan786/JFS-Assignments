package springQ7;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("springQ7.xml");
		Arithmethic SpEL = (Arithmethic) context.getBean("Arithmethic");
		System.out.println(SpEL.Display());
		context.close();
	}

}
