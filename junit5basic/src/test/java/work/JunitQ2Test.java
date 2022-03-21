package work;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;
public class JunitQ2Test {

	@Test
	public void testQ2() {
	JunitQ2  myjunit = new JunitQ2();
	 int result = Collections.min(Arrays.asList(2, 5, 1, 8, 34, 20, 4));
	 
	assertEquals(1 , result);

	}

		@Test
		public void test1() {
			@SuppressWarnings("unused")
			JunitQ2  myjunit1 = new JunitQ2();
			 int result = Collections.max(Arrays.asList(2, 5, 1, 8, 34, 20, 4));
			 
			assertEquals(34 , result);
		}
		
	   

	}

