import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest 
{
	private static Calculator calculator = new Calculator();
	
	@Before
	public void setUp() throws Exception //初始化操作
	{
		calculator.clear();
	}

	@Test
	public void testAdd() //测试加法
	{
		calculator.add(2);
        calculator.add(3);
        assertEquals(5, calculator.getResult());
	}

	@Test
	public void testSubtract() //测试减法
	{
		calculator.add(10);
        calculator.substract(2);
        assertEquals(8, calculator.getResult());
	}

	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() //测试乘法
	{
	}

	@Test
	public void testDivide() //测试除法
    {
        calculator.add(8);
        calculator.divide(2);
        assertEquals(4, calculator.getResult());
    }

    @Test(expected = ArithmeticException.class)
	public void testDivideZero() //测试除法
    {
        calculator.add(8);
        calculator.divide(0);
    }
    
    @Test
    public void testSqare() //测试平方
    {
        calculator.square(4);
        assertEquals(16, calculator.getResult());
    }

    @Test(timeout = 1000)
    public void testSquareRoot()
    {
        calculator.squareRoot(16);
        assertEquals(4, calculator.getResult());
    }
}
