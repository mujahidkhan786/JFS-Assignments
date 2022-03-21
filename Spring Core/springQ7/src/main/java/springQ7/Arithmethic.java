package springQ7;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Arithmethic {
	@Value("#{16 + 4}") // 20
	private double add; 

	@Value("#{'String1 ' + 'string2'}") // "String1 string2"
	private String addString; 

	@Value("#{16 - 4}") // 19
	private double subtract;

	@Value("#{16 * 4}") // 20
	private double multiply;

	@Value("#{16 / 4}") // 19
	private double divide;

	public double getAdd() {
		return add;
	}

	public String getAddString() {
		return addString;
	}

	public double getSubtract() {
		return subtract;
	}

	public double getMultiply() {
		return multiply;
	}

	public double getDivide() {
		return divide;
	}
	
	public String Display() {
		return "SpEL Arithmetic Operators for two numbers 16 and 4 :\n"
				+"Addition : "+getAdd()
				+"\nSubtraction : "+getSubtract()
				+"\nMultiplication : "+getMultiply()
				+"\nDivision : "+getDivide();
	}

}