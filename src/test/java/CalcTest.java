import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalcTest {
    int a = 2;
    int b = 2;
    @BeforeMethod
    void setUp(){}
    @AfterMethod
    void tearDown(){}

    @Test
    @Ignore
    public void testCalculatorAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        assertEquals(4, result);
        int result2 = calculator.add(2, 5);
        assertEquals(6, result2);
    }

}
