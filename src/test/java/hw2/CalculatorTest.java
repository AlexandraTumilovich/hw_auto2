package hw2;

import hw2_tumilovich_auto.Calculator;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeClass
    public void beforeTest(){
        calculator = new Calculator();
    }


    @Test
    public void testGetSum(){
        double sum1 = calculator.getSum(3.5, 6.5);
        Assert.assertEquals(sum1, 10);
    }

    @Test
    public void testGetDifference(){
        double diff1 = calculator.getDifference(7,4);
        Assert.assertEquals(diff1, 3);
    }

    @Test
    public void testGetProduct(){
        double product1 = calculator.getProduct(5, 3);
        Assert.assertEquals(product1, 15);
    }

    @Test
    public void testGetQuotient(){
        double q1 = calculator.getQuotient(20, 4);
        Assert.assertEquals(q1, 5);
    }

    @Test
    public void testGetSquare(){
        double sqrt1 = calculator.getSquare(25);
        Assert.assertEquals(sqrt1, 5);
    }
}
