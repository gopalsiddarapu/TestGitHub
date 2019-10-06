import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {

	Calculator c=null;
	CalculatorService s=Mockito.mock(CalculatorService.class);
	
	@Before
	public void setUp()
	{
		c=new Calculator(s);
	}
	@Test
	public void test() {
		Mockito.when(s.add(2, 3)).thenReturn(5);
		assertEquals(10,c.perform(2,3));
	}

}
