package test;

import com.revature.testing.Calculator;
import com.revature.testing.DivideByZeroException;
import org.junit.After;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    static Calculator calc;

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("This runs before the entire class but only once");
        calc = new Calculator();
    }

    @Before
    public void beforeEach(){
        System.out.println("This runs before each test");
    }
    @After
    public void AfterEach(){
        System.out.println("This runs after each test");
    }

    @Test
    public void positiveAdditionText(){
        System.out.println("testing positive addition test");
        Assert.assertEquals(4, calc.addNumbers(2,2));
    }

    @Test
    public void negativeAdditionTest(){
        System.out.println("Testing Negative addition");
        Assert.assertEquals(2, calc.addNumbers(1,3));
    }

    @Test (expectedExceptions = DivideByZeroException.class)
    public void testDivideByZero(){
        calc.divNumbers(2,0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testIntDivideByZero(){
        calc.divNumbers(1,0);
    }

    @Test
    public void TDDSubtraction(){
        Assert.assertEquals(3, calc.subNumbers(1, 3));
    }

    @Test
    public void negativeTDDSubtraction(){
        Assert.assertNotEquals(3, calc.subNumbers(27, 5));
    }
}

