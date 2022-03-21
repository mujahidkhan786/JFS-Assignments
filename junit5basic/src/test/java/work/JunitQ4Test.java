package work;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitQ4Test {
	int m = 10;
    int n = 20;

	@BeforeClass
	public static void printd(){
	        System.out.println("testing started");
	    }

	@AfterClass
	public static void printc(){
        System.out.println("test case completed");
	}

	@Before
    public void setUp() {
        System.out.println("Executing test class");
    }
	
	@After
	public void printall(){
        System.out.println("Finished");
	}
	@Test
	public void add() {
        assertEquals(30,JunitQ4.addition(m,n));
    }
	 @Test
	    public void sub() {
	        assertEquals(-10,JunitQ4.subtraction(m,n));
	 }

}

